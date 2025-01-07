package Encuesta;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaEncuesta extends JFrame {
    private List<JTextField> camposRespuestas;

    public VentanaEncuesta(Controlador controlador) {
        setTitle("Encuesta ARMY");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Encuesta encuesta = controlador.getEncuesta();
        camposRespuestas = new ArrayList<>();

        // Panel principal con fondo personalizado
        JPanel panelFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon fondo = new ImageIcon("C:\\Users\\naegi\\eclipse-workspace\\ArmyProject\\src\\Encuesta\\fondo.jpg");
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelFondo.setLayout(new BorderLayout());

        // Panel interno para preguntas y respuestas
        JPanel panel = new JPanel();
        panel.setOpaque(false); // Permitir ver el fondo
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Crear los subpaneles para cada pregunta y su campo de respuesta
        for (String pregunta : encuesta.getPreguntas()) {
            JPanel subPanel = new JPanel();
            subPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
            subPanel.setOpaque(false); // Permitir ver el fondo

            JLabel labelPregunta = new JLabel(pregunta);
            JTextField campoRespuesta = new JTextField(20);
            camposRespuestas.add(campoRespuesta);

            subPanel.add(labelPregunta);
            subPanel.add(campoRespuesta);
            panel.add(subPanel);
        }

        // Botón para finalizar la encuesta
        JButton botonFinalizar = new JButton("Finalizar Encuesta");
        botonFinalizar.addActionListener(event -> {
            guardarRespuestas(encuesta); // Guardar las respuestas ingresadas
            controlador.guardarDatos(); // Llama al método del controlador para guardar los datos

            // Mostrar ventana de resultados
            new Resultados(encuesta);

            // Cerrar esta ventana
            dispose();
        });

        // Añadir panel de preguntas al JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false); // Permitir que el fondo sea visible

        // Añadir todo al panel principal con fondo
        panelFondo.add(scrollPane, BorderLayout.CENTER); // Scroll para preguntas largas
        panelFondo.add(botonFinalizar, BorderLayout.SOUTH); // Botón al final

        setContentPane(panelFondo); // Usar el panel personalizado como contenido
        setVisible(true);
    }

    private void guardarRespuestas(Encuesta encuesta) {
        // Guardar las respuestas desde los campos de texto
        for (int i = 0; i < camposRespuestas.size(); i++) {
            String respuesta = camposRespuestas.get(i).getText();
            encuesta.agregarRespuesta(respuesta);
        }
    }
}

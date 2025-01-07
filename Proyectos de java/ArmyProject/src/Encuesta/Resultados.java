package Encuesta;

import javax.swing.*;
import java.awt.*;

public class Resultados extends JFrame {
    public Resultados(Encuesta encuesta) {
        setTitle("Resultados de la Encuesta");
        setSize(600, 400); // Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal con imagen de fondo
        JPanel panelConFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon fondo = new ImageIcon("C:\\Users\\naegi\\eclipse-workspace\\ArmyProject\\src\\Encuesta\\fondo.jpg");
                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this); // Escalar la imagen al tamaño del panel.
            }
        };
        panelConFondo.setLayout(null); // Usamos un layout manual para mayor control.

        // Panel para mostrar los resultados
        JPanel panelResultados = new JPanel();
        panelResultados.setLayout(new BoxLayout(panelResultados, BoxLayout.Y_AXIS));
        panelResultados.setOpaque(false); // Hacer el panel transparente para que se vea el fondo
        panelResultados.setBounds(20, 20, 550, 260); // Posición y tamaño dentro del panel con fondo

        // Mostrar preguntas y respuestas
        for (int i = 0; i < encuesta.getPreguntas().size(); i++) {
            String pregunta = encuesta.getPreguntas().get(i);
            String respuesta = i < encuesta.getRespuestas().size() ? encuesta.getRespuestas().get(i) : "Sin respuesta";

            // Panel para cada pregunta-respuesta
            JPanel panelPregunta = new JPanel(new BorderLayout());
            panelPregunta.setOpaque(false); // Transparente para el fondo
            panelPregunta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Margen interno

            JLabel etiquetaPregunta = new JLabel("<html><b>" + pregunta + "</b></html>");
            etiquetaPregunta.setForeground(Color.BLACK); // Texto negro
            JLabel etiquetaRespuesta = new JLabel("<html>" + respuesta + "</html>");
            etiquetaRespuesta.setForeground(Color.BLACK); // Texto negro

            panelPregunta.add(etiquetaPregunta, BorderLayout.NORTH); // Pregunta arriba
            panelPregunta.add(etiquetaRespuesta, BorderLayout.CENTER); // Respuesta abajo
            panelResultados.add(panelPregunta); // Añadir al panel principal
        }

        // Añadir el panel de resultados con scroll
        JScrollPane scroll = new JScrollPane(panelResultados);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false); // Transparente
        scroll.setBounds(20, 20, 550, 260); // Posición y tamaño del scroll
        panelConFondo.add(scroll); // Añadir al panel con fondo

        // Botón para cerrar la ventana
        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.setBounds(250, 300, 100, 30); // Posición del botón
        botonCerrar.addActionListener(e -> dispose());
        panelConFondo.add(botonCerrar); // Añadir el botón al panel con fondo

        // Añadir el panel con fondo al JFrame
        add(panelConFondo);
        setVisible(true);
    }
}

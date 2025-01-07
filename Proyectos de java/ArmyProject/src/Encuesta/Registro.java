package Encuesta;

import java.awt.Graphics;
import javax.swing.*;

public class Registro extends JFrame {
    public Registro(Controlador controlador) {
        setTitle("Registro de Usuario");
        setSize(400, 300);
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
        setContentPane(panelConFondo); // Establecer el panel con fondo como contenido principal.

        // Añadir los componentes al panel de fondo
        JLabel labelId = new JLabel("ID:");
        labelId.setBounds(30, 30, 100, 30);
        panelConFondo.add(labelId);

        JTextField campoId = new JTextField();
        campoId.setBounds(150, 30, 200, 30);
        panelConFondo.add(campoId);

        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(30, 70, 100, 30);
        panelConFondo.add(labelNombre);

        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(150, 70, 200, 30);
        panelConFondo.add(campoNombre);

        JLabel labelEdad = new JLabel("Edad:");
        labelEdad.setBounds(30, 110, 100, 30);
        panelConFondo.add(labelEdad);

        JTextField campoEdad = new JTextField();
        campoEdad.setBounds(150, 110, 200, 30);
        panelConFondo.add(campoEdad);

        JLabel labelFecha = new JLabel("Fecha de Nacimiento:");
        labelFecha.setBounds(20, 150, 150, 20);
        panelConFondo.add(labelFecha);

        JTextField campoFecha = new JTextField("dd/mm/yyyy");
        campoFecha.setBounds(150, 150, 200, 30);
        panelConFondo.add(campoFecha);

        JButton botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(150, 200, 100, 30);
        panelConFondo.add(botonRegistrar);

        botonRegistrar.addActionListener(e -> {
            try {
                String id = campoId.getText();
                String nombre = campoNombre.getText();
                int edad = Integer.parseInt(campoEdad.getText());
                String fechaNacimiento = campoFecha.getText();

                controlador.registrarUsuario(id, nombre, edad, fechaNacimiento);
                new VentanaEncuesta(controlador).setVisible(true);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error en los datos ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}

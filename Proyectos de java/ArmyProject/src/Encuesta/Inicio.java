package Encuesta;

import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {

    public Inicio() {
        setTitle("Bienvenido a ARMY Encuesta");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana.

        // Panel principal con imagen de fondo
        JPanel panelConFondo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon fondo = new ImageIcon("C:\\Users\\naegi\\eclipse-workspace\\ArmyProject\\src\\Encuesta\\foto.jpg");

                g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this); // Escalar la imagen al tamaño del panel.
            }
        };
        panelConFondo.setLayout(null); // Usamos un layout manual para mayor control.

        // Texto de bienvenida
        JLabel textoBienvenida = new JLabel("¡Bienvenido a ARMY Encuesta!", SwingConstants.CENTER);
        textoBienvenida.setFont(new Font("Arial", Font.BOLD, 20));
        textoBienvenida.setForeground(Color.BLACK);
        textoBienvenida.setBounds(50, 50, 400, 50);
        panelConFondo.add(textoBienvenida);

        // Botón para continuar
        JButton botonContinuar = new JButton("Comenzar");
        botonContinuar.setBounds(200, 300, 100, 30);
        panelConFondo.add(botonContinuar);

        // Acción del botón
        botonContinuar.addActionListener(e -> {
            Controlador controlador = new Controlador(); // Crear una instancia del controlador.
            new Registro(controlador).setVisible(true); // Pasar el controlador a Registro.
            dispose(); // Cerrar la ventana actual.
        });

        // Añadir el panel al JFrame
        add(panelConFondo);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Inicio();
    }
}

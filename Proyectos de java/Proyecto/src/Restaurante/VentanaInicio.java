package Restaurante;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class VentanaInicio extends JFrame {

    public VentanaInicio(Controlador controlador) {
        // Configuración básica de la ventana
        setTitle("Puesto de Comida");
        setSize(500, 400); // Tamaño de la ventana reducido
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        // Ruta de la imagen (asegúrate de que la imagen esté en la carpeta src/Restaurante/)
        String rutaImagen = "src/Restaurante/fondo.jpg"; // Ruta de la imagen

        try {
            // Cargar la imagen desde la ruta
            File archivoImagen = new File(rutaImagen);
            if (archivoImagen.exists()) {
                ImageIcon imagenFondo = new ImageIcon(rutaImagen);
                
                // Reducir el tamaño de la imagen
                Image imagenEscalada = imagenFondo.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                imagenFondo = new ImageIcon(imagenEscalada);

                // Colocar la imagen debajo del botón, pero un poco más cerca
                JLabel labelFondo = new JLabel(imagenFondo);
                labelFondo.setBounds(150, 140, 200, 200); // Ajustar la posición de la imagen
                add(labelFondo);
            } else {
                System.out.println("La imagen no fue encontrada en la ruta especificada.");
            }
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }

        // Etiqueta de bienvenida (ajustada para no ser tapada)
        JLabel etiquetaBienvenida = new JLabel("¡Bienvenido al Puesto de Comida!");
        etiquetaBienvenida.setBounds(50, 20, 300, 30); // Ajustar la posición para que no quede tapada por la imagen
        add(etiquetaBienvenida);

        // Crear el botón para iniciar el registro
        JButton botonRegistro = new JButton("Iniciar Registro");

        // Calcular la posición para centrar el botón y hacerlo un poco más largo
        int botonX = (getWidth() - 250) / 2; // Ancho del botón ajustado
        int botonY = 100; // Posición Y donde quieres que aparezca el botón

        botonRegistro.setBounds(botonX, botonY, 250, 30); // Ancho ajustado a 250
        add(botonRegistro);

        // Acción del botón para abrir la ventana de registro
        botonRegistro.addActionListener(e -> {
            new VentanaRegistro(controlador).setVisible(true); // Hacer visible la ventana de registro
            dispose(); // Cerrar la ventana actual (Ventana de Inicio)
        });
    }

    public static void main(String[] args) {
        // Crear una instancia de la ventana de inicio y hacerla visible
        SwingUtilities.invokeLater(() -> new VentanaInicio(new Controlador()).setVisible(true));
    }
}

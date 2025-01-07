package Restaurante;

import javax.swing.*;

public class VentanaRegistro extends JFrame {
    public VentanaRegistro(Controlador controlador) {
        setTitle("Registro de Usuario");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setBounds(20, 20, 80, 30);
        add(etiquetaNombre);

        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(100, 20, 200, 30);
        add(campoNombre);

        JLabel etiquetaTelefono = new JLabel("Teléfono:");
        etiquetaTelefono.setBounds(20, 60, 80, 30);
        add(etiquetaTelefono);

        JTextField campoTelefono = new JTextField();
        campoTelefono.setBounds(100, 60, 200, 30);
        add(campoTelefono);

        JButton botonRegistrar = new JButton("Registrar");
        botonRegistrar.setBounds(100, 100, 100, 30);
        add(botonRegistrar);

        botonRegistrar.addActionListener(e -> {
            String nombre = campoNombre.getText().trim();
            String telefono = campoTelefono.getText().trim();

            if (nombre.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            controlador.registrarUsuario(nombre, telefono);
            JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.");
            new VentanaPedido(controlador).setVisible(true);
            dispose(); // Cierra la ventana actual
        });
    }
}

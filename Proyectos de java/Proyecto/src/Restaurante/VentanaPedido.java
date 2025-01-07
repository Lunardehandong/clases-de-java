package Restaurante;

import javax.swing.*;

public class VentanaPedido extends JFrame {
    public VentanaPedido(Controlador controlador) {
        setTitle("Pedido");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel etiquetaItem = new JLabel("Agregar Item:");
        etiquetaItem.setBounds(20, 20, 100, 30);
        add(etiquetaItem);

        JTextField campoItem = new JTextField();
        campoItem.setBounds(120, 20, 200, 30);
        add(campoItem);

        JLabel etiquetaPrecio = new JLabel("Precio:");
        etiquetaPrecio.setBounds(20, 60, 100, 30);
        add(etiquetaPrecio);

        JTextField campoPrecio = new JTextField();
        campoPrecio.setBounds(120, 60, 200, 30);
        add(campoPrecio);

        JButton botonAgregar = new JButton("Agregar");
        botonAgregar.setBounds(50, 100, 100, 30);
        add(botonAgregar);

        JButton botonFinalizar = new JButton("Finalizar Pedido");
        botonFinalizar.setBounds(200, 100, 150, 30);
        add(botonFinalizar);

        botonAgregar.addActionListener(e -> {
            String item = campoItem.getText().trim();
            String precioTexto = campoPrecio.getText().trim();

            if (item.isEmpty() || precioTexto.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                double precio = Double.parseDouble(precioTexto);
                controlador.agregarItemPedido(item, precio);
                JOptionPane.showMessageDialog(this, "Item agregado: " + item + " ($" + precio + ")");
                campoItem.setText("");
                campoPrecio.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingrese un precio válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        botonFinalizar.addActionListener(e -> {
            controlador.finalizarPedido();
            new VentanaConfirmacion(controlador).setVisible(true);
            dispose();
        });
    }
}

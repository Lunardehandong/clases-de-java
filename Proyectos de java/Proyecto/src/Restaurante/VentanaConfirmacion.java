package Restaurante;

import javax.swing.*;

public class VentanaConfirmacion extends JFrame {
    public VentanaConfirmacion(Controlador controlador) {
        setTitle("Confirmación");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JTextArea areaResumen = new JTextArea(controlador.obtenerResumenPedido());
        areaResumen.setBounds(20, 20, 340, 100);
        areaResumen.setEditable(false);
        add(areaResumen);

        JButton botonSalir = new JButton("Salir");
        botonSalir.setBounds(150, 130, 100, 30);
        add(botonSalir);

        botonSalir.addActionListener(e -> System.exit(0));
    }
}

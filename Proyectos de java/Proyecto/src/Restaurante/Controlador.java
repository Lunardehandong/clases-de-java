package Restaurante;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private String nombreUsuario;
    private String telefonoUsuario;
    private List<String> itemsPedido;
    private double totalPedido;

    public Controlador() {
        itemsPedido = new ArrayList<>();
        totalPedido = 0.0;
    }

    // Método para registrar el usuario
    public void registrarUsuario(String nombre, String telefono) {
        this.nombreUsuario = nombre;
        this.telefonoUsuario = telefono;
        System.out.println("Usuario registrado: " + nombre + " - Teléfono: " + telefono);
    }

    // Método para iniciar un nuevo pedido
    public void iniciarPedido() {
        itemsPedido.clear();
        totalPedido = 0.0;
        System.out.println("Pedido iniciado.");
    }

    // Método para agregar un ítem al pedido
    public void agregarItemPedido(String item, double precio) {
        itemsPedido.add(item + " - $" + precio);
        totalPedido += precio;
        System.out.println("Item agregado: " + item + " - $" + precio);
    }

    // Método para finalizar el pedido y guardar en archivo de texto
    public void finalizarPedido() {
        System.out.println("Pedido finalizado.");
        String resumenPedido = obtenerResumenPedido();
        
        // Verificar si el archivo existe, si no lo crea
        File archivo = new File("ticket_pedido.txt");
        try (FileWriter writer = new FileWriter(archivo, true)) {
            writer.write(resumenPedido + "\n\n"); // Escribir en el archivo
            System.out.println("Información del pedido guardada en archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    // Método para obtener el resumen del pedido
    public String obtenerResumenPedido() {
        StringBuilder resumen = new StringBuilder();
        resumen.append("Usuario: ").append(nombreUsuario).append("\n");
        resumen.append("Teléfono: ").append(telefonoUsuario).append("\n\n");
        resumen.append("Pedido:\n");
        for (String item : itemsPedido) {
            resumen.append(item).append("\n");
        }
        resumen.append("\nTotal: $").append(totalPedido);
        return resumen.toString();
    }
}

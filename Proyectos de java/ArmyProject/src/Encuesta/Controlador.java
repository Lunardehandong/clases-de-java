package Encuesta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controlador {
    private Usuario usuario;
    private Encuesta encuesta;

    public Controlador() {
        encuesta = new Encuesta();
    }

    public void registrarUsuario(String id, String nombre, int edad, String fechaNacimiento) {
        usuario = new Usuario(id, nombre, edad, fechaNacimiento);
    }

    public Usuario getUsuario() { return usuario; }
    public Encuesta getEncuesta() { return encuesta; }

    public void guardarDatos() {
        File archivo = new File("resultados_encuesta.txt");
        try (FileWriter writer = new FileWriter(archivo, true)) {
            writer.write(usuario.toString() + "\n\n");
            writer.write("Respuestas de la encuesta:\n");
            for (String respuesta : encuesta.getRespuestas()) {
                writer.write("- " + respuesta + "\n");
            }
            writer.write("\n\n");
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}

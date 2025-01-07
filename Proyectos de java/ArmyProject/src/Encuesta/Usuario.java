package Encuesta;

public class Usuario {
    private String id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;

    // Constructor correcto para inicializar los atributos
    public Usuario(String id, String nombre, int edad, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getFechaNacimiento() { return fechaNacimiento; }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad + "\nFecha de Nacimiento: " + fechaNacimiento;
    }
}

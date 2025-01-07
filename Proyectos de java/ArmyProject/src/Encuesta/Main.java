package Encuesta;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Registro ventanaRegistro = new Registro(controlador);
        ventanaRegistro.setVisible(true);
    }
}

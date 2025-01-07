package Restaurante;

public class main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        new VentanaInicio(controlador).setVisible(true);
    }
}

import java.util.Scanner;

public class Validarpassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nick = "admin";
        String password = "1234";
        
        System.out.print("Ingresa tu usuario: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingresa la contraseña: ");
        String ingresa = scanner.nextLine();
        
        // Verificamos si la contraseña ingresada coincide con la correcta
        boolean esCorrecta = ingresa.equals(password);
        boolean name = nombre.equals(nick);
        
        if (name && esCorrecta) {
            System.out.println("Bienvenido al sistema.");
        } else {
            System.out.println("Datos incorrectos.");
        }
    }
}

import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "abc123";
        
        System.out.print("Ingresa la contraseña: ");
        String ingresa = scanner.nextLine();
        
        // Verificamos si la contraseña ingresada coincide con la correcta
        boolean esCorrecta = ingresa.equals(password);
        
        if (esCorrecta) {
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}

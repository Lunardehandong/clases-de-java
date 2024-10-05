import java.util.Scanner;

public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "abc123";
        
        System.out.print("Ingresa la contraseņa: ");
        String ingresa = scanner.nextLine();
        
        // Verificamos si la contraseņa ingresada coincide con la correcta
        boolean esCorrecta = ingresa.equals(password);
        
        if (esCorrecta) {
            System.out.println("Contraseņa correcta.");
        } else {
            System.out.println("Contraseņa incorrecta.");
        }
    }
}

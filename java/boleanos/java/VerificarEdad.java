import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        // Verificamos si la edad es mayor o igual a 18
        boolean Mayor = (edad >= 18);
        
        if (Mayor) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
}

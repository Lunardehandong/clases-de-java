import java.util.Scanner;

public class VerificarParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        // Usamos el operador % para verificar si el número es par
        boolean esPar = (numero % 2 == 0);
        
        if (esPar) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}

import java.util.Scanner;

public class VerificarParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un n�mero: ");
        int numero = scanner.nextInt();
        
        // Usamos el operador % para verificar si el n�mero es par
        boolean esPar = (numero % 2 == 0);
        
        if (esPar) {
            System.out.println("El n�mero es par.");
        } else {
            System.out.println("El n�mero es impar.");
        }
    }
}

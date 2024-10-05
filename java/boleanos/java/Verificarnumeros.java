import java.util.Scanner;

public class Verificarnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        System.out.print("Ingresa otro número: ");
        int num2 = scanner.nextInt();
        
        // Usamos el operador % para verificar si el número es par
        boolean esmultiplo = (numero % num2 == 0);
        
        if (esmultiplo) {
            System.out.println("El primer número es múltiplo del segundo");
        } else {
            System.out.println("El primer número no es múltiplo del segundo");
        }
    }
}

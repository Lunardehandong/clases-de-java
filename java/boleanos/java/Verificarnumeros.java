import java.util.Scanner;

public class Verificarnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un n�mero: ");
        int numero = scanner.nextInt();
        
        System.out.print("Ingresa otro n�mero: ");
        int num2 = scanner.nextInt();
        
        // Usamos el operador % para verificar si el n�mero es par
        boolean esmultiplo = (numero % num2 == 0);
        
        if (esmultiplo) {
            System.out.println("El primer n�mero es m�ltiplo del segundo");
        } else {
            System.out.println("El primer n�mero no es m�ltiplo del segundo");
        }
    }
}

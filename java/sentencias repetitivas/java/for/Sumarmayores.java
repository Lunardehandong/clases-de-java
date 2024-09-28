import java.util.Scanner;

public class Sumarmayores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Bucle para leer 200 números
        for (int i = 1; i <= 200; i++) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            
            // Si el número es mayor que 200, lo sumamos
            if (numero > 200) {
                suma += numero; // Acumular la suma de números mayores a 200
            }
        }
        
        // Imprimir la suma final después del bucle
        System.out.println("La suma de los números mayores a 200 es: " + suma);
    }
}

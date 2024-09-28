import java.util.Scanner;

public class Sumarmayores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Bucle para leer 200 n�meros
        for (int i = 1; i <= 200; i++) {
            System.out.print("Ingresa un n�mero: ");
            int numero = scanner.nextInt();
            
            // Si el n�mero es mayor que 200, lo sumamos
            if (numero > 200) {
                suma += numero; // Acumular la suma de n�meros mayores a 200
            }
        }
        
        // Imprimir la suma final despu�s del bucle
        System.out.println("La suma de los n�meros mayores a 200 es: " + suma);
    }
}

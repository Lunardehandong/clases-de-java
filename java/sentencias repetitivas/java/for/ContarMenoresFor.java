import java.util.Scanner;

public class ContarMenoresFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        // Bucle for para leer 10 n�meros
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa un n�mero: ");
            int numero = scanner.nextInt();
            
            if (numero < 50) {
                contador++; // Contar si el n�mero es menor que 50
            }
        }

        System.out.println("Cantidad de n�meros menores a 50: " + contador);
    }
}

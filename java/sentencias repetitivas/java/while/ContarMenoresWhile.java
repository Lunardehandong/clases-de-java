import java.util.Scanner;

public class ContarMenoresWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int i = 1;

        // Bucle while para leer 10 n�meros
        while (i <= 10) {
            System.out.print("Ingresa un n�mero: ");
            int numero = scanner.nextInt();
            
            if (numero < 50) {
                contador++; // Contar si el n�mero es menor que 50
            }
            i++;
        }

        System.out.println("Cantidad de n�meros menores a 50: " + contador);
    }
}

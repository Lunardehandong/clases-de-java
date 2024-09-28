import java.util.Scanner;

public class ContarMenoresDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int i = 1;

        // Bucle do-while para leer 10 números
        do {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            
            if (numero < 50) {
                contador++; // Contar si el número es menor que 50
            }
            i++;
        } while (i <= 10);

        System.out.println("Cantidad de números menores a 50: " + contador);
    }
}

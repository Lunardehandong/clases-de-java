import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Pedimos al usuario que ingrese un número
        System.out.println("Ingresa un número (negativo para salir): ");
        numero = sc.nextInt();

        // Mientras el número sea mayor o igual a 0, seguimos pidiendo números
        while (numero <= 0) {
            System.out.println("Ingresaste: " + numero);
            // Volvemos a pedir otro número
            numero = sc.nextInt();
        }

        // Mensaje final cuando se ingresa un número negativo
        System.out.println("Saliste del bucle.");
        sc.close();
    }
}

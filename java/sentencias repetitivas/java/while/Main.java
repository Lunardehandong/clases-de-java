import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Pedimos al usuario que ingrese un n�mero
        System.out.println("Ingresa un n�mero (negativo para salir): ");
        numero = sc.nextInt();

        // Mientras el n�mero sea mayor o igual a 0, seguimos pidiendo n�meros
        while (numero <= 0) {
            System.out.println("Ingresaste: " + numero);
            // Volvemos a pedir otro n�mero
            numero = sc.nextInt();
        }

        // Mensaje final cuando se ingresa un n�mero negativo
        System.out.println("Saliste del bucle.");
        sc.close();
    }
}

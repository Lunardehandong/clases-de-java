import java.util.Scanner;

public class Sumarmayores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Usando el bucle for
        for (int i = 1; suma <= 200; i++) {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            suma += numero; // Sumar el número ingresado a la suma acumulada
        }

        // Imprimir la suma total
        System.out.println("La suma total es: " + suma);
    }
}

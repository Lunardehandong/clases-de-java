import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un n�mero
        System.out.print("Ingresa un n�mero: ");
        int numero = scanner.nextInt();
        
        // Verificar si el n�mero es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El n�mero es positivo.");
        } else if (numero < 0) {
            System.out.println("El n�mero es negativo.");
        } else {
            System.out.println("El n�mero es cero.");
        }
        
    }
}

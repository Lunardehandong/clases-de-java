import java.util.Scanner;
public class VerificarPar {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Elije un numero");
       int numero = scanner.nextInt();
        
        boolean esPar = esNumeroPar(numero); // Llamada a la función
        
        if (esPar) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
    
    // Función que verifica si un número es par
    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}

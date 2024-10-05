import java.util.Scanner;
public class VerificarPar {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Elije un numero");
       int numero = scanner.nextInt();
        
        boolean esPar = esNumeroPar(numero); // Llamada a la funci�n
        
        if (esPar) {
            System.out.println("El n�mero es par.");
        } else {
            System.out.println("El n�mero es impar.");
        }
    }
    
    // Funci�n que verifica si un n�mero es par
    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}

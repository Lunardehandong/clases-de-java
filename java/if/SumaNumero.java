import java.util.Scanner;

public class SumaNumero {
    public static void main(String[] args) {
        
      
      int resultado= 0;
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un n�mero
        System.out.print("Ingresa un n�mero: ");
        int numero = scanner.nextInt();
        
         // Pedir al usuario que ingrese un n�mero
        System.out.print("Ingresa un n�mero: ");
        int numero2 = scanner.nextInt();
        
        resultado= numero+numero2;
        
        System.out.print("El resultado es: " + resultado );
        
    }}
import java.util.Scanner;
public class SumarmayoresDoWhile {
    public static void main(String[] args) {
        int suma = 0;

        // Usando do-while para sumar los primeros 5 n�meros naturales
        do {
          Scanner scanner = new Scanner(System.in);
          
          System.out.print("Ingresa un n�mero: ");  
            int numero = scanner.nextInt();
            suma += numero; // Acumular la suma
        } while (suma <= 200);

         System.out.println("La suma total es: " + suma);  
    }
}
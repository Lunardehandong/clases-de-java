import java.util.Scanner;

public class Sumarmayoreswhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        // Usando while para sumar los primeros 5 n�meros naturales
        while (suma <= 200) {
          
           System.out.print("Ingresa un n�mero: ");
            int numero = scanner.nextInt();
            suma += numero; // Acumular la suma
        }
        System.out.println("La suma total es: " + suma);     
        
    }
}

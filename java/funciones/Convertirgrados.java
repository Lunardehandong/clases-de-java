import java.util.Scanner;

public class Convertirgrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa los grados: ");
        double celsius = scanner.nextDouble();
        
         double fahrenheit= cambiargrados(celsius); // Llamada a la funci�n
          System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }
    // Funci�n que calcula el �rea de un c�rculo dado su radio
    public static double cambiargrados(double celsius) {
        return (celsius *9/5) +32;
    }
}
    
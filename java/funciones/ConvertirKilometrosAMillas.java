import java.util.Scanner;

public class ConvertirKilometrosAMillas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia en kilómetros: ");
        double kilometros = scanner.nextDouble();
        
         double millas = cambioktom(kilometros); // Llamada a la función
        System.out.println(kilometros + " kilómetros son " + millas + " millas.");
    }
    // Función que calcula el área de un círculo dado su radio
    public static double cambioktom(double kilometros) {
        return kilometros * 0.621371;
    }
}
    
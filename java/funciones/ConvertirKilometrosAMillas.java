import java.util.Scanner;

public class ConvertirKilometrosAMillas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la distancia en kil�metros: ");
        double kilometros = scanner.nextDouble();
        
         double millas = cambioktom(kilometros); // Llamada a la funci�n
        System.out.println(kilometros + " kil�metros son " + millas + " millas.");
    }
    // Funci�n que calcula el �rea de un c�rculo dado su radio
    public static double cambioktom(double kilometros) {
        return kilometros * 0.621371;
    }
}
    
import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.print("Cual es el radio del circulo?");
       double radio = scanner.nextDouble();
        double area = calcularArea(radio); // Llamada a la funci�n
        System.out.println("El �rea del c�rculo es: " + area);
    }
    
    // Funci�n que calcula el �rea de un c�rculo dado su radio
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
}

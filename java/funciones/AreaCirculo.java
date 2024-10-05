import java.util.Scanner;
public class AreaCirculo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.print("Cual es el radio del circulo?");
       double radio = scanner.nextDouble();
        double area = calcularArea(radio); // Llamada a la función
        System.out.println("El área del círculo es: " + area);
    }
    
    // Función que calcula el área de un círculo dado su radio
    public static double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }
}

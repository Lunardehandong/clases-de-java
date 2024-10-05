import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.print("Cual es la base del triangulo?");
       double base = scanner.nextDouble();
       
       System.out.print("Cual es la altura del triangulo?");
       double altura = scanner.nextDouble();
       
        double area = calcularArea(base,altura); // Llamada a la función
        System.out.println("El área del triangulo es: " + area);
    }
    
    // Función que calcula el área de un círculo dado su radio
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}

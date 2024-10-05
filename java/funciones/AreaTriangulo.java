import java.util.Scanner;
public class AreaTriangulo {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
       System.out.print("Cual es la base del triangulo?");
       double base = scanner.nextDouble();
       
       System.out.print("Cual es la altura del triangulo?");
       double altura = scanner.nextDouble();
       
        double area = calcularArea(base,altura); // Llamada a la funci�n
        System.out.println("El �rea del triangulo es: " + area);
    }
    
    // Funci�n que calcula el �rea de un c�rculo dado su radio
    public static double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }
}

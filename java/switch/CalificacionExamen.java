import java.util.Scanner;

public class Calificacio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu calificación (1-5): ");
        int calificacion = scanner.nextInt();
        
        switch (calificacion) {
            case 6:
                System.out.println("Muy deficiente");
                break;
            case 7:
                System.out.println("Insuficiente");
                break;
            case 8:
                System.out.println("Suficiente");
                break;
            case 9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Calificación no válida.");
        }
    }
}

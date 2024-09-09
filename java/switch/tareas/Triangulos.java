import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (3-6) para la dificultad de un juego: ");
        int dificultad = scanner.nextInt();
        
        switch (dificultad) {
            case 3:
                System.out.println("Elejiste un triangulo ");
                break;
            case 4:
                System.out.println("Elejiste un cuadrado");
                break;
            case 5:
                System.out.println("Elejiste un pentagono");
                break;
            case 6:
                System.out.println("Elejiste un hexagano");
                break;
            default:
                System.out.println("Número no válido.");
        }
    }
}
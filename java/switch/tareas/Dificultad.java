import java.util.Scanner;

public class Dificultad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (1-3) para la dificultad de un juego: ");
        int dificultad = scanner.nextInt();
        
        switch (dificultad) {
            case 1:
                System.out.println("Elejiste facil tu numero fue " + dificultad);
                break;
            case 2:
                System.out.println("Elejiste media tu numero fue " + dificultad);
                break;
            case 3:
                System.out.println("Elejiste dificil tu numero fue " + dificultad);
                break;
            default:
                System.out.println("Número no válido.");
        }
    }
}

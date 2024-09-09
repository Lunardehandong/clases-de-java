import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número (1-5) para elegir un continente: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("América");
                break;
            case 2:
                System.out.println("Europa");
                break;
            case 3:
                System.out.println("Asia");
                break;
            case 4:
                System.out.println("África");
                break;
            case 5:
                System.out.println("Oceanía");
                break;
            default:
                System.out.println("Número no válido.");
        }
    }
}

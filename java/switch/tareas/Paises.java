import java.util.Scanner;

public class Paises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un n�mero (1-5) para elegir un continente: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Am�rica");
                break;
            case 2:
                System.out.println("Europa");
                break;
            case 3:
                System.out.println("Asia");
                break;
            case 4:
                System.out.println("�frica");
                break;
            case 5:
                System.out.println("Ocean�a");
                break;
            default:
                System.out.println("N�mero no v�lido.");
        }
    }
}

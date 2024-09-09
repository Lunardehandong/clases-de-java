import java.util.Scanner;

public class edades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        switch (edad / 10) {
            case 1: // Para edades de 10 a 19
                if (edad <= 12) {
                    System.out.println("Es un niño.");
                } else if (edad <= 17) {
                    System.out.println("Es un adolescente.");
                } else {
                    System.out.println("Es un adulto.");
                }
                break;
            case 2: case 3: case 4: case 5: case 6: // Para edades de 20 a 69
                System.out.println("Es un adulto.");
                break;
            case 7: case 8: case 9: // Para edades de 70 en adelante
                System.out.println("Es un anciano.");
                break;
            default:
                System.out.println("Edad no válida.");
        }
    }
}

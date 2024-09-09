import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el n�mero de la operaci�n (1: Suma, 2: Resta, 3: Multiplicaci�n, 4: Divisi�n): ");
        int operacion = scanner.nextInt();
        System.out.print("Ingresa el primer n�mero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo n�mero: ");
        int num2 = scanner.nextInt();
        
        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operaci�n no v�lida.");
        }
    }
}

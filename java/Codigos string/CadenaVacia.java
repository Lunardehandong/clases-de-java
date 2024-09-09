import java.util.Scanner;

public class CadenaVacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una cadena: ");
        String cadena = scanner.nextLine();
        
        if (cadena.isEmpty()) {
            System.out.println("La cadena está vacía.");
        } else {
            System.out.println("La cadena no está vacía.");
        }
    }
}

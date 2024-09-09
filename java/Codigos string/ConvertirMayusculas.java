import java.util.Scanner;

public class ConvertirMayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe una cadena: ");
        String cadena = scanner.nextLine();
        
        String cadenaMayusculas = cadena.toUpperCase();
        
        System.out.println("Cadena en mayúsculas: " + cadenaMayusculas);
    }
}

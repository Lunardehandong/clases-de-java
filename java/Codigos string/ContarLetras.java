import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        
        System.out.println("La palabra tiene " + palabra.length() + " letras.");
    }
}

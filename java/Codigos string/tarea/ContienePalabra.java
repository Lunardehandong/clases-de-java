import java.util.Scanner;

public class ContienePalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine();
        
        System.out.print("Escribe una palabra: ");
        String palabra = scanner.nextLine();
        
        // Verificar si la frase contiene la palabra de manera manual
        if (frase.indexOf(palabra) >= 0) {
            System.out.println("La frase contiene la palabra.");
        } else {
            System.out.println("La frase no contiene la palabra.");
        }
    }
}

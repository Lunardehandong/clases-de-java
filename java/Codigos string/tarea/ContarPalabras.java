import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = scanner.nextLine();
        
        // Separar la frase en palabras usando el espacio como delimitador
        String[] palabras = frase.split(" ");
        
        // Contar el número de palabras
        int numeroDePalabras = palabras.length;
        
        System.out.println("La frase contiene " + numeroDePalabras + " palabras.");
    }
}

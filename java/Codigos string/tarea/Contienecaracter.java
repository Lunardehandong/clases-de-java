import java.util.Scanner;

public class Contienecaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String caracter = "@";
        
        System.out.print("Escribe tu correo electronico : ");
        String frase = scanner.nextLine();
        

        
        // Verificar si la frase contiene la palabra de manera manual
        if (frase.indexOf(caracter) >= 0) {
            System.out.println("Esta bien escrito.");
        } else {
            System.out.println("El correo no es valido.");
        }
    }
}

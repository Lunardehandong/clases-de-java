import java.util.Scanner;

public class VerificarMayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu nombre en mayusculas: ");
        String nombre = scanner.nextLine();
        
        String nombremayus = nombre.toUpperCase();
        
        if(nombre.equals(nombremayus)){
          System.out.println("Nombre correctamente escrito");
        }else{
          System.out.println("No esta bien escrito");
        }
        
    }
}
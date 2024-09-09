import java.util.Scanner;

public class Verificarpassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu password: ");
        String password = scanner.nextLine();
        System.out.print("Verifica tu password: ");
        String verificacion = scanner.nextLine();
        
        if (password.equals(verificacion)) {
            System.out.println("son iguales.");
        } else {
            System.out.println("Verifica tus datos no son iguales.");
        }
    }
}

import java.util.Scanner;
public class Sumar {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Dame un numero");
       int a  = scanner.nextInt();
       
       System.out.print("Dame otro numero");
      int  b = scanner.nextInt();
       
        int resultado = sumar(a,b); // Llamada a la funci�n
        System.out.println("La suma es: " + resultado);
    }
    
    // Funci�n que suma dos n�meros y devuelve el resultado
    public static int sumar(int a, int b) {
        return a + b;
    }
}

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
      
      int resultado = 0;
         
       // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Porfavor escribe un numero");
        int numero = scanner.nextInt();  
      
        System.out.print("favor de ingresar un valor");
          int num2 = scanner.nextInt();
      
          resultado = numero+num2;
          
          System.out.print("El resultado es:  "  + resultado);
            
    }
}
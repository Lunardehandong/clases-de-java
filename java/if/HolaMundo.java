import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        
       // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
       // Leer un número entero
        System.out.print("Ingresa tu edad porfavor: ");
        int numero = scanner.nextInt();
        
        if(numero<=12){
         System.out.print("Eres un niño"); 
        }else if(numero>= 13 && numero<= 17){
            System.out.print("Eres un adolecente"); 
        } else if(numero>= 18 && numero<= 64){
            System.out.print("Eres un adulto"); 
        } else if(numero>= 65){
            System.out.print("Eres un adulto mayor"); 
        }else{
              System.out.print("Respuesta no valida");
            }
         
}
}
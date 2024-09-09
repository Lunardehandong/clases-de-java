import java.util.Scanner;

public class Ifsclase {
    public static void main(String[] args) {
      
      int resultado = 0;
         
       // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);
       
        
       System.out.println("Elije una opcion ");
       System.out.println("1. Suma");
       System.out.println("2. Resta");
       System.out.println("3. Multiplicacion");
       System.out.println("4 División");
        int opcion = scanner.nextInt();
        
        
        if(opcion==1){
          System.out.print("Elegiste suma");
            
          System.out.print("Porfavor escribe un numero");
          int numero = scanner.nextInt();  
      
         System.out.print("favor de ingresar un valor");
         int num2 = scanner.nextInt();
      
          resultado = numero+num2;
          
          System.out.print("El resultado es:  "  + resultado);
        }else if(opcion==2){
          System.out.print("Elegiste resta");
            
          System.out.print("Porfavor escribe un numero");
          int numero = scanner.nextInt();  
      
         System.out.print("favor de ingresar un valor");
         int num2 = scanner.nextInt();
      
          resultado = numero-num2;
          
          System.out.print("El resultado es:  "  + resultado);
        }else if(opcion==3){
          
          System.out.print("porfavor ingresar dos numeros");
         int num3 = scanner.nextInt();
         
         System.out.print("ingresa otro numero");
         int num4 = scanner.nextInt();
         
         resultado = num3*num4;
         
         System.out.println("el resultado es:  "  + resultado);
        }else if(opcion==4){
          System.out.println("Elegiste division");
          System.out.println("Elije un numero:");
          int num1 = scanner.nextInt();
          
          System.out.println("Elije otro numero:");
          int num2 = scanner.nextInt();
          
          int result=0;
          
          result = num1 % num2;
          
          System.out.println("Tu resultado es " + result);
        } else{
          System.out.println("opcion no valida");
        }
            
    
    
    
    
    
    
    }}
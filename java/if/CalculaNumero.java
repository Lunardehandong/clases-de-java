import java.util.Scanner;

public class CalculaNumero {
    public static void main(String[] args) {
        
      
      int resultado= 0;
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.println("Elije una opción con un numero:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        int numero = scanner.nextInt();
        
        if(numero==1){
          System.out.println("Elegiste suma");
          System.out.println("Elije un numero:");
          int num1 = scanner.nextInt();
          
          System.out.println("Elije otro numero:");
          int num2 = scanner.nextInt();
          
          resultado = num1 + num2;
          
          System.out.println("Tu resultado es " + resultado);
        }else  if(numero==2){
          System.out.println("Elegiste resta");
          System.out.println("Elije un numero:");
          int num1 = scanner.nextInt();
          
          System.out.println("Elije otro numero:");
          int num2 = scanner.nextInt();
          
          resultado = num1 - num2;
          
          System.out.println("Tu resultado es " + resultado);
        }   else  if(numero==3){
          System.out.println("Elegiste multiplicacion");
          System.out.println("Elije un numero:");
          int num1 = scanner.nextInt();
          
          System.out.println("Elije otro numero:");
          int num2 = scanner.nextInt();
          
          resultado = num1 * num2;
          
          System.out.println("Tu resultado es " + resultado);
        }  else  if(numero==4){
          System.out.println("Elegiste division");
          System.out.println("Elije un numero:");
          int num1 = scanner.nextInt();
          
          System.out.println("Elije otro numero:");
          int num2 = scanner.nextInt();
          
          resultado = num1 % num2;
          
          System.out.println("Tu resultado es " + resultado);
        } else{
          System.out.println("opcion no valida");
        }
        
          
          
          
          
          
          
          
          
          
          
          
          
    }}

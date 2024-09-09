import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
      
       // Crear un objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Porfavor escribe tu calificacion");
        int calificacion = scanner.nextInt();  
        
        
        if(calificacion >= 90 && calificacion<=100){
          System.out.print("Excelente");
        }else if(calificacion >= 70 && calificacion<=89){
             System.out.print("Buena");
          }
          else if(calificacion >= 50 && calificacion<=69){
             System.out.print("Regular");
          }else{
             System.out.print("Insuficiente");}
        
    }}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el men�
            System.out.println("---- Menu ----");
            System.out.println("1. Calificaciones");
            System.out.println("2. Celcius");
            System.out.println("3. Area del triangulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = sc.nextInt();

            // Evaluar la opci�n con switch
            switch (opcion) {
                case 1:
                  System.out.println("Dame una calificacion");
                  int calif1=sc.nextInt();
                  
                  System.out.println("Dame una calificacion");
                  int calif2=sc.nextInt();
                  
                  System.out.println("Dame una calificacion");
                  int calif3=sc.nextInt();
                  
                  int resultado= (calif1+calif2+calif3) / 3;
                  
                  System.out.println("El resultado es " + resultado);
                    
                  
                   
                    break;

                case 2:
                  
                  System.out.println("Porfavor ingresa los kilometros a convertir");
                  double Kilometros=sc.nextDouble();
                  
                  double millas = Kilometros * 0.621371;
                  
                  System.out.println("Las millas son " + millas);
                    
                   
                    break;

                case 3:
                  
                  System.out.println("Dame la base del triangulo");
                  double base=sc.nextDouble();
                  
                  System.out.println("Dame la altura del triangulo");
                  double altura=sc.nextDouble();
                  
                  double area= (base * altura) /2;
                  
                  System.out.println("El area es " + area);
                    
                    
                    break;

                case 4:
                  System.out.println("Saliendo del codigo");
                    
                    break;

                default:
                    System.out.println("Opci�n no v�lida. Int�ntalo de nuevo.");
                    break;
            }

            System.out.println(); // Espacio para separar las iteraciones

        } while (opcion != 4);

        System.out.println("�Gracias por usar el codigo!");
    }
}

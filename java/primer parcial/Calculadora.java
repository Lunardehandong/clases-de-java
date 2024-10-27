import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el men�
            System.out.println("---- Menu ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = sc.nextInt();

            // Evaluar la opci�n con switch
            switch (opcion) {
                case 1:
                   
                    break;

                case 2:
                    
                   
                    break;

                case 3:
                    
                    
                    break;

                case 4:
                    
                    
                    break;

                case 5:
                    System.out.println("Saliendo del codigo");
                    break;

                default:
                    System.out.println("Opci�n no v�lida. Int�ntalo de nuevo.");
                    break;
            }

            System.out.println(); // Espacio para separar las iteraciones

        } while (opcion != 5);

        System.out.println("�Gracias por usar el codigo!");
    }
}

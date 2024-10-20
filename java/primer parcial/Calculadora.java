import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("---- Menú Calculadora ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            // Evaluar la opción con switch
            switch (opcion) {
                case 1:
                   
                    break;

                case 2:
                    // Restar
                   
                    break;

                case 3:
                    // Multiplicar
                    
                    break;

                case 4:
                    // Dividir
                    
                    break;

                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println(); // Espacio para separar las iteraciones

        } while (opcion != 5);

        System.out.println("¡Gracias por usar la calculadora!");
    }
}

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            // Men� de opciones
            System.out.println("---- Men� Calculadora ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                // Pedir los n�meros solo si es una operaci�n v�lida
                System.out.print("Ingresa el primer n�mero: ");
                double num1 = sc.nextDouble();
                System.out.print("Ingresa el segundo n�mero: ");
                double num2 = sc.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        // Verificar si el segundo n�mero es 0 antes de dividir
                        if (num2 != 0) {
                            System.out.println("Resultado: " + (num1 / num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre 0.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opci�n no v�lida. Int�ntalo de nuevo.");
            }
            
            System.out.println(); // Espacio para separar las iteraciones

        } while (opcion != 5);

        System.out.println("�Gracias por usar la calculadora!");
    }
}

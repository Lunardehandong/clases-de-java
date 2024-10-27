import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Calcular el promedio de tres números");
            System.out.println("2. Convertir kilómetros a millas");
            System.out.println("3. Calcular el área de un triángulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Calcular el promedio de tres números
                    System.out.print("Introduce el primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    double num2 = sc.nextDouble();
                    System.out.print("Introduce el tercer número: ");
                    double num3 = sc.nextDouble();
                    double promedio = (num1 + num2 + num3) / 3;
                    System.out.println("El promedio de los tres números es: " + promedio);
                    break;

                case 2:
                    // Convertir kilómetros a millas
                    System.out.print("Introduce la cantidad de kilómetros: ");
                    double km = sc.nextDouble();
                    double millas = km * 0.621371;
                    System.out.println(km + " kilómetros son " + millas + " millas.");
                    break;

                case 3:
                    // Calcular el área de un triángulo
                    System.out.print("Introduce la base del triángulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Introduce la altura del triángulo: ");
                    double altura = sc.nextDouble();
                    double area = (base * altura) / 2;
                    System.out.println("El área del triángulo es: " + area);
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

            System.out.println(); // Espacio para separar las iteraciones

        } while (opcion != 4);

        System.out.println("¡Gracias por usar el programa!");
    }
}

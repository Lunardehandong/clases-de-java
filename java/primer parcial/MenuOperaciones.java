import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Calcular el promedio de tres n�meros");
            System.out.println("2. Convertir kil�metros a millas");
            System.out.println("3. Calcular el �rea de un tri�ngulo");
            System.out.println("4. Salir");
            System.out.print("Elige una opci�n: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Calcular el promedio de tres n�meros
                    System.out.print("Introduce el primer n�mero: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Introduce el segundo n�mero: ");
                    double num2 = sc.nextDouble();
                    System.out.print("Introduce el tercer n�mero: ");
                    double num3 = sc.nextDouble();
                    double promedio = (num1 + num2 + num3) / 3;
                    System.out.println("El promedio de los tres n�meros es: " + promedio);
                    break;

                case 2:
                    // Convertir kil�metros a millas
                    System.out.print("Introduce la cantidad de kil�metros: ");
                    double km = sc.nextDouble();
                    double millas = km * 0.621371;
                    System.out.println(km + " kil�metros son " + millas + " millas.");
                    break;

                case 3:
                    // Calcular el �rea de un tri�ngulo
                    System.out.print("Introduce la base del tri�ngulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Introduce la altura del tri�ngulo: ");
                    double altura = sc.nextDouble();
                    double area = (base * altura) / 2;
                    System.out.println("El �rea del tri�ngulo es: " + area);
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opci�n no v�lida. Int�ntalo de nuevo.");
                    break;
            }

            System.out.println(); // Espacio para separar las iteraciones

        } while (opcion != 4);

        System.out.println("�Gracias por usar el programa!");
    }
}

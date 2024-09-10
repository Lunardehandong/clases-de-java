import java.util.Scanner;

public class UniversidadPatito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre = "";
        double promedio = 0;
        int becas80 = 0, becas50 = 0, becas30 = 0, becas20 = 0, sinBeca = 0;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar estudiante y calcular promedio");
            System.out.println("2. Mostrar becas otorgadas");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Opción 1: Agregar estudiante y calcular promedio
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingresa el nombre del estudiante: ");
                    nombre = scanner.nextLine();

                    double sumaCalificaciones = 0;
                    for (int i = 1; i <= 5; i++) {
                        double calificacion;
                        do {
                            System.out.print("Ingresa la calificación de la materia " + i + " (entre 0 y 100): ");
                            calificacion = scanner.nextDouble();
                            if (calificacion < 0 || calificacion > 100) {
                                System.out.println("Calificación no válida, debe estar entre 0 y 100.");
                            }
                        } while (calificacion < 0 || calificacion > 100);
                        sumaCalificaciones += calificacion;
                    }
                    promedio = sumaCalificaciones / 5;
                    System.out.println("El promedio de " + nombre + " es: " + promedio);

                    // Calcular a qué beca pertenece el estudiante
                    if (promedio >= 95 && promedio <= 100) {
                        becas80++;
                        System.out.println(nombre + " recibe una beca del 80%.");
                    } else if (promedio >= 90 && promedio < 95) {
                        becas50++;
                        System.out.println(nombre + " recibe una beca del 50%.");
                    } else if (promedio >= 85 && promedio < 90) {
                        becas30++;
                        System.out.println(nombre + " recibe una beca del 30%.");
                    } else if (promedio >= 80 && promedio < 85) {
                        becas20++;
                        System.out.println(nombre + " recibe una beca del 20%.");
                    } else {
                        sinBeca++;
                        System.out.println(nombre + " no califica para una beca.");
                    }
                    break;

                case 2:
                    // Opción 2: Mostrar cuántos estudiantes tienen cada tipo de beca
                    System.out.println("\n--- Resumen de becas otorgadas ---");
                    System.out.println("Becas del 80%: " + becas80);
                    System.out.println("Becas del 50%: " + becas50);
                    System.out.println("Becas del 30%: " + becas30);
                    System.out.println("Becas del 20%: " + becas20);
                    System.out.println("Estudiantes sin beca: " + sinBeca);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }
}

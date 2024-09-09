import java.util.Scanner;

public class Tablasmultiplicar {
    public static void main(String[] args) {
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa la tabla de multiplicar que quieres: ");
        int n = scanner.nextInt();
        
        // Imprimir la tabla de multiplicar para el número ingresado
        System.out.println("Tabla de multiplicar del " + n + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
            int resultado = n * i;
            System.out.println(n + " x " + i +" = " + resultado);

        }
        
    }}
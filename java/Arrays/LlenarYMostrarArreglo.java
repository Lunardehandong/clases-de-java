import java.util.Scanner;
//el cuerpo basico
public class LlenarYMostrarArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaraci�n de un arreglo de enteros con 5 posiciones
        int[] numeros = new int[5];

        // Llenar el arreglo con valores ingresados por el usuario
        //el for casi siempre se va a usar en los arreglos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un n�mero para la posici�n " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los valores del arreglo
        System.out.println("Los n�meros ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posici�n " + i + ": " + numeros[i]);
        }
    }
}

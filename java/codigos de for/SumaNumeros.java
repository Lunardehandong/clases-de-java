public class SumaNumeros {
    public static void main(String[] args) {
        
        int suma = 0;
        
        // Bucle for para sumar los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            suma += i; // Sumar el valor de i a la variable suma
        }
        
        // Imprimir el resultado
        System.out.println("La suma de los primeros 100 números enteros es: " + suma);
    }
}

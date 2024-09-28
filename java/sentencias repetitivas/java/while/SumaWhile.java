public class SumaWhile {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;

        // Usando while para sumar los primeros 5 números naturales
        while (i <= 5) {
            suma += i; // Acumular la suma
            i++;
        }

        System.out.println("La suma de los primeros 5 números es: " + suma);
    }
}

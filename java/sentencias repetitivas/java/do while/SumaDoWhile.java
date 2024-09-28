public class SumaDoWhile {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;

        // Usando do-while para sumar los primeros 5 números naturales
        do {
            suma += i; // Acumular la suma
            i++;
        } while (i <= 5);

        System.out.println("La suma de los primeros 5 números es: " + suma);
    }
}

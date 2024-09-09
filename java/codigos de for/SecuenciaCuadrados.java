public class SecuenciaCuadrados {
    public static void main(String[] args) {
        
        int limite = 10; // L�mite para la secuencia de cuadrados
        
        // Imprimir la secuencia de cuadrados hasta el l�mite
        System.out.println("Secuencia de cuadrados hasta " + limite + ":");
        
        // Bucle for para calcular y imprimir los cuadrados de los n�meros del 1 al l�mite
        for (int i = 1; i <= limite; i++) {
            int cuadrado = i * i; // Calcular el cuadrado del n�mero
            System.out.println(i + " al cuadrado es: " + cuadrado); // Imprimir el resultado
        }
    }
}

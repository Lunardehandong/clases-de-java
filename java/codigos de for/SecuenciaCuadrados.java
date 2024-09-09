public class SecuenciaCuadrados {
    public static void main(String[] args) {
        
        int limite = 10; // Límite para la secuencia de cuadrados
        
        // Imprimir la secuencia de cuadrados hasta el límite
        System.out.println("Secuencia de cuadrados hasta " + limite + ":");
        
        // Bucle for para calcular y imprimir los cuadrados de los números del 1 al límite
        for (int i = 1; i <= limite; i++) {
            int cuadrado = i * i; // Calcular el cuadrado del número
            System.out.println(i + " al cuadrado es: " + cuadrado); // Imprimir el resultado
        }
    }
}

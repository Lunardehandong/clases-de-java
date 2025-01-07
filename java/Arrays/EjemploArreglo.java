public class EjemploArreglo {
    public static void main(String[] args) {
        // Declaración y creación de un arreglo de ente21ros
        //Los arreglos contienen indices que comienzan desde el cero 
        int[] numeros = {10, 20, 30, 40, 50};

        // Imprimir los elementos del arreglo
        System.out.println("Elementos del arreglo:");
        //el for funciona para, decirte que i inicia en 0 y que mientras i sea menor a los 4 indices del arreglo
        //i se incrementara
        for (int i = 0; i < numeros.length; i++) {
          //imprimimos texto luego los datos del 0 al 4 y al final el arreglo
            System.out.println("Elemento en el índice " + i + ": " + numeros[i]);
        }
    }
}

public class ImprimirNumerosinpares {
    public static void main(String[] args) {
        
        // Bucle for para imprimir n?meros del 1 al 30
        for (int i = 1; i <= 30; i++) {
          if(i%3 ==0){
        System.out.print(" numero : " + i);
          }
        }
    }
}
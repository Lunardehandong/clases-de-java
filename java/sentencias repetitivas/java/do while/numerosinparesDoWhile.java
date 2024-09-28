public class numerosinparesDoWhile {
    public static void main(String[] args) {
        int i = 1;

        // Usando do-while para sumar los primeros 5 números naturales
        do {
            i++;
         if(i % 3 == 0){
         System.out.print(" numero : " + i);
         } 
        } while (i <= 30); 
    }
}
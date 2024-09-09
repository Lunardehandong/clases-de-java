import java.util.Scanner;

public class TipoVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para el tipo de vehículo (1-4): ");
        int vehiculo = scanner.nextInt();
        
        switch (vehiculo) {
            case 1:
                System.out.println("Carro");
                break;
            case 2:
                System.out.println("Motocicleta");
                break;
            case 3:
                System.out.println("Camión");
                break;
            case 4:
                System.out.println("Bicicleta");
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
        }
    }
}

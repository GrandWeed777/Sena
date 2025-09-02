package Taller2;
import java.util.Scanner;

public class comparardosnumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero 1");
        float numero1 = scanner.nextFloat();

        System.out.println("Ingrese numero 2");
        float numero2 = scanner.nextFloat();
        scanner.close();

        if (numero1 > numero2) {
            System.out.println("Numero 1 es mayor");
        } else if (numero2 > numero1) {
            System.out.println("Numero 2 es mayor");
        } else {
            System.out.println("Son iguales");
        }
    }
    
}

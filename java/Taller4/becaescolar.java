package Taller4;
import java.util.Scanner;

public class becaescolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su promedio");
        int promedio = scanner.nextInt();


         if (promedio < 9 ) {
            System.out.println("No aplica para beca");
         }
         else if (promedio >= 9 ) {
             System.out.println("Ingrese su nivel SocioEconomico");
                 int nivel = scanner.nextInt();

            if (nivel <= 2) {
                System.out.println("Beca del 100%");
            } else {
                    System.out.println("Beca del 50%");
            }
         }
        scanner.close();
    }
}

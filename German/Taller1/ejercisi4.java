package German.Taller1;

import java.util.Scanner;

public class ejercisi4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();

        if (numero > 0 ){
            System.out.println("Es positivo");
        } else if (numero < 0 ){
            System.out.println("Es negativo"); 
        } else {
            System.out.println("Es cero");
        }
    }
}

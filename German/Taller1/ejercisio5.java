package Taller1;


import java.util.Scanner;

public class ejercisio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int años = sc.nextInt();

        if ( años % 4 == 0){
            System.out.println("Bisiesto");
        } else if (años % 1 == 0){
            System.out.println("Año no es Bisiesto");
        } else if (años % 400 == 0){
            System.out.println("Bisiesto");
        } else {
            System.out.println("Año no Bisiesto");
        }
    }
}

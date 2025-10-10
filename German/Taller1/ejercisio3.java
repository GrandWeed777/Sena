package German.Taller1;

import java.util.Scanner;

public class ejercisio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su calificacion: ");
        double calificacion = sc.nextDouble();
        sc.close();

        if (calificacion >= 9){
            System.out.println("Su caflificacion es A");
        } else if (calificacion >= 8 && calificacion < 9){
            System.out.println("Su cafilicacion es B");
        } else if (calificacion >= 7 && calificacion < 8){
            System.out.println("Su calificacion es C");
        } else if (calificacion >= 6 && calificacion < 7){
            System.out.println("Su caflificacion es D");
        } else {
            System.out.println("Su caflificacion es E");
        }

    }
}
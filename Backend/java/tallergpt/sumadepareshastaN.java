package tallergpt;

import java.util.Scanner;

public class sumadepareshastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para N");
        int n = sc.nextInt();

        int suma = 0;

        for ( int i = 2; i <= n; i+=2){
            System.out.print(i);

            suma += i;
             
            if ( i + 2 <= n){
                System.out.print(" + ");
            } 
        }
        System.out.println();
         System.out.println("La suma de los primeros pares de N es: " + suma);
         sc.close();
    }
}

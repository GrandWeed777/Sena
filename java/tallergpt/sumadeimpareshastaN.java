package tallergpt;

import java.util.Scanner;

public class sumadeimpareshastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para N");
        int n = sc.nextInt();


        int suma = 0;
        for (int i = 1; i <= n; i+=2){
            System.out.print(i);

            if (i + 2 <= n)
            System.out.print(" + ");

            suma += i;
        }
         System.out.println();
        System.out.println("La suma de los impares hasta N es: " + suma);
        sc.close();
    }
    
}

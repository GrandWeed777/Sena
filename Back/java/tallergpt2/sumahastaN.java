package tallergpt2;

import java.util.Scanner;

public class sumahastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero para N: ");
        int N = sc.nextInt();


        int suma = 0;
        for (int i = 1; i <= N; i++){
            System.out.print(i);

            if (i + 1 <=N){
                System.out.print(" + ");
            }

            suma += i;
        }

        System.out.print( "\nLa suma es: " + suma);

    }
}

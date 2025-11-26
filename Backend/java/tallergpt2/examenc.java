package tallergpt2;

import java.util.Scanner;

public class examenc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para N");
        int N = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= N;  i++){
            int valor = 3 * i;
            System.out.print(valor + " ");
        }


    }
}

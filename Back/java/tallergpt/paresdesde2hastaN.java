package tallergpt;

import java.util.Scanner;

public class paresdesde2hastaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para N");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i+=2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

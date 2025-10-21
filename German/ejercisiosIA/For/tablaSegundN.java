package ejercisiosIA.For;

import java.util.Scanner;

public class tablaSegundN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrse un numero para mostrar la tabla respectiva: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        sc.close();
    }
}

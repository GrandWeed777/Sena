package tallergpt;

import java.util.Scanner;

public class tablademultsegunnumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para mostrar la respectiva tabla de multiplicar");
        int numero = sc.nextInt();

        for (int i = 0; i <= 10; i++){
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        sc.close();
    }
}

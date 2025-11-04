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
/**Realiza un programa en Java que solicite al usuario ingresar un número entero y muestre en pantalla su tabla de multiplicar del 1 al 10.
El programa debe calcular y mostrar cada resultado en el formato “número x contador = resultado”. */
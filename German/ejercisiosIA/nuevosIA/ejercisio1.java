package ejercisiosIA.nuevosIA;

import java.util.Scanner;

public class ejercisio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un palabra para saber cuantas (e) contiene: ");
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase().trim();

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'e') {
                contador++;

            }

        }
        System.out.println(contador);
        sc.close();
    }

}

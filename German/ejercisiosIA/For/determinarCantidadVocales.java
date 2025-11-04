package ejercisiosIA.For;

import java.util.Scanner;

public class determinarCantidadVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra para identifacar sus vocales: ");
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase();

        String cadaena = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cadaena += letra;
            }
        }
        System.out.println(cadaena);
        sc.close();
    }
}

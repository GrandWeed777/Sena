package ejercisiosIA.While;

import java.util.Scanner;

public class determinarCantidadVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra para identificar sus vocales: ");
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase();

        String cadena = "";
        int i = 0;
        while (i < palabra.length()) {

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cadena += letra;

            }
            i++;
        }
        System.out.println(cadena);
        sc.close();
    }
}

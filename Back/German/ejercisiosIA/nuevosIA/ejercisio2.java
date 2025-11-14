package ejercisiosIA.nuevosIA;

import java.util.Scanner;

public class ejercisio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese palabra para determinar  cuantas vocales contiene: ");
        String palabra = sc.nextLine();
        palabra = palabra.toLowerCase();

        String cadena = "";

        for (int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                cadena = cadena + letra;
            }
        }
        System.out.println(cadena);
    }
}

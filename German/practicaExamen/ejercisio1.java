package practicaExamen;

import java.util.Scanner;

public class ejercisio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String cadena = sc.nextLine();

        cadena = cadena.toLowerCase();

        int contador = 0;
        
        String vocales = "aeiou";

        for (int i = 0; i < cadena.length(); i++) {
            char letras = cadena.charAt(i);

            if (vocales.indexOf(letras) != -1) {
                contador++;
            }

        }

        System.out.println("La cadena tiene: " + contador + " vocales");
        sc.close();
    }
}

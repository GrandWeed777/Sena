package practicaExamen;

import java.util.Scanner;

public class ejercisio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine().toLowerCase();
        String letrasUsadas = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            int contador = 0;

            for (int j = 0; j < palabra.length(); j++) {
                if (letra == palabra.charAt(j)) {
                    contador++;
                }

            }
            if (letrasUsadas.indexOf(letra) == -1) {
                letrasUsadas += letra;
                System.out.println("La letra " + letra + " aparece " + contador + " veces");
            }

        }
    }
}

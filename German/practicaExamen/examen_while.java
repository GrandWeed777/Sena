package practicaExamen;

import java.util.Scanner;

public class examen_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int contador = 0;
        String cadenaN = "";
        String vocales = "aeiou";

        int i = 0;
        while (i < cadena.length()) {
            char letra = cadena.charAt(i);
            if (vocales.indexOf(letra) != -1) {
                cadenaN += letra;
                contador++;
            }
            i++;
        }
        System.out.println("las vocales son: " + vocales + "\n aparecen " + contador + " vocales");
        sc.close();
    }
}

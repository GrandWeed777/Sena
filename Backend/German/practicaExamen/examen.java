package practicaExamen;

import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine().toLowerCase();
        int contador = 0;
        String cadenaN = "";
        String vocales = "aeiou";

        for(int i = 0; i < cadena.length(); i ++){
            char letra = cadena.charAt(i);
            
            if (vocales.indexOf(letra) != -1) {
                cadenaN += letra;
                contador++;
            }
        }
        System.out.println("las vocales son: " + cadenaN + " aparecen " + contador + "vocales");

    }
}

package practicaExamen;

import java.util.Scanner;

public class ejercisio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Ingrese una letra para determinar cuantas veces eseta en la palabra: ");
        String letra = sc.nextLine();
        palabra = palabra.toLowerCase();
        letra = letra.toLowerCase();
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++){
                char letras = palabra.charAt(i);

                if (letras == letra.charAt(0)) {
                    contador++;
                }
        }
        System.out.println("La palabra '" + palabra + "' contiene " + contador + " veces la letra '" + letra + "'.");

    }
}

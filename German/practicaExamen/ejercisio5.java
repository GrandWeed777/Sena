package practicaExamen;
import java.util.Scanner;

public class ejercisio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase();
        String letrasRestantes = "sena";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);

            if (letrasRestantes.indexOf(letra) != -1) {

                letrasRestantes = letrasRestantes.replaceFirst(String.valueOf(letra), "");
                System.out.println("Encontrada: " + letra);
            }
        }

        if (letrasRestantes.isEmpty()) {
            System.out.println(" Se puede formar la palabra 'sena'.");
        } else {
            System.out.println(" No se puede formar la palabra 'sena'.");
        }

        sc.close();
    }
}

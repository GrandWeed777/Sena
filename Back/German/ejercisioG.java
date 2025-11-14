import java.util.Scanner;

public class ejercisioG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String texto = sc.nextLine();
        texto = texto.toLowerCase().trim();

        String cadena = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == 'a') {
                cadena += letra;
            }
        }
        System.out.print(cadena);
        sc.close();
    }
}

package Taller1;
import java.util.Scanner;

public class puntaje {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las respuestas correctas");
        int correctas = scanner.nextInt();

        System.out.println("Ingrese las respuestas incorrectas");
        int incorrectas = scanner.nextInt();

        System.out.println("Ingrese las respuestas en blanco");
        int blanco = scanner.nextInt();

        scanner.close();

        int puntaje = correctas * 4 + incorrectas * -1 + blanco * 0;
        System.out.println("El puntaje es: " + puntaje);
    }
}

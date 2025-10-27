package Guia3;

import java.util.Scanner;

public class ADN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una base para mostrar su cadena (A, T, C, G): ");
        String base = sc.nextLine();

        System.out.print("Ingresa la logitud de la cadena: ");
        int longitud = sc.nextInt();

        if (!base.equals("A") && !base.equals("T") && !base.equals("C") && !base.equals("G")) {
            System.out.println("ERROR! | Ingrese una base correcta!");
            return;
        }
        String cadena = "";

        for (int i = 0; i < longitud; i++) {
            cadena = cadena + base;
        }
        System.out.println("Cadena: " + cadena);
    }
}

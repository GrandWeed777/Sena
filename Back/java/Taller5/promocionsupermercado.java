package Taller5;

import java.util.Scanner;

public class promocionsupermercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Ingrese el valor de su compra");
        int compra = scanner.nextInt();

        System.out.println("Dia de la semana?");
        String dia = scanner.next().toLowerCase();

        System.out.println("Pago con tarjeta de la tienda? (si/no)");
        String tarjeta = scanner.next().toLowerCase();
        scanner.close();    

        if (compra >= 50 && dia.equals("lunes") || dia.equals("viernes")) {
            System.out.println("Participa en el sorteo");
        } else if ( tarjeta.equals("si")) {
            System.out.println("Participa en el sorteo");
        } else {
            System.out.println("No participa en el sorteo");
        }
    }
}

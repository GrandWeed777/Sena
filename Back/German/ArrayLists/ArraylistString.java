package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("PEPE");
        nombres.add("JUAN");
        nombres.add("CAMILO");
        nombres.add("ANDRES");
        nombres.add("ANDREW");
        nombres.add("ANDERSON");
        nombres.add("WILSON");

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equals(nombre)) {
                encontrado = true;
            }

        }
        if (encontrado) {
            System.out.println("Nombre encontrado!");

        } else {
            System.out.println("Intenta de nuevo X");
        }
    }

}
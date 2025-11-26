package ArrayLists;

import java.util.ArrayList;

public class ArrayListPractic {

    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();

        arreglo.add(2);
        arreglo.add(4);
        arreglo.add(6);
        arreglo.add(8);
        arreglo.add(10);
        arreglo.add(12);
        arreglo.add(14);

        int suma = 0;

        for (int i = 0; i < arreglo.size(); i++) {

            int elemento = arreglo.get(i);
            System.out.println(arreglo.get(i));
            suma += elemento;

        }

        System.out.println("La suma es: " + suma);
    }
}
package ArreglosIA;

import java.util.ArrayList;

public class ArraylistEjemplo {
    public static void main(String[] args) {
        // CREACION DEL ARRAYLIST
        // solo trabajan con objetos, no con primitivos
        ArrayList<String> nombres = new ArrayList<>();
        // agregar elementos
        nombres.add("PEPE");
        nombres.add("MARIA");
        nombres.add("JUAN");
        System.out.println(nombres);
        // MODIFICAR
        nombres.set(0, "PEPE PEREZ");
        System.out.println(nombres);
        // eliminar
        nombres.remove(2);
        System.out.println(nombres);
        // leer
        System.out.println("NOMBRE: " + nombres.get(1));

        // como creo un arrylist que me deje agregar elementos de
        // diferente tipo
        ArrayList<Object> mixto = new ArrayList();
        // agregamos un entero
        mixto.add(34);
        // agregamos una cadena
        mixto.add("ADSO");
        System.out.println(mixto);
        // recorrido con for
        for (int i = 0; i < mixto.size(); i++) {
            System.out.println("@@@@@@@@@@@@@");
            System.out.println(mixto.get(i));
        }
        // recorrido con for each
        for (Object elemento : mixto) {
            System.out.println("$$$$$$$$$");
            System.out.println(elemento);
        }

    }
}

package tallergpt2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class cantidadDeMascotasPorDueño {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> dueños = new ArrayList<>();
        ArrayList<Integer> mascotas = new ArrayList<>();

        System.out.println("---Bienvenido---");
        System.out.println("1 - Ingresar nombre de dueño y cantidad de mascotas");
        System.out.println("2- Ver Dueños");
        int opcion = sc.nextInt();
        sc.nextLine();
        boolean agregarMasdueños = true;
        while (agregarMasdueños) {
            if (opcion == 1) {
                System.out.print("Nombre del dueño: ");
                String nombre = sc.nextLine();
                dueños.add(nombre);
                System.out.println("Nombre Agregado");
                System.out.print("Ingrese la cantidad de mascotas: ");
                int cantidad = sc.nextInt();
                mascotas.add(cantidad);
                System.out.println("");

                System.out.println("Que quieres hacer?");
                System.out.println("1 - Agregar otro dueño");
                System.out.println("2 - Ver dueños");
                int opcionD = sc.nextInt();
                sc.nextLine();

                if (opcionD == 1) {
                    agregarMasdueños = true;
                } else if (opcionD == 2) {
                    agregarMasdueños = false;
                    System.out.println("--Dueños--");
                    for (int i = 0; i < dueños.size(); i++) {
                        System.out.println((i + 1) + ". " + dueños.get(i) + " --> " + mascotas.get(i) + " Mascotas ");
                    }
                }
            } else if (opcion == 2) {
                if (dueños.isEmpty()) {
                    System.out.println("No has agregado dueños.");
                } else {
                    System.out.println("Tus tareas son:");
                    for (int i = 0; i < dueños.size(); i++) {
                        System.out.println((i + 1) + ". " + dueños.get(i));
                    }
                }

            }
        }
    }

}

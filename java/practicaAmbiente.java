import java.util.ArrayList;
import java.util.Scanner;

public class practicaAmbiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean vuelveMenu = true;
        ArrayList<String> tareas = new ArrayList<>();

        while (vuelveMenu) {
            System.out.println("\n Opciones Del Menu ");
            System.out.println("1 - Agregar Tareas");
            System.out.println("2 - Ver Tareas");
            System.out.println("3 - Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            if (opcion == 1) {
                boolean agregarMasTareas = true;

                while (agregarMasTareas) {
                    System.out.print("Escribe una tarea: ");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea agregada.");

                    System.out.println("Que quieres hacer?");
                    System.out.println("1 - Agregar otra tarea");
                    System.out.println("0 - Volver al menú principal");
                   

                    int opcionAgregar = sc.nextInt();
                    sc.nextLine(); 

                    if (opcionAgregar == 1) {
                        agregarMasTareas = true;

                    } else if (opcionAgregar == 0) {
                        agregarMasTareas = false;

                    } else {
                        System.out.println("Opción no válida. Volviendo al menú.");
                        agregarMasTareas = false;
                    }
                }

            } else if (opcion == 2) {
                if (tareas.isEmpty()) {
                    System.out.println("No has agregado tareas.");
                } else {
                    System.out.println("Tus tareas son:");
                    for (int i = 0; i < tareas.size(); i++) {
                        System.out.println((i + 1) + ". " + tareas.get(i));
                    }
                }

                System.out.println("\nQue quieres hacer?");
                System.out.println("0 - Volver al menú");
                System.out.println("1 - Salir del programa");
                int opcion2 = sc.nextInt();
                sc.nextLine();

                if (opcion2 == 0) {
                    vuelveMenu = true;
                } else {
                    vuelveMenu = false;
                    System.out.println("Saliste del programa.");
                }

            } else if (opcion == 3) {
                System.out.println("Saliste del programa.");
                vuelveMenu = false;
            } else {
                System.out.println("Opción incorrecta. Intenta de nuevo.");
            }
        }
        sc.close();
    }
}

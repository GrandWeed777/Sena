import java.util.ArrayList;
import java.util.Scanner;

public class estudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        boolean agregaMasEstudiantes = true;

        while (agregaMasEstudiantes) {
            System.out.println("--Bienvenidos--");
            System.out.println("1 - Para agregar estudaiantes y notas ");
            System.out.println("2 - Para ver estudiantes");
            System.out.println("3 - Para Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Agrega un estudiante: ");
                String nombre = sc.nextLine();
                estudiantes.add(nombre);

                System.out.print("Agrega calificaciones: ");
                Double nota = sc.nextDouble();
                notas.add(nota);

                System.out.println("Estudiante y nota agregado correctamente\n");
            } else if (opcion == 2) {
                if (estudiantes.isEmpty()) {
                    System.out.println("No hay estudiantes agregados");
                } else {
                    double total = 0;
                    System.out.println("Estudiantes:");
                    for (int i = 0; i < estudiantes.size(); i++) {
                        System.out.println((i + 1) + ". " + estudiantes.get(i) + notas.get(i));
                        total += notas.get(i);
                    }
                    System.out.println("Promedio general: " + total + "\n");

                }
            } else if (opcion == 1) {
                System.out.println("saliendo del programa!!!");
                agregaMasEstudiantes = false;
            } else {
                System.out.println("Opcion icorrecta!");
            }

        }
    }

}

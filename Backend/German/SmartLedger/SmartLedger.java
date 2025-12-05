import java.util.HashMap;
import java.util.Scanner;

public class SmartLedger {

    static Transaccion historial[] = new Transaccion[100];
    static int contador = 0;

    static HashMap<Integer, String> categorias = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        categorias.put(1, "Ventas");
        categorias.put(2, "Servicios");
        categorias.put(3, "Trasporte");
        categorias.put(4, "Marketing");
        categorias.put(5, "Otros");
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n=== SMARTLEDGER ===");
            System.out.println("1 - Agregar transaccion");
            System.out.println("2 - Ver historial");
            System.out.println("3 - Ver resumen del dia");
            System.out.println("4 - Salir");
            System.out.print("Seleecione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarTransaccion();
                    break;
                case 2:
                    verHistorial();
                    break;
                case 3:
                    verResumen();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema!");
                    break;
                default:
                    System.out.println("Opcion Invalida, Intenta nuevamente!");
                    break;
            }

        }
    }

    static void agregarTransaccion() {
        Scanner sc = new Scanner(System.in);

        if (contador >= historial.length) {
            System.out.println("No puede agregar transaciones(limite alcanzado)");
            return;
        }

        System.out.println("\n---NUEVA TRANSACCION---");

        System.out.print("Ingresa el monto: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        String tipo = "";
        while (true) {
            System.out.println("Tipo (Ingreso/Gasto)");
            tipo = sc.nextLine().toLowerCase();

            if (tipo.equals("ingreso") || tipo.equals("gasto")) {
                break;
            } else {
                System.out.println("Tipo invalido. Intenta nuevamente!");
            }
        }

        System.out.println("\nCategorias disponibles:");

        for (int key : categorias.keySet()) {
            System.out.println(key + " - " + categorias.get(key));
        }

        System.out.println("Seleccione una categoria(numero): ");
        int opcionCategoria = sc.nextInt();
        sc.nextLine();

        String categoria = categorias.get(opcionCategoria);

        if (categoria == null) {
            categoria = "Otros";
        }

        System.out.println("-------------------------------");
        System.out.println("Ingresa la fecha (DD/MM/AA): ");
        String fecha = sc.nextLine();

        System.out.println("-------------------------------");
        System.out.println("Descripcion: ");
        String descripcion = sc.nextLine();

        Transaccion nueva = new Transaccion(monto, tipo, categoria, fecha, descripcion);
        historial[contador] = nueva;
        contador++;

        System.out.println("Transacion realizada con exito");
    }

    static void verHistorial() {
        
        System.out.println("\n--- HISTORIAL DE TRANSACCIONES ----");

        if (contador == 0) {
            System.out.println("No hay transacciones registradas.");
            return;
        }

        for(int i = 0; i < contador; i++){
            Transaccion t = historial[i];

            System.out.println("--------------------------------------");
            System.out.println("===TRANSACCIÓN " + (i + 1) + " ===\n");
            System.out.println("Monto: " + t.monto);
            System.out.println("Tipo: " + t.tipo );
            System.out.println("Categoria: " + t.categoria );
            System.out.println("Fecha: " + t.fecha);
            System.out.println("Descripcion: " + t.descripción);
            contadort++;
        }
    }

    static void verResumen() {

    }
}

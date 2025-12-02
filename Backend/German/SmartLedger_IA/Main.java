import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Lista donde se guardarán todas las transacciones
    static List<Transaccion> historial = new ArrayList<>();

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n====== SMARTLEDGER (Versión Básica) ======");
            System.out.println("1. Agregar transacción");
            System.out.println("2. Ver historial");
            System.out.println("3. Ver resumen del día");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: agregarTransaccion(); break;
                case 2: verHistorial(); break;
                case 3: verResumen(); break;
                case 4: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida."); 
            }
        }
    }

    // ------------------------ MÉTODOS ---------------------------- //

    static void agregarTransaccion() {
        System.out.print("Monto: ");
        float monto = sc.nextFloat();
        sc.nextLine();

        System.out.print("Tipo (ingreso/gasto): ");
        String tipo = sc.nextLine();

        System.out.print("Categoría: ");
        String categoria = sc.nextLine();

        System.out.print("Fecha (DD/MM/AAAA): ");
        String fecha = sc.nextLine();

        System.out.print("Descripción: ");
        String descripcion = sc.nextLine();

        // Crear transacción y almacenarla
        Transaccion t = new Transaccion(monto, tipo, categoria, fecha, descripcion);
        historial.add(t);

        System.out.println("Transacción agregada correctamente.");
    }

    static void verHistorial() {
        System.out.println("\n===== HISTORIAL =====");

        if (historial.isEmpty()) {
            System.out.println("No hay transacciones registradas.");
            return;
        }

        for (Transaccion t : historial) {
            System.out.println("----------------------------");
            System.out.println("Monto: " + t.monto);
            System.out.println("Tipo: " + t.tipo);
            System.out.println("Categoría: " + t.categoria);
            System.out.println("Fecha: " + t.fecha);
            System.out.println("Descripción: " + t.descripcion);
        }
    }

    static void verResumen() {
        float totalIngresos = 0;
        float totalGastos = 0;

        for (Transaccion t : historial) {
            if (t.tipo.equalsIgnoreCase("ingreso"))
                totalIngresos += t.monto;
            else if (t.tipo.equalsIgnoreCase("gasto"))
                totalGastos += t.monto;
        }

        float saldo = totalIngresos - totalGastos;

        System.out.println("\n===== RESUMEN DEL DÍA =====");
        System.out.println("Total Ingresos: " + totalIngresos);
        System.out.println("Total Gastos: " + totalGastos);
        System.out.println("Saldo Disponible: " + saldo);
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class practica10 {

    private static ArrayList<String> productos = new ArrayList<>();
    private static ArrayList<Double> precios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    verProductosYEditar();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el sistema de inventario! Adiós.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una de las opciones del 1 al 3.");
            }

            if (opcion != 3) {
                System.out.println("\nPresiona ENTER para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
        } while (opcion != 3);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("==================================");
        System.out.println("    SISTEMA DE GESTIÓN DE INVENTARIO    ");
        System.out.println("==================================");
        System.out.println("1. Agregar Producto y Precio");
        System.out.println("2. Ver y Editar Productos");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static int leerOpcion() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor, ingresa un número.");
            scanner.next();
            System.out.print("Selecciona una opción: ");
        }
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    public static void agregarProducto() {
        System.out.println("\n--- AGREGAR NUEVO PRODUCTO ---");
        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio del producto: ");

        while (!scanner.hasNextDouble()) {
            System.out.println("Precio no válido. Por favor, ingresa un número.");
            scanner.next();
            System.out.print("Precio del producto: ");
        }
        double precio = scanner.nextDouble();
        scanner.nextLine();
        // Agregamos a las listas
        productos.add(nombre);
        precios.add(precio);
        System.out.println("\n✅ Producto '" + nombre + "' con precio $" + precio + " agregado correctamente.");
    }

    public static void verProductosYEditar() {
        if (productos.isEmpty()) {
            System.out.println("\nEl inventario está vacío. Agrega productos primero (Opción 1).");
            return;
        }

        System.out.println("\n--- INVENTARIO ACTUAL ---");

        for (int i = 0; i < productos.size(); i++) {

            System.out.printf("%d. %-15s | Precio: $%.2f%n", (i + 1), productos.get(i), precios.get(i));
        }

        System.out.println("-------------------------");
        System.out.println("¿Deseas editar un producto? (s/n)");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("s")) {
            editarProducto();
        }
    }

    public static void editarProducto() {
        System.out.print("Ingresa el número del producto a editar: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada no válida. Por favor, ingresa el número de la lista.");
            scanner.next();
            System.out.print("Ingresa el número del producto a editar: ");
        }
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < productos.size()) {
            String productoActual = productos.get(indice);
            double precioActual = precios.get(indice);

            System.out.println("\n-- Editando: " + productoActual + " (Precio actual: $" + precioActual + ") --");

            System.out.print("Nuevo nombre (deja en blanco para no cambiar): ");
            String nuevoNombre = scanner.nextLine();
            if (!nuevoNombre.isEmpty()) {
                productos.set(indice, nuevoNombre);
            }

            System.out.print("Nuevo precio (0 para no cambiar): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Precio no válido. Por favor, ingresa un número.");
                scanner.next();
                System.out.print("Nuevo precio (0 para no cambiar): ");
            }
            double nuevoPrecio = scanner.nextDouble();
            scanner.nextLine();

            if (nuevoPrecio > 0) {
                precios.set(indice, nuevoPrecio);
            }

            System.out.println("\n✅ Producto actualizado con éxito.");

        } else {
            System.out.println("\nÍndice no válido. No se encontró ese número de producto.");
        }
    }
}
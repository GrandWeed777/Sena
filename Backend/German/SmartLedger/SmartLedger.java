import java.util.HashMap;
import java.util.Scanner;

public class SmartLedger {

    static Transaccion historial[] = new Transaccion[100];
    static int contador = 0;
    static HashMap<Integer, String> categorias = new HashMap<>();
    static HashMap<String, Usuario> usuarios = new HashMap<>(); 
    static Usuario usuarioActual = null; 

    // =========================================================================
    // Bloque de Autenticación
    // =========================================================================

    static void menuAutenticacion(Scanner sc) {
        int opcionLogin = 0;

        while (opcionLogin != 3 && usuarioActual == null) {
            System.out.println("\n=== AUTENTICACIÓN SMARTLEDGER ===");
            System.out.println("1 - Registrarse");
            System.out.println("2 - Iniciar Sesión");
            System.out.println("3 - Salir");
            System.out.print("Seleccione una opción: ");

            
            if (sc.hasNextInt()) {
                opcionLogin = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Entrada inválida. Intente de nuevo.");
                sc.nextLine(); 
                continue;
            }

            switch (opcionLogin) {
                case 1:
                    registrarUsuario(sc);
                    break;
                case 2:
                    if (iniciarSesion(sc)) {
                        System.out.println("Inicio de sesión exitoso. Bienvenido, " + usuarioActual.nombre + "!\n");
                        return; 
                    } else {
                        System.out.println("Usuario o contraseña incorrectos.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    static void registrarUsuario(Scanner sc) {
        System.out.println("\n--- REGISTRO DE USUARIO ---");
        System.out.print("Ingrese nombre de usuario (será su clave de acceso): ");
        String nombreUsuario = sc.nextLine();

        if (usuarios.containsKey(nombreUsuario)) {
            System.out.println("El nombre de usuario ya existe.");
            return;
        }

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = sc.nextLine();

        Usuario nuevoUsuario = new Usuario(nombre, nombreUsuario, contrasena);
        usuarios.put(nombreUsuario, nuevoUsuario);
        System.out.println("Usuario registrado con éxito!");
    }

    static boolean iniciarSesion(Scanner sc) {
        System.out.println("\n--- INICIO DE SESIÓN ---");
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.print("Ingrese contraseña: ");
        String contrasena = sc.nextLine();

        Usuario u = usuarios.get(nombreUsuario);

        if (u != null && u.contrasena.equals(contrasena)) {
            usuarioActual = u; // Asignar el usuario logueado
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        categorias.put(1, "Ventas");
        categorias.put(2, "Servicios");
        categorias.put(3, "Trasporte");
        categorias.put(4, "Marketing");
        categorias.put(5, "Otros");

        menuAutenticacion(sc);

        int opcion = 0;

        while (opcion != 4) { 
            System.out.println("\n=== SMARTLEDGER - Menú Principal ===");
            System.out.println(usuarioActual.nombre + " Puedes: ");
            System.out.println("1 - Agregar transaccion");
            System.out.println("2 - Ver historial");
            System.out.println("3 - Ver resumen del dia");
            System.out.println("4 - Salir");
            System.out.print("Seleecione una opcion: ");

            // Manejo de errores para la entrada del menú principal
            if (sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Entrada inválida. Intente de nuevo.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    agregarTransaccion(sc); 
                    break;
                case 2:
                    verHistorial();
                    break;
                case 3:
                    verResumen();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opcion Invalida, Intenta nuevamente!");
                    break;
            }
        }
    }

    // Se modificó para recibir el Scanner
    static void agregarTransaccion(Scanner sc) {

        if (contador >= historial.length) {
            System.out.println("No puede agregar transaciones (límite alcanzado)");
            return;
        }

        System.out.println("\n--- NUEVA TRANSACCION ---");
        System.out.print("Ingresa el monto: ");

        double monto;
        while (!sc.hasNextDouble()) {
            System.out.println("Monto inválido. Intenta de nuevo: ");
            sc.nextLine();
        }
        monto = sc.nextDouble();
        sc.nextLine();

        String tipo = "";
        while (true) {
            System.out.print("Tipo (Ingreso/Gasto): ");
            tipo = sc.nextLine().trim().toLowerCase(); 

            if (tipo.equals("ingreso") || tipo.equals("gasto")) {
                break;
            } else {
                System.out.println("Tipo inválido. Intenta nuevamente!");
            }
        }

        System.out.println("\nCategorias disponibles:");
        for (int key : categorias.keySet()) {
            System.out.println(key + " - " + categorias.get(key));
        }

        System.out.print("Seleccione una categoria(numero): ");

        int opcionCategoria;
        while (!sc.hasNextInt()) {
            System.out.println("Opción de categoría inválida. Intaenta de nuevo: ");
            sc.nextLine();
        }
        opcionCategoria = sc.nextInt();
        sc.nextLine();

        String categoria = categorias.getOrDefault(opcionCategoria, "Otros");

        System.out.print("Ingresa la fecha (DD/MM/AA): ");
        String fecha = sc.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = sc.nextLine();

        Transaccion nueva = new Transaccion(monto, tipo, categoria, fecha, descripcion, usuarioActual.nombreUsuario); 
        historial[contador] = nueva;
        contador++;

        System.out.println("Transacion realizada con éxito");
    }

    static void verHistorial() {
        System.out
                .println("\n--- HISTORIAL DE TRANSACCIONES DE " + usuarioActual.nombre.toUpperCase() + " ----");

        boolean hayTransacciones = false;
        for (int i = 0; i < contador; i++) {
            Transaccion t = historial[i];
            
            if (t.nombreUsuario.equals(usuarioActual.nombreUsuario)) {
                System.out.println("--------------------------------------");
                System.out.println("=== TRANSACCIÓN " + (i + 1) + " ===");
                System.out.println("Monto: " + t.monto);
                System.out.println("Tipo: " + t.tipo);
                System.out.println("Categoria: " + t.categoria);
                System.out.println("Fecha: " + t.fecha);
                System.out.println("Descripcion: " + t.descripción);
                hayTransacciones = true;
            }
        }

        if (!hayTransacciones) {
            System.out.println("No hay transacciones registradas para este usuario.");
        }
    }

    static void verResumen() {
        System.out.println("\n--- RESUMEN DEL DÍA DE " + usuarioActual.nombre.toUpperCase() + " ----");

        double ingresos = 0;
        double gastos = 0;

        for (int i = 0; i < contador; i++) {
            Transaccion t = historial[i];
            if (t.nombreUsuario.equals(usuarioActual.nombreUsuario)) {
                if (t.tipo.equalsIgnoreCase("ingreso")) {
                    ingresos += t.monto;
                } else if (t.tipo.equalsIgnoreCase("gasto")) {
                    gastos += t.monto;
                }
            }
        }

        System.out.println("Total de Ingresos: " + ingresos);
        System.out.println("Total de Gastos: " + gastos);
        System.out.println("Saldo Neto: " + (ingresos - gastos));

        if (ingresos > gastos) {
            System.out.println("¡Vas por buen camino!");
        } else if (gastos > ingresos) {
            System.out.println("¡Cuidado con los gastos!");
        } else {
            System.out.println("Ingresos y gastos balanceados.");
        }
    }
}
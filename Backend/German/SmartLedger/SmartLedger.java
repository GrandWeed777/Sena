import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Scanner;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

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

        Console console = System.console();
        String contraseña;

        if (console != null) {
            char[] passArray = console.readPassword("Ingrese su contraseña: ");
            contraseña = new String(passArray);
        } else {
            // Fallback si se ejecuta desde un IDE
            System.out.print("Ingrese su contraseña: ");
            contraseña = sc.nextLine();
        }

        Usuario nuevoUsuario = new Usuario(nombre, nombreUsuario, contraseña);
        usuarios.put(nombreUsuario, nuevoUsuario);
        System.out.println("Usuario registrado con éxito!");
    }

    static boolean iniciarSesion(Scanner sc) {
        System.out.println("\n--- INICIO DE SESIÓN ---");
        System.out.print("Ingrese nombre de usuario: ");
        String nombreUsuario = sc.nextLine();
        Console console = System.console();
        String contraseña;

        if (console != null) {
            char[] passArray = console.readPassword("Ingrese contraseña: ");
            contraseña = new String(passArray);
        } else {
            System.out.print("Ingrese contraseña: ");
            contraseña = sc.nextLine();
        }

        Usuario u = usuarios.get(nombreUsuario);

        if (u != null && u.contraseña.equals(contraseña)) {
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
    static String generarResumenIA(String resumenTexto) {
    String resp = ""; // <- ahora visible para el catch

    try {
        URL url = new URL("https://openrouter.ai/api/v1/chat/completions");

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("Authorization",
                "Bearer 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");
        con.setDoOutput(true);

        // Prompt formato CONSOLA PRO
        String prompt =
        "Genera un análisis financiero SOLO en formato texto plano, sin markdown, sin simbolos raros.\n" +
        "Formato EXACTO:\n" +
        "==============================\n" +
        "      ANALISIS FINANCIERO\n" +
        "==============================\n" +
        "Ingresos: X\n" +
        "Gastos: X\n" +
        "Saldo Neto: X\n" +
        "--- DETALLES ---\n" +
        "Margen: X\n" +
        "Relacion G/I: X\n" +
        "--- RECOMENDACIONES ---\n" +
        "1. ...\n2. ...\n3. ...\n\n" +
        "Datos:\n" + resumenTexto;

        // JSON
        String jsonInput = """
        {
          "model": "deepseek/deepseek-chat",
          "messages": [
            { "role": "system", "content": "Eres una IA experta financiera." },
            { "role": "user", "content": "%s" }
          ]
        }
        """.formatted(prompt);

        // Enviar JSON
        try (OutputStream os = con.getOutputStream()) {
            os.write(jsonInput.getBytes("utf-8"));
        }

        // Leer respuesta
        BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"));

        StringBuilder response = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            response.append(line);
        }
        br.close();

        resp = response.toString(); // guardar para debug

        // ===============================
        // EXTRACTOR SEGURO (FUNCIONA SIEMPRE)
        // ===============================

        String finalText = "";

        // Formato tipo A (OpenAI-like)
        int idx1 = resp.indexOf("\"content\":\"");
        if (idx1 != -1) {
            idx1 += 11;
            int end = resp.indexOf("\"", idx1);
            finalText = resp.substring(idx1, end);
        }

        // Formato tipo B (OpenRouter moderno)
        int idx2 = resp.indexOf("\"text\":\"");
        if (idx2 != -1) {
            idx2 += 8;
            int end = resp.indexOf("\"", idx2);
            finalText = resp.substring(idx2, end);
        }

        // Si sigue vacío → no encontramos nada
        if (finalText.isEmpty()) {
            System.out.println("\nRESPUESTA CRUDA:\n" + resp + "\n"); 
            return "Error: no se encontró texto en la respuesta.";
        }

        // Limpiar caracteres escapados
        finalText = finalText.replace("\\n", "\n")
                             .replace("\\t", " ")
                             .replace("\\\"", "\"");

        return finalText;

    } catch (Exception e) {
        System.out.println("\nRESPUESTA CRUDA (ERROR):\n" + resp + "\n");
        return "Error al conectar con IA: " + e.getMessage();
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

        String datos = "Ingresos: " + ingresos + ", Gastos: " + gastos + ", Saldo: " + (ingresos - gastos);

        System.out.println("\n--- ANÁLISIS IA ---");

        String analisisIA = generarResumenIA(datos);

        analisisIA = analisisIA
                .replace("\\n", "\n")
                .replace("\\\\n", "\n")
                .replace("###", "")
                .replace("####", "")
                .replace("**", "")
                .replace("\\[", "")
                .replace("\\]", "")
                .replace("\\", "");

        System.out.println(analisisIA);

    }
}
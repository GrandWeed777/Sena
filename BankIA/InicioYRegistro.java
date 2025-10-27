import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

public class InicioYRegistro {

    private static final String ARCHIVO_USUARIOS = "usuarios.json";
    private static Map<String, String> usuarios = new HashMap<>();

    public static void main(String[] args) {
        cargarUsuarios();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n--- Bienvenido al Banco Amigo ---");
            System.out.println("1 - Iniciar Sesión");
            System.out.println("2 - Registrarse");
            System.out.println("3 - Salir");
            System.out.print("Ingrese una opción: ");

            while (!sc.hasNextInt()) {
                System.out.print("Ingrese un número válido: ");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> iniciarSesion(sc);
                case 2 -> registrarUsuario(sc);
                case 3 -> {
                    guardarUsuarios();
                    System.out.println("Gracias por usar Banco Amigo. ¡Hasta pronto!");
                }
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        sc.close();
    }

    //  Cargar usuarios desde archivo JSON
    private static void cargarUsuarios() {
        File archivo = new File(ARCHIVO_USUARIOS);
        if (!archivo.exists()) {
            System.out.println("No se encontró archivo de usuarios. Se creará uno nuevo.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            StringBuilder json = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                json.append(linea);
            }
            parsearJSON(json.toString());
            System.out.println("Usuarios cargados correctamente ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON: " + e.getMessage());
        }
    }

    //  Guardar usuarios en formato JSON
    private static void guardarUsuarios() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_USUARIOS))) {
            bw.write("{\n");
            int contador = 0;
            int total = usuarios.size();
            for (Map.Entry<String, String> entry : usuarios.entrySet()) {
                contador++;
                bw.write(String.format("  \"%s\": \"%s\"%s\n",
                        escapeJSON(entry.getKey()), escapeJSON(entry.getValue()),
                        contador < total ? "," : ""));
            }
            bw.write("}");
            System.out.println("Usuarios guardados exitosamente ");
        } catch (IOException e) {
            System.out.println("Error al guardar usuarios en JSON: " + e.getMessage());
        }
    }

    //  Parsear el archivo JSON manualmente
    private static void parsearJSON(String json) {
        usuarios.clear();
        Pattern pattern = Pattern.compile("\"(.*?)\"\\s*:\\s*\"(.*?)\"");
        Matcher matcher = pattern.matcher(json);
        while (matcher.find()) {
            usuarios.put(unescapeJSON(matcher.group(1)), unescapeJSON(matcher.group(2)));
        }
    }

    //  Escapar caracteres especiales
    private static String escapeJSON(String texto) {
        return texto.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private static String unescapeJSON(String texto) {
        return texto.replace("\\\"", "\"").replace("\\\\", "\\");
    }

    //  Registrar usuario
    private static void registrarUsuario(Scanner sc) {
        System.out.print("Ingrese un nuevo nombre de usuario: ");
        String nuevoUsuario = sc.nextLine();

        if (usuarios.containsKey(nuevoUsuario)) {
            System.out.println("Ese usuario ya existe. Intente con otro.");
            return;
        }

        System.out.print("Ingrese una nueva contraseña: ");
        String nuevaContrasena = sc.nextLine();

        usuarios.put(nuevoUsuario, nuevaContrasena);
        guardarUsuarios();
        System.out.println("Registro exitoso . Ahora puede iniciar sesión con su nuevo usuario.");
    }

    //  Iniciar sesión
    private static void iniciarSesion(Scanner sc) {
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String contrasena = sc.nextLine();

        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
            System.out.println("Inicio de sesión exitoso. Bienvenido " + usuario + "!");
            Bank banco = new Bank(usuario);
            banco.iniciar();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
        }
    }
}

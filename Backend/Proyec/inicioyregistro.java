import java.util.Scanner;

public class inicioyregistro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Bienvenido al Banco Amigo ---");
        System.out.println("1 - Iniciar Sesión");
        System.out.println("2 - Registrarse");
        System.out.println("3 - Salir");    
        System.out.print("Ingrese una opción: ");
        int opcion = sc.nextInt();


        if (opcion == 1) {
            System.out.print("Ingrese su usuario: ");
            String usuario = sc.next();
            System.out.print("Ingrese su contraseña: ");
            String contrasena = sc.next();
            System.out.println("Inicio de sesión exitoso. Bienvenido " + usuario + "!");

            bank.main(args); 

        } else if (opcion == 2) {
            System.out.print("Ingrese su nombre de usuario: ");
            String nuevoUsuario = sc.next();
            System.out.print("Ingrese su contraseña: ");
            String nuevaContrasena = sc.next();
            System.out.println("Registro exitoso. Ahora puede iniciar sesión con su nuevo usuario.");

        } else if (opcion == 3) {
            System.out.println("Saliendo del sistema... ");
        } else {
            System.out.println("Opción no válida. Saliendo del sistema... ");
        }
    }
}

import java.util.Scanner;

public class registerUserGym {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresa tu documento de identificacion: ");
        String documento = sc.nextLine();

        while (!documento.matches("[0-9]+") || documento.length() < 5 || documento.length() > 8) {
            System.out.println("Documento inválido. Debe tener solo números entre 5 y 8 dígitos.");
            System.out.print("Ingresa tu documento de identidad nuevamente: ");
            sc.nextLine();

        }

        System.out.print("Ingresa tu correo electronico: ");
        String correo = sc.nextLine();
        while (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println("Ingresa un correo valido para registrarte correctamente!");
            System.out.print("Ingresa tu correo electronico nuevamente: ");
            sc.nextLine();
        }

        System.out.print("Ingrese una contraseña (minimo 8 digitos): ");
        char[] contraseña = sc.nextLine().toCharArray();

        while (contraseña.length < 8 || contraseña.length > 15) {
            System.out.println("Ingrese una contraseña valida para completar el registro (entre 8 y 15) digitos");
            System.out.print("Ingrese tu contraseña nuevamente: ");
        }
        System.out.println("Hola! " + nombre + " Tu registro fue exitoso\nBienvenido!!");
        sc.close();
    }
}
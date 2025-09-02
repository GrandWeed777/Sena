package Taller4;
import java.util.Scanner;

public class accesoasistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String useradmin = scanner.next();

        System.out.println("Ingrese la contraseña");
        int password =  scanner.nextInt(); 

        if (useradmin.equalsIgnoreCase("admin")) {
            if (password == 1234) {
                System.out.println("Bienvenido Administrador");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }
        else {
            System.out.println("Usuario no autorizado");
        }
        scanner.close();
    }
}

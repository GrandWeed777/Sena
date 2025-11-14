package ejercisiosIA.Do_while;

import java.util.Scanner;

public class contraseñaValida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean incorrecta;
        String contraseñaCorrecta = "12345";

        do {
            /**
             * System.out.print("Ingresa un usuario: ");
             * String usuario = sc.nextLine();
             **/
            System.out.print("Ingresa su contraseña: ");
            String pass = sc.nextLine();

            if (pass.equalsIgnoreCase(contraseñaCorrecta)) {
                System.out.println("Bienvenido!!");
                incorrecta = false;

            } else {
                System.out.println("Contraseña Incorrecta");
                incorrecta = true;

            }

        } while (incorrecta == true);
        sc.close();
    }
}
/**Realiza un programa en Java que solicite al usuario ingresar una contraseña y verifique si es correcta.
El programa debe comparar la contraseña ingresada con una contraseña previamente definida.
Si la contraseña es incorrecta, deberá mostrar un mensaje de error y permitir al usuario intentarlo nuevamente hasta que ingrese la contraseña correcta.
Al ingresar la contraseña correcta, el programa mostrará un mensaje de bienvenida. */
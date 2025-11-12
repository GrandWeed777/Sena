package metodos.controldeaccesos;

import java.util.Scanner;

public class ControlAcceesos {
    public void mostrarBienvenida() {
        System.out.println("Bienvenido");
    }

    public String leerContraseña() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu contraseña: ");
        String contraseña = sc.nextLine();
        sc.close();
        return contraseña;

    }

    public boolean validarContraseña(String intento) {
        String contraseñacorrecta = "ADSO123";
        if (intento.equals(contraseñacorrecta)) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarResultado(boolean acceso) {
        if (acceso) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado!");
        }
    }

}

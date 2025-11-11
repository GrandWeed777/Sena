package metodos.controldeaccesos;

public class MaincontroAccesos {
    public static void main(String[] args) {
        ControlAcceesos miControlaccesos = new ControlAcceesos();
        miControlaccesos.mostrarBienvenida();
        boolean acceso = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("\nIntento " + i + " de 3\n");

            String intento = miControlaccesos.leerContraseña();
            acceso = miControlaccesos.validarContraseña(intento);
            miControlaccesos.mostrarResultado(acceso);

            if (acceso) {
                break;
            }
        }

        if (!acceso) {
            System.out.println("Acceso bloqueado. Demasiados intentos fallidos.");
        }
    }

}

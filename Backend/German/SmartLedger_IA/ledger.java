import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ledger {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        float saldo = 0;
        int conteoIngresos = 0;
        int conteoGastos = 0;
        float totalIngresos = 0;
        float totalGastos = 0 ;
        String[] categorias = { "Ventas", "Servicios", "Marketing", "Otros" };
        String fecha = "";

        while (opcion != 5) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1 - Agregar transaccion");
            System.out.println("2 - Ver historial");
            System.out.println("3 - Retirar dinero");
            System.out.println("4 - Ver resumen del Dia");
            System.out.println("5 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Ingrese el monto: ");
                float transaccion = sc.nextFloat();

                int opcionM = 0;
                System.out.println("\n--- Clasifica el monto---");
                System.out.println("1 - Ingreso");
                System.out.println("2 - Gasto");
                opcionM = sc.nextInt();

                if (opcionM == 1) {
                    totalIngresos += transaccion;
                    conteoIngresos++;

                } else if (opcionM == 2) {
                    totalGastos += transaccion;
                    conteoGastos++;
                }

                int opcionC = 0;
                System.out.println("\n--- Elige la categoria---");
                System.out.println("1 - " + categorias[0]);
                System.out.println("2 - " + categorias[1]);
                System.out.println("3 - " + categorias[2]);
                System.out.println("4 - " + categorias[3]);
                opcionC = sc.nextInt();
                if (opcionC == 1) {

                }
                sc.nextLine();
                System.out.println("\n---Ingresa la fecha de la transaccion---");
                System.out.print("Fecha (DD/MM/AA): ");
                fecha = sc.nextLine();

                int opcionF = 0;
                System.out.println("\n---Ingresa una descripcion o termina la transaccion---");
                System.out.println("1 - Añadir descripcion");
                System.out.println("2 - terminar");
                opcionF = sc.nextInt();
                if (opcionF == 1) {
                    System.out.print("Descripcion: ");
                    
                } else if (opcionF == 2) {
                    
                }

                saldo += transaccion;

            }
        }
    }
}
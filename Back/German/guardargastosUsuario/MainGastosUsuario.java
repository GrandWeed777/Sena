package guardargastosUsuario;

import java.util.Scanner;

public class MainGastosUsuario {
    public static void main(String[] args) {
        int[] ingresos = new int[5];

        gastosUsuario micontrolador = new gastosUsuario();
        
        micontrolador.mostrarBienvenida();

        micontrolador.leerIngresos(ingresos);

        int mayor = micontrolador.calcularMayor(ingresos);
        System.out.println("El ingreso mayor fue de: " + mayor);

        int menor = micontrolador.calcularMenor(ingresos);
        System.out.println("El ingreso menor fue de: " + menor);

        int suma = micontrolador.suma;
        System.out.println("La suma total es de: " + suma);

        int promedio = micontrolador.promedio(micontrolador.suma);
        System.out.println("El promedio en los 5 dias fue de: " + promedio);
        
    }
}

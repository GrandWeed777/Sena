package guardargastosUsuario;

import java.util.Scanner;

public class gastosUsuario {

    Scanner sc = new Scanner(System.in);
    int contadordias = 1;
    int suma = 0;

    public void mostrarBienvenida() {
        System.out.println("Bienvenido!!");
    }

    public int[] leerIngresos(int[] ingresos) {
        for (int i = 0; i < ingresos.length; i++) {
            System.out.print("Ingrese los ingresos del dia " + contadordias + ": ");
            int ingreso = sc.nextInt();
            ingresos[i] = ingreso;
            suma+= ingreso;
            contadordias++;
        }
        return ingresos;
    }

    public int calcularMayor(int[] ingresos) {

        int mayor = ingresos[0];
        for (int i = 0; i < ingresos.length; i++) {
            if (ingresos[i] > mayor) {
                mayor = ingresos[i];
            }

        }
        return mayor;
    }

    public int calcularMenor(int[] ingresos) {
        int menor = ingresos[0];
        for (int i = 0; i < ingresos.length; i++) {
            if (ingresos[i] < menor) {
                menor = ingresos[i];
            }
        }
        return menor;
    }

    public int suma(int suma){
        return suma;
    }

    public int promedio(int suma){
        int promedio = suma / 5;
        return promedio;
    }


}

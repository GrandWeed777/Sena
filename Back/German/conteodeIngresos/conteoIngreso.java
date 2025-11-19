package conteodeIngresos;

import java.util.Scanner;

public class conteoIngreso {

    Scanner sc = new Scanner(System.in);

    int contadordias = 1;
    int suma = 0;

    public void mostrarMensaje() {
        System.out.println("   Bienvenido!!");
    }

    public float[] leerIngresos(float[] ingresos) {

        for (int i = 0; i < ingresos.length; i++) {
            System.out.print("Ingrese sus ingresos del dia: " + contadordias + ": ");
            float ingresodiario = sc.nextFloat();
            ingresos[i] = ingresodiario;
            suma += ingresodiario;
            contadordias++;
        }
        return ingresos;
    }

    public float calcularMayor(float[] ingresos) {
        float mayor = ingresos[0];
        for (int i = 0; i < ingresos.length; i++) {
            if (ingresos[i] > mayor) {
                mayor = ingresos[i];
            }
        }
        return mayor;
    }

    public float calcularMenor(float[] ingresos) {
        float menor = ingresos[0];
        for (int i = 0; i < ingresos.length; i++) {
            if (ingresos[i] < menor) {
                menor = ingresos[i];
            }
        }

        return menor;
    }

    public int calcularPromedio(int suma) {
        int promedio = suma / 7;

        return promedio;
    }

}
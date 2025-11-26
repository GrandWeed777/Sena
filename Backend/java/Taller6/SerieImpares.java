package Taller6;

import java.util.Scanner;

public class SerieImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el valor de N
        System.out.println("Ingrese un valor para N: ");
        int n = sc.nextInt();

        // Si N es par, restamos 1 para que termine en un impar
        if (n % 2 == 0) {
            n = n - 1;
        }

        // Variable para acumular la suma (usar double porque hay fracciones)
        double suma = 0.0;

        // Bucle para recorrer solo los impares hasta N
        for (int i = 1; i <= n; i += 2) {
            // Calcular el término 1 / (i^2)
            double termino = 1.0 / (i * i);

            // Mostrar el término (opcional, para ver la serie)
            System.out.print("1/" + i + "^2");

            // Si no es el último, mostrar "+"
            if (i + 2 <= n) {
                System.out.print(" + ");
            }

            // Acumular en la suma
            suma += termino;
        }

        // Salto de línea
        System.out.println();

        // Imprimir el resultado de la suma
        System.out.println("La suma es: " + suma);

        sc.close();
    }
}

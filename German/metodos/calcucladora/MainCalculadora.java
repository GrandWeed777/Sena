package metodos.calcucladora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora miCalculadora = new Calculadora();
        miCalculadora.mostrarMensaje();
        System.out.print("Ingresa un numero para sumarlo: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el otro numero: ");
        int num2 = sc.nextInt();

        int suma = miCalculadora.sumar(num1, num2);

        miCalculadora.mostrarResultado(suma);
        sc.close();
    }
}
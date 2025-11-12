package ejercisiosIA.metodosIA.Calculadora;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class calculadoraAvanzada {

    public void mostrarBienvenida() {
        System.out.println("Bienvenido!!");
    }

    public void mostrarMenu() {
        System.out.println("    Menu    ");

        System.out.println("1 - Para sumar");
        System.out.println("2 - Para restar");
        System.out.println("3 - Para multiplicar");
        System.out.println("4 - Para divir");
        System.out.println("5 - Para salir");
    }

    public double suma(double a, double b) {

        return a + b;
    }

    public double resta(double a, double b) {

        return a - b;
    }

    public double multiplicion(double a, double b) {

        return a * b;
    }

    public double divicion(double a, double b) {

        return a / b;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            mostrarMenu();

            System.out.print("Que quieres hacer?: ");
            opcion = sc.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();
            sc.close();
            double resultado = 0;

            if (opcion == 1) {
                resultado = suma(num1, num2);
            } else if (opcion == 2) {
                resultado = resta(num1, num2);
            } else if (opcion == 3) {
                resultado = multiplicion(num1, num2);
            } else if (opcion == 4) {
                resultado = divicion(num1, num2);
            } else {
                System.out.println("Ingrese una opcion valida!");
            }
            System.out.println("Resultado:" + resultado);

        }
        
    }

}

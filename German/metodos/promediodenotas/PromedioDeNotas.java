package metodos.promediodenotas;

import java.util.Scanner;

public class PromedioDeNotas {
    public void mostrarBienvenida() {
        System.out.println("Bienvenido!!");
    }

    public double leerNotas() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese nota 1");
        double not1 = sc.nextDouble();
        System.out.println("Ingrese nota 2");
        double not2 = sc.nextDouble();
        System.out.println("Ingrese nota 3");
        double not3 = sc.nextDouble();

        double promedio = (not1 + not2 + not3) / 3;
        sc.close();
        return promedio;
    }

    public void mostrarPromedio(double promedio){
        System.out.println("Tu promedio es: " + promedio);
    }

    public void aprovacion(double promedio) {
        if (promedio >= 3) {
            System.out.println("Aprovaste");
        } else {
            System.out.println("No aprovaste");
        }
    }
}

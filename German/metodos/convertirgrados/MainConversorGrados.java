package metodos.convertirgrados;

import java.util.Scanner;

public class MainConversorGrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorTemperatura miConversor = new ConversorTemperatura();
        miConversor.mostrarBienvenida();
        System.out.print("Ingrese los grados en celcius: ");
        double grados = sc.nextDouble();

        double conversionf = miConversor.conversorFahren(grados);

        double conversionk = miConversor.conversorkelvin(grados);

        miConversor.mostrarResultadof(conversionf);
        System.out.println();
        miConversor.mostrarResultadokk(conversionk);

    }
}

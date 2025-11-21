package metodos.Carro;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro Carro1 = new Carro();
        Carro.mostrarTitulo();
        Carro1.marca = "Tesla";
        Carro1.año = 2019;
        Carro1.km = 35000;

        Carro Carro2 = new Carro();
        Carro2.marca = "Toyota";
        Carro2.año = 2026;
        Carro2.km = 0;


        Carro1.mostrarInfo();
        Carro2.mostrarInfo();

        System.out.println("El carro 1 es modelo nuevo? " + Carro1.esModeloNevo());
        System.out.println("El carro 2 es modelo nuevo? " + Carro2.esModeloNevo());

        double millas = Carro.convertirKmAMillas(Carro1.km);
        System.out.println("El carro 1 tiene: " + millas + "millas");

        double millas2 = Carro.convertirKmAMillas(Carro2.km);
        System.out.println("El Carro 2 tiene: " + millas2 + "millas");
        sc.close();
    }
}

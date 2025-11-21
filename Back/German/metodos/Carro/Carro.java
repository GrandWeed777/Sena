package metodos.Carro;

public class Carro {
    int año;
    String marca;
    boolean esReciente;
    double km;

    public void mostrarInfo() {
        System.out.println("El carro es de marca: " + marca + " Modelo: " + año);
    }

    public boolean esModeloNevo() {
        
        return año > 2020;
    }

    public static double convertirKmAMillas(double km) {
       
        return km * 0.621;
    }

    public static void mostrarTitulo() {
        System.out.println("=== SISTEMA DE VEHÍCULOS ===");
    }
}

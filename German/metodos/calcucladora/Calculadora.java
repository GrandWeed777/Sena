package metodos.calcucladora;

public class Calculadora {
    public int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public int restar(int c, int d) {
        int resta = c - d;
        return resta;
    }

    public void mostrarMensaje() {
        System.out.println("Bienvenido a la calculadora");

    }

    public void mostrarResultado(int resultado) {
        System.out.println("El resultado es: " + resultado);
    }
}

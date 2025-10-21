package ejercisiosIA.While;

public class sumaDe1a100 {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;

        while (contador <= 100) {
            if (contador < 2) {
                System.out.print(contador);
            } else {
                System.out.print(" + " + contador);
            }
            suma += contador;
            contador++;

        }
        System.out.println("\nSuma = " + suma);
    }
}

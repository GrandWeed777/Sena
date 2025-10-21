package Guia2;

public class ejercisio5 {
    public static void main(String[] args) {
        int contador = 0;
        int suma = 0;

        while (contador <= 100) {

            contador++;

            if (contador % 2 == 0) {
                suma += contador;

                if (contador < 100) {
                    System.out.print(contador + " + ");
                } else {
                    System.out.print(contador);
                }
            }

        }
        System.out.println();
        System.out.print("\nSuma = " + suma);
    }

}

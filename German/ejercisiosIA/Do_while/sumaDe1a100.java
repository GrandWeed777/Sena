package ejercisiosIA.Do_while;

public class sumaDe1a100 {
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;

        do {
            suma += contador;
            if (contador < 2) {
                System.out.print(contador);
            } else {
                System.out.print(" + " + contador);
            }
            contador++;
           
        } while (contador <= 100);
         System.out.println("\nSuma = " + suma);
    }
}

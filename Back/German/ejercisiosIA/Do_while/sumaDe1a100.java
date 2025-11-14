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
/**Realiza un programa en Java que calcule y muestre la suma de todos los números comprendidos entre 1 y 100.
El programa debe recorrer los números del 1 al 100, mostrar cada uno en la operación de suma y finalmente imprimir el resultado total. */
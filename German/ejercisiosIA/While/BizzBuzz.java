package ejercisiosIA.While;

public class BizzBuzz {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println(contador + " BizzBuzz");
            } else if (contador % 3 == 0) {
                System.out.println(contador + " Bizz");
            } else if (contador % 5 == 0) {
                System.out.println(contador + " Buzz");
            } else {
                System.out.println(contador);
            }
            contador++;
        }
    }
}
/**El problema FizzBuzz consiste en recorrer los números del 1 al 100 (o cualquier rango) y:

Imprimir “Fizz” si el número es múltiplo de 3.

Imprimir “Buzz” si el número es múltiplo de 5.

Imprimir “FizzBuzz” si el número es múltiplo de ambos (3 y 5).

De lo contrario, imprimir el número. */
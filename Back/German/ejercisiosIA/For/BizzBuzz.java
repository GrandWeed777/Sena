package ejercisiosIA.For;

public class BizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " FizzBuzz\n");
            } else if (i % 3 == 0){
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0){
                System.out.println(i + " Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
/**El problema FizzBuzz consiste en recorrer los números del 1 al 100 (o cualquier rango) y:

Imprimir “Fizz” si el número es múltiplo de 3.

Imprimir “Buzz” si el número es múltiplo de 5.

Imprimir “FizzBuzz” si el número es múltiplo de ambos (3 y 5).

De lo contrario, imprimir el número.   5858F5 azul   767684 gris*/
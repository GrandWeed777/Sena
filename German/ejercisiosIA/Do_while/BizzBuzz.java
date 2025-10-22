package ejercisiosIA.Do_while;

public class BizzBuzz {
    public static void main(String[] args) {
        int contador = 1;

        do {
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
        } while (contador <= 100);
    }
}

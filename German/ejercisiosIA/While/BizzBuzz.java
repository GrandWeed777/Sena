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

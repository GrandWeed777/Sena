package ejercisiosIA.While;

public class multiplosDe3 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            contador++;
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
        }
    }
}

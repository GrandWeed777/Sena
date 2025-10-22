package ejercisiosIA.Do_while;

public class multiplosDe3 {
    public static void main(String[] args) {
        int contador = 1;
        do {
            contador++;
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
        } while (contador <= 100);
    }
}

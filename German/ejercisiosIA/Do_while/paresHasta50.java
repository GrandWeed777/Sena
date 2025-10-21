package ejercisiosIA.Do_while;

public class paresHasta50 {
    public static void main(String[] args) {
        int contador = 0;
        do {
            contador++;
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
        } while (contador <= 50);
    }
}

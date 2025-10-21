package ejercisiosIA.While;

public class paresHasta50 {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 50) {
            contador++;
            if (contador % 2 == 0) {
                System.out.println(contador);
            }

        }
    }
}

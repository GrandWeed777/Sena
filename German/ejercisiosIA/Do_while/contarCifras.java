package ejercisiosIA.Do_while;

public class contarCifras {
    public static void main(String[] args) {
        int contador = 0;
        int cifra = 12345;

        do {
            cifra /= 10;
            contador++;
            System.out.println(cifra);
        } while (cifra > 0);
        System.out.println(contador);
    }
}

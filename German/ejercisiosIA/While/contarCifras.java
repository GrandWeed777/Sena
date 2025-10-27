package ejercisiosIA.While;

public class contarCifras {
    public static void main(String[] args) {
        int contador = 0;
        int cifra = 123446;


        while (cifra > 0) {
            cifra /= 10;
            contador++;
            System.out.println(cifra);
        }
        System.out.println(contador);
    }
}

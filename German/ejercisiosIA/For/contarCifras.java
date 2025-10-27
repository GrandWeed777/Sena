package ejercisiosIA.For;

public class contarCifras {
    public static void main(String[] args) {
        int contador = 0;
        int cifra = 16438594;
        

        for (; cifra > 0;cifra /= 10) {
            contador++;
            System.out.println(cifra);
        }
        System.out.println(contador);
    }
}

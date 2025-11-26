package GuiaArreglosJava;

public class iterarforeach {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int numero : numeros) {
            numero += 1;
            System.out.println(numero);
        }
    }
}

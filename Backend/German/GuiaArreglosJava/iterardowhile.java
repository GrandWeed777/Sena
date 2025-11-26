package GuiaArreglosJava;

public class iterardowhile {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int i = 0;
        do {
            System.out.println(numeros[i]);
            i++;
        } while (numeros.length > 7);
    }
}

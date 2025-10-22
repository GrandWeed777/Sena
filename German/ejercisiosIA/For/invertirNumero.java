package ejercisiosIA.For;

public class invertirNumero {

    public static void main(String[] args) {
        int invertir = 0;
        for (int numero = 12345; numero > 0; numero /= 10) {
            int digito = numero % 10;

            invertir = invertir * 10 + digito;
        }
        System.out.println(invertir);
    }

}

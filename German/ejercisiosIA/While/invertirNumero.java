package ejercisiosIA.While;

public class invertirNumero {
    public static void main(String[] args) {
        int numero = 12345;

        while (numero > 0) {
            int digito = numero % 10;
            numero /= 10;

            int invertido = 0;
            invertido = invertido * 10 + digito;
            System.out.print(invertido);
        }
    }
}

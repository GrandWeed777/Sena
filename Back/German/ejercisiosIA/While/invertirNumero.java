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
/**Realiza un programa en Java que solicite al usuario ingresar un número entero positivo y muestre ese número invertido en pantalla.
El programa debe extraer los dígitos del número uno por uno y construir su forma inversa, mostrando los dígitos en orden contrario al original. */
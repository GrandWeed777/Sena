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
/**Realiza un programa en Java que solicite al usuario ingresar un número entero positivo y muestre ese número invertido en pantalla.
El programa debe extraer los dígitos del número uno por uno y construir su forma inversa, mostrando los dígitos en orden contrario al original. */
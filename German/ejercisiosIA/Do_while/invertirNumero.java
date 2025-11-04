package ejercisiosIA.Do_while;

import java.util.Scanner;

public class invertirNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        do {
            int digito = numero % 10;
            numero /= 10;

            int invertido = 0;
            invertido = invertido * 10 + digito;
            System.out.print(invertido);
        } while (numero > 0);
        sc.close();
    }
}
/**Realiza un programa en Java que solicite al usuario ingresar un número entero positivo y muestre ese número invertido en pantalla.
El programa debe extraer los dígitos del número uno por uno y construir su forma inversa, mostrando los dígitos en orden contrario al original. */
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

/**Realiza un programa en Java que permita contar cuántas cifras tiene un número entero positivo.
 *  El programa debe solicitar o contener un número y determinar cuántos dígitos lo componen, mostrando el resultado en pantalla. */
package ejercisiosIA.Do_while;

public class contarCifras {
    public static void main(String[] args) {
        int contador = 0;
        int cifra = 12345;

        do {
            cifra /= 10;
            contador++;
            System.out.println(cifra);
        } while (cifra > 0);
        System.out.println(contador);
    }
}
/**Realiza un programa en Java que permita contar cuántas cifras tiene un número entero positivo.
 *  El programa debe solicitar o contener un número y determinar cuántos dígitos lo componen, mostrando el resultado en pantalla. */
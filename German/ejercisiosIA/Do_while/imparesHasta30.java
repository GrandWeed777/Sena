package ejercisiosIA.Do_while;

public class imparesHasta30 {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println(contador);
            contador += 2;
        } while (contador <= 30);
    }
}
/**Realiza un programa en Java que muestre en pantalla todos los números impares desde 1 hasta 30.
El programa debe utilizar una variable que se incremente de dos en dos para mostrar únicamente los números impares dentro de ese rango. */
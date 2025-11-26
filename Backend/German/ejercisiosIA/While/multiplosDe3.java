package ejercisiosIA.While;

public class multiplosDe3 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            contador++;
            if (contador % 3 == 0) {
                System.out.println(contador);
            }
        }
    }
}
/**Realiza un programa en Java que muestre en pantalla todos los números múltiplos de 3 comprendidos entre 1 y 100.
El programa debe recorrer los números dentro de ese rango y mostrar únicamente aquellos que sean divisibles entre 3. */
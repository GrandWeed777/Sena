package ejercisiosIA.For;

public class multiplosDe3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i ++){
            if (i % 3==0) {
                System.out.println(i);
            }
        }
    }
}
/**Realiza un programa en Java que muestre en pantalla todos los números múltiplos de 3 comprendidos entre 1 y 100.
El programa debe recorrer los números dentro de ese rango y mostrar únicamente aquellos que sean divisibles entre 3. */
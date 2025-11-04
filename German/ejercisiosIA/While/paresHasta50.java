package ejercisiosIA.While;

public class paresHasta50 {
    public static void main(String[] args) {
        int contador = 1;
        while (contador <= 50) {
            contador++;
            if (contador % 2 == 0) {
                System.out.println(contador);
            }

        }
    }
}
/**Realiza un programa en Java que muestre en pantalla todos los números pares comprendidos entre 1 y 50.
El programa debe recorrer los números dentro de ese rango y mostrar únicamente aquellos que sean divisibles entre 2. */
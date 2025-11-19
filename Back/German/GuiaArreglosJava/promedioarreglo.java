package GuiaArreglosJava;

public class promedioarreglo {
    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;

        }
        int promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

    }
}

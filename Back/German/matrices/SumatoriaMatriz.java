package matrices;
public class SumatoriaMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
            {10, 20, 30},
            {5, 5, 5},
            {1, 1, 1}
        };

        int sumaTotal = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaTotal += numeros[i][j];
            }
        }

        System.out.println("La suma total es: " + sumaTotal);
    }
}

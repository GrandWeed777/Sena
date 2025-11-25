package matrices;

public class matris1 {
    public static void main(String[] args) {
        int[][] matriz = {
                { 2, 4, 6 },
                { 1, 3, 5 },
                { 7, 9, 11 }
        };

        int sumaT = 0;
        int mayor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaT += matriz[i][j];
                System.out.print(matriz[i][j] + " ");

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }

            }
            System.out.println();
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("La suma total es de: " + sumaT);
    }
}

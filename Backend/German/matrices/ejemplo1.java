package matrices;

public class ejemplo1 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 5;

            }

        }

        matriz[1][1] = 99;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                 System.out.print( matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}

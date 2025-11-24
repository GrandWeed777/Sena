package matrices;
public class Ejercicio2Char {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];

        // llenar con '-'
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        // colocar X y O
        tablero[1][1] = 'X';
        tablero[0][0] = 'O';

        // imprimir
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}

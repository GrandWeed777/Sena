public class Matris {
    public static void main(String[] args) {

        String[][] sala = new String[3][3];

        // Llenamos todo con "LIBRE"
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                sala[i][j] = "LIBRE";
            }
        }

        // Reservamos asiento fila 0, col 1
        sala[0][1] = "OCUPADO";

        // Imprimir tabla
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print("[" + sala[i][j] + "] ");
            }
            System.out.println();
        }
    }
}

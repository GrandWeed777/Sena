

public class matris5x5 {
    public static void main(String[] args) {
        char[][] matris = new char[5][5];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = '#';
                System.out.print("[" + matris[i][j] + "] ");

            }

        }

        
    }
} 

package practicaExamen;

public class ejercisio4 {
    public static void main(String[] args) {
        String palabra = "Banana";
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
             System.out.println("Pos " + i + ": " + caracter + "  ");
        }
       
    }
}

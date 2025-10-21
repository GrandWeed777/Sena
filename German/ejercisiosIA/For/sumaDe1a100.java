package ejercisiosIA.For;

public class sumaDe1a100 {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            suma += i;
            if (i < 2) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);

            }

        }
        System.out.println("\nSuma = " + suma);
    }
}

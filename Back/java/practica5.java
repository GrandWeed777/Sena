import java.util.Scanner;

public class practica5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un valor para N: ");
        int N = sc.nextInt();

        int suma = 0;
        boolean negativo = true;
        int contadorgrupo = 0;

        for ( int i = 3; i <= N; i+=3) {
            if (negativo) {
                suma -= i;
                if ( i == 3 ) {
                    System.out.print(i);
                } else System.out.print(" + " + i);
            }
            else {
                suma -= i;
                if ( i == 3) {
                    System.out.print(i);
                } else System.out.print(" - " + i);
            }
            contadorgrupo++;
            if (contadorgrupo == 1) {
                negativo = !negativo;
                contadorgrupo = 0;
            }
        }
        System.out.print("\nSuma = " + suma);
        sc.close();
    }
}

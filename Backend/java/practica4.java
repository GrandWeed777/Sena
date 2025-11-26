import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor para N: ");
        int N = sc.nextInt();

        int suma = 0;
        boolean negativo = true;
        int contadorgrupo = 0;

        for ( int i = 4; i <= N; i+=4){
           
            if (negativo) {
                suma -= i;
                if (i == 4) {
                    System.out.print(i);
                } else System.out.print(" + " + i);
                

            

            } else {
                suma += i; 
                if ( i == 4) {
                    System.out.print(i);
                } else System.out.print(" - " + i);
            }
            contadorgrupo++;
            if (contadorgrupo == 2) {
                negativo = !negativo;
                contadorgrupo = 0;
            }

        }
        System.out.println("\nSuma = " + suma);
        sc.close();
    }
}

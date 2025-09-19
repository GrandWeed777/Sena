import java.util.Scanner;

public class practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un valor para N: ");
        int N = sc.nextInt();

        int suma = 0; 
        int contadorgrupo = 0;
        boolean negativo = false;

        for ( int i = 3; i <= N; i+=3){

            if (negativo){
                suma -= i; 
                System.out.print(" - " + i);
            } else {
                suma += i;
                if ( i == 3) {
                    System.out.print(i);
                } else System.out.print( " + " + i);
               
            }

            contadorgrupo++;
            if (contadorgrupo == 3){
                negativo = !negativo;
                contadorgrupo = 0;
            }
        }
        System.out.println("\nSuma = " + suma);
        sc.close();
    }
}

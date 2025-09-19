import java.util.Scanner;

public class practicaAmbiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        
        int limiteBloque = 0;
        int contadorBloque = 0;
        boolean negativo = true;
        boolean primerImpreso = false;
        int suma = 0;


        for (int i = 2; i<= N; i+=2){
            if (negativo) {
                suma -= i;
                System.out.print(" - " + i);
            } else {
                suma += i;
                if (!primerImpreso){
                    System.out.println(i);
                    primerImpreso = true;
                } else {
                    System.out.print(" + " + i);
                }
            }
            contadorBloque++;

            if (contadorBloque == limiteBloque) {
                negativo = !negativo;
                contadorBloque = 0;
                limiteBloque++;
            }
        }
        System.out.println("\nSuma = " + suma);

    }
}

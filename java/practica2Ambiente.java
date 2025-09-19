import java.util.Scanner;

import Taller2.numerodentrorango;

public class practica2Ambiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String numeroTexto = "";
        int contador = 0;
        int resultadoSuma = 0;

        for ( int i = 2; i <= n; i+=2){
            if (contador < 2) {
                numeroTexto = numeroTexto + " - " + i;
                resultadoSuma -= i;
                contador++;
            } else {
                numeroTexto = numeroTexto + " + " + i;
                resultadoSuma += i;
                contador++;

                if (contador == )
            }
        }
    }
    
}

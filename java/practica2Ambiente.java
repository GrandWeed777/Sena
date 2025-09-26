//+2 +4 -6 -8 +10 +12 -14 -16 +18 +20 -22 -24
import java.util.Scanner;

import Taller2.numerodentrorango;

public class practica2Ambiente {
    public static void main(String[] args) {
        int suma = 0;
        int n = 12;
        StringBuilder serie = new StringBuilder();


        for (int i = 1; i <= n; i++){
            int signo = ((i - 1)% 4 == 0 || (i - 1)% 4 == 1) ? 1 : -1;
            int termino = i * 2;
            int valor = signo * termino;
            suma += valor;


            if ( i == 1){
                serie.append(valor);
            } else {
                if (valor > 0)serie.append(" + ").append(valor);
                else serie.append(" ").append(valor);
            }
        }
        System.out.println("Serie =" + serie.toString());
        System.out.println("Suma =" + suma);
    }
    
}

package Taller6;

import java.util.Scanner;

public class SumarHastaN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un valor para N: ");
        int n = scanner.nextInt();
       
        String numeroTexto = "";
       
        int suma = 0 ;

       for (int i = 1; i <= n; i++) {
        suma += i;
        if (i < n) {
            numeroTexto += i + " + ";
        }else {
            numeroTexto += i;
        }
       }
       System.out.println(numeroTexto + " = " + suma);
       scanner.close();
    }   
}
package Taller6;

import java.util.Scanner;

public class sumaMultiplosDeN { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor para N");
        int numero = scanner.nextInt();

        System.out.println("Ingrese un valor para M");
        int multiplo = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i<=numero; i++){
           int resultado = i * multiplo;
           System.out.print(resultado + " ");

           suma = suma + resultado;
        }
        System.out.println("La suma de los multiplos es: " + suma);
        
    }
    
}

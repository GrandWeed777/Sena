package Taller3;

import java.util.Scanner;

public class aprovadonoaprovado {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese nota 1");
        int nota1 = scanner.nextInt();

        System.out.println("Ingrese Nota 1");
        int nota2 = scanner.nextInt();

        scanner.close();

        if (nota1 >= 6 && nota2 >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Debe Recuperar");
        }
    }
    
}

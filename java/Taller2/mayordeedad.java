package Taller2;

import java.util.Scanner;

public class mayordeedad {
    
        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Ingrese su edad");
         int numero = scanner.nextInt();
         scanner.close();

         if (numero >= 18) {
            System.out.println("Es mayor de edad");  
         } else {
            System.out.println("Es menor de edad");
         }
        }
    }
package Taller5;

import java.util.Scanner;

public class prestamobancario {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("ingrese su salario mensual");
       int salario = scanner.nextInt();

       System.out.println("Ingrese los años en el trabajo actual");
       int años = scanner.nextInt();   

       if (salario >= 2000 && años >= 2) {
        System.out.println("Aplica para el préstamo");
      } else {
          if (salario > 5000) {
            System.out.println("Aplica para el préstamo");
          } else {
        System.out.println("No aplica para el préstamo");
      }
    }  scanner.close();
      }
}

package ejercisiosIA.Do_while;

import java.util.Scanner;

public class tablaSegunN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero para mostrar su respectiva tabla: ");
        int numero = sc.nextInt();
        int contador = 1;

        do {
            
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        } while (contador <= 10);
        sc.close();
    }
}

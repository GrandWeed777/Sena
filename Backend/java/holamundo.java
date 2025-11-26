
import java.util.Scanner;

public class holamundo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Valor 1");
       int numero1 = scanner.nextInt();
       System.out.println("Ingrese Valor 2");
       int numero2 = scanner.nextInt();

       scanner.close();
       int resultado  = numero1 + numero2;
       System.out.println("El resultado es: " + (resultado));  
    }
}
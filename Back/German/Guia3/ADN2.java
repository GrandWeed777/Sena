package Guia3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ADN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        List<String> Bases1 = new ArrayList<>();
        Bases1.add("A");
        Bases1.add("T");
        Bases1.add("C");
        Bases1.add("G");
        int bas = r.nextInt(4);
        int bas1 = r.nextInt(4);
        String BaseAleatoria = Bases1.get(bas);
        String BaseAleatoria1 = Bases1.get(bas1);
        System.out.println("Las bases elegidas son: " + bas + bas1);
       
        System.out.print("Ingresa la logitud de la cadena: ");
        int longitud = sc.nextInt();



        /**if (!Bases1.equals("A") && !Bases1.equals("T") && !Bases1.equals("C") && !Bases1.equals("G")) {
            System.out.println("ERROR! | Ingrese una base correcta!");
            return;
        }**/

        

    }
}

package Taller2;


import java.util.Scanner;

public class ejercisio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de terminos: ");
        int terminos = sc.nextInt();

        for (int i = 1; i <= terminos; i++){
            System.out.print("*");
        }
    }
}
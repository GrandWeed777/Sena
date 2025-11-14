package Guia1.Taller1;


import java.util.Scanner;

public class ejercisio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("\n Opciones Del Menu ");
            System.out.println("1 - Para Saludar");
            System.out.println("2 - Para Despedirse");
            System.out.println("3 - Salir");
            System.out.print("Selecciona una opcion: ");
            int opcion = sc.nextInt();

            if (opcion == 1){
                System.out.println("Esto es un saludo");
            } else if (opcion == 2){
                System.out.println("Aqui te estas despidiendo");
            } else if (opcion == 3){
                System.out.println("Saliendo!!");
            } else {
                System.out.println("Opcion incorrecta");
            }
            sc.close();
    }
}

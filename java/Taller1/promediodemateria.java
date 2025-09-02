package Taller1;
import java.util.Scanner;

public class promediodemateria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nota 1");
        float nota1 = scanner.nextFloat();

        System.out.println("Ingrese nota 2");
        float nota2 = scanner.nextFloat();

        System.out.println("Ingrese nota 3");
        float nota3 = scanner.nextFloat();

        System.out.println("Ingrese nota 4");
        float nota4 = scanner.nextFloat();

        scanner.close();

        float promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("El promedio es: " + promedio);
    }
    
}

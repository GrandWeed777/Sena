package Taller1;
import java.util.Scanner;

public class empleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas en el mes");
        int horas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora");
        int tarifa = scanner.nextInt();

        scanner.close();

        int salario = tarifa * horas;
        System.out.println("El salario es: " + salario);
    }
    
}

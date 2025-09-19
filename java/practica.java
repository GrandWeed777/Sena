import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un valor para N: ");
        int N = sc.nextInt();

        int suma = 0;
        int contadorgrupo = 1;
        boolean negativo = false;

        for (int i = 5; i <= N ; i+=5){
        

            if (negativo){
              suma -= i;
              System.out.print(" - " + i);
            } else {
                suma += i;
                if ( i != 5 ) System.out.print(" + ");
                System.out.print(i);
            }
            contadorgrupo ++;
                if ( contadorgrupo == 2){
                    negativo = !negativo;
                    contadorgrupo = 0;
                }
        }

        System.out.println("\nSuma = " + suma);
    }
}

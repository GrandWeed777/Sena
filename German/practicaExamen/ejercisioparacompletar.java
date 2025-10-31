package practicaExamen;

import java.util.Scanner;

public class ejercisioparacompletar {
    public static void main(String[] args) {
        // ENTRADA DE DATOS
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un mensaje");
        String mensaje = entrada.nextLine();
        int contadorS = 0;
        int contadorE = 0;
        int contadorN = 0;
        int contadorA = 0;
        // PROCESO
        // RECORREMOS LA CADENA
        for (int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            System.out.println(letra);

            if (letra == 's') {
                contadorS++;
            } else if (letra == 'e') {
                contadorE++;
            } else if (letra == 'n') {
                contadorN++;
            } else if (letra == 'a') {
                contadorA++;
            }
        }

        if (contadorS >= 1 && contadorE >= 1 && contadorN >= 1 && contadorA >= 1) {
            System.out.println("Se pude formar la palabra sena!");
        } else {
            System.out.println("No se puede formar la palabra sena");
        }
        
    }
    
}

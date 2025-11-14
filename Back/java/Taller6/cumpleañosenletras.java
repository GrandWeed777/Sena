package Taller6;

import java.util.Scanner;

public class cumpleañosenletras {
    public static void main(String[] args) {
        
       String[] diasPalabra = {
    "",
    "uno", "dos", "tres", "cuatro", "cinco",
    "seis", "siete", "ocho", "nueve", "diez",
    "once", "doce", "trece", "catorce", "quince",
    "dieciséis", "diecisiete", "dieciocho", "diecinueve", "veinte",
    "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco",
    "veintiséis", "veintisiete", "veintiocho", "veintinueve", "treinta",
    "treinta y uno"
};
        String[] mesenpalabras = {
            "", "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"
        };

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el dia de su cumpleaños (en numeros)");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes de su cumpleaños (en numero)");
        int mes = scanner.nextInt();

        if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12) {
            System.out.println("Su cumpleaños en palabras es: " + diasPalabra[dia] + " de " + mesenpalabras[mes]);
        }else {
            System.out.println("Ingrese un numero correcto");
        }
        scanner.close();
    }
    
}

package Taller6;

import java.util.Scanner;

public class numeroencentenas {
    public static void main(String[] args) {

        String[] centenas = {
            "", "ciento", "doscientos", "trescientos", "cuatrocientos",
            "quinientos", "seiscientos", "setecientos", "ochocientos", "novecientos"
        };
        String[] decenas = {
            "", "diez", "veinte", "treinta", "cuarenta",
            "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };
        String[] unidades = {
            "", "uno", "dos", "tres", "cuatro", "cinco",
            "seis", "siete", "ocho", "nueve"
        };
        String[] especiales10 = {
            "diez", "once", "doce", "trece", "catorce", "quince",
            "dieciséis", "diecisiete", "dieciocho", "diecinueve"
        };

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Primer dígito (centenas):");
        int numero1 = scanner.nextInt();

        System.out.println("Segundo dígito (decenas):");
        int numero2 = scanner.nextInt();

        System.out.println("Tercer dígito (unidades):");
        int numero3 = scanner.nextInt();

        if (numero1 < 0 || numero1 > 9 || numero2 < 0 || numero2 > 9 || numero3 < 0 || numero3 > 9) {
            System.out.println("Todos los numeros deben estar entre 0 y 9");
            scanner.close();
            return;
        }

        String resultado = "";

        if (numero1 == 1 && numero2 == 0 && numero3 == 0) {
            resultado = "cien";
        } else {
            resultado = centenas[numero1] + " ";
            if (numero2 == 1) {
                resultado += especiales10[numero3];
            } else {
                resultado += decenas[numero2];
                if (numero3 != 0 && numero2 > 2) {
                    resultado += " y " + unidades[numero3];
                } else if (numero2 == 0 && numero3 != 0) {
                    resultado += unidades[numero3];
                } else if (numero2 == 2 && numero3 != 0 ) {
                    resultado = resultado.trim() + "i" + unidades[numero3];
                }
            }
        }

        System.out.println("Numero en palabras: " + resultado.trim());

        scanner.close();

    }
}

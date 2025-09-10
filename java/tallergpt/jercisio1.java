package tallergpt;
import java.util.Scanner;

import javax.swing.JOptionPane; 

public class jercisio1 {
    public static void main(String[] args) { 
     
        Scanner sc = new Scanner(System.in); 
        
    
        String input = JOptionPane.showInputDialog(null,"Ingrese un valor para N"); 
        int n = Integer.parseInt(input);

        // Variable para almacenar la suma de los números impares
        int suma = 0;

        // Bucle que recorre desde 1 hasta n, aumentando de 2 en 2 para obtener solo números impares
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i);     // Imprimir el número actual

            // Sumar el número actual a la variable 'suma'
            suma += i; // suma = suma + i

            // Verificar si no es el último número para agregar el símbolo "+"
            if (i + 2 <= n) {
                System.out.print(" + ");
            }
        }

        // Salto de línea después de imprimir todos los números
        System.out.println();
        
        // Mostrar el resultado final de la suma
        System.out.println("La suma de los numeros pares es: " + suma);

        sc.close();
    }
}



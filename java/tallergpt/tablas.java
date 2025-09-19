package tallergpt;

public class tablas {
    public static void main(String[] args) {

        // tabla = 1 a 10
        for (int tabla = 1; tabla <= 10; tabla++) {

            // mostrar encabezado
            System.out.println("Tabla del " + tabla + ":");

            // multiplicar por 1 a 10
            for (int i = 1; i <= 10; i++) {
                int resultado = tabla * i;
                System.out.println(tabla + " x " + i + " = " + resultado);
            }

            System.out.println(); // línea en blanco entre tablas
        }
    }
}


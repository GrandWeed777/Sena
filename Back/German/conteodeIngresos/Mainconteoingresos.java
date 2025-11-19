package conteodeIngresos;

public class Mainconteoingresos {
    public static void main(String[] args) {
        float[] ingresos = new float[7];
        conteoIngreso micontrolador = new conteoIngreso();
        micontrolador.mostrarMensaje();

        micontrolador.leerIngresos(ingresos);

        float mayor = micontrolador.calcularMayor(ingresos);
        System.out.println("Su ingreso mayor fue de: " + mayor);

        float menor = micontrolador.calcularMenor(ingresos);
        System.out.println("Su ingreso menor fue de: " + menor);

        int promedio = micontrolador.calcularPromedio(micontrolador.suma);
        System.out.println("El promedio es de: " + promedio);

    }
}

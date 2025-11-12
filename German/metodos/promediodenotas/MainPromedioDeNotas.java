package metodos.promediodenotas;

public class MainPromedioDeNotas {
    public static void main(String[] args) {

        PromedioDeNotas miControl = new PromedioDeNotas();

        miControl.mostrarBienvenida();
        double promedio = miControl.leerNotas();
        miControl.mostrarPromedio(promedio);
        miControl.aprovacion(promedio);

    }
}

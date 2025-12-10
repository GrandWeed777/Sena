package clinica;

public class Cita {
    int documento;
    String nombre;
    String fecha;
    String hora;

    public Cita(int documento, String nombre, String fecha, String hora) {
        this.documento = documento;
        this.nombre = nombre;

        this.fecha = fecha;
        this.hora = hora;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Documento: " + this.documento);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);
    }

    public void cambiarFechaHora(String nuevaFecha, String nuevahora) {
        this.fecha = nuevaFecha;
        this.hora = nuevahora;
        System.out.println("La fecha y hora de su cita fue reasignada correctamente a: " + this.fecha + this.hora);
    }

    public String consultarDatos() {
        return "Nombre: " + this.nombre + "\n" + "Documento: " + this.documento + "\n" + "Fecha: " + this.fecha + "\n"
                + "Hora: " + this.hora;
    }

}

public class Transaccion {

    double monto;
    String tipo;
    String categoria;
    String fecha;
    String descripción;
    String nombreUsuario;

    public Transaccion(double monto, String tipo, String categoria, String fecha, String descripcion, String nombreUsuario) {
        this.monto = monto;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fecha = fecha;
        this.descripción = descripcion;
        this.nombreUsuario = nombreUsuario;
    }
}

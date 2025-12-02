public class Transaccion {

    float monto;
    String tipo; // ingreso o gasto
    String categoria;
    String fecha;
    String descripcion;

    // Constructor
    Transaccion(float monto, String tipo, String categoria, String fecha, String descripcion) {
        this.monto = monto;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

}


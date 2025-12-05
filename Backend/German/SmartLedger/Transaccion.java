public class Transaccion {
    
    double monto ;
    String tipo ;
    String categoria ;
    String fecha ;
    String descripción; 


    public Transaccion (double monto, String tipo, String categoria, String fecha, String descripcion ){
        this.monto = monto;
        this.tipo = tipo;
        this.categoria = categoria;
        this.fecha = fecha;
        this.descripción = descripcion;
    }
}

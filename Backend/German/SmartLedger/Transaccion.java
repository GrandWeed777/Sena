public class Transaccion extends Registro{

    private double monto;
    private String tipo;
    private String categoria;
    private String nombreUsuario;

    public Transaccion(double monto, String tipo, String categoria, String fecha, String descripcion, String nombreUsuario) {
        super(fecha, descripcion);
        this.monto = monto;
        this.tipo = tipo;
        this.categoria = categoria;
        this.nombreUsuario = nombreUsuario;
    }

    //Getters
    public double getMonto(){
        return monto;
    }

    public String getTipo(){
        return tipo;
    }

    public String getCategoria(){
        return categoria;
    }

    public String getFecha(){
        return fecha;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

}

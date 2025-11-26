package metodos.productos;

public class Productos {

    String producto;
    float precio;
    int Stok;
    String StokLibras;
    boolean producCostoso;

    public void mostrarInfo() {
        System.out.println( producto + "  $" + precio);
    }

    public int cantidadStock() {
        return Stok;
    }

    public String cantidadStockLibras(){
        StokLibras = Stok + " Libras";
        return StokLibras;
    }

    public double precioTotal() {
        return precio * 1.10;
    }

    public boolean prodcutoCostoso() {
        return precio > 3000;
    }

    public static void mostrarTitulo() {
        System.out.println("=== SISTEMA DE PRODUCTOS ===");
    }
}

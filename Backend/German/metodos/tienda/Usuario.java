package metodos.tienda;
import java.util.ArrayList;

    public class Usuario {

    public String nombre;
    public ArrayList<Producto> carrito;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.carrito = new ArrayList<Producto>();
    }

    public void agregarProductoAlCarrito(Producto producto) {
        this.carrito.add(producto);
        System.out.println(producto.nombre + " ha sido agregado al carrito de " + this.nombre);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : this.carrito) {
            total = total + producto.precio;
        }
        return total;
    }

    public static Producto buscarProducto(String nombre, Producto... productos) {
    for (Producto p : productos) {
        if (p.nombre.equalsIgnoreCase(nombre)) {
            return p;
        }
    }
    return null;
}
}

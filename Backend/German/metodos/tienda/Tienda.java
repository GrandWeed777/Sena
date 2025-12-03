package metodos.tienda;

import java.util.Scanner;

public class Tienda {
    // ... (El método buscarProducto se mantiene igual aquí)

    public static Producto buscarProducto(String nombre, Producto... productos) {
        for (Producto p : productos) {
            // Utilizamos trim() para eliminar espacios en blanco alrededor del nombre.
            if (p.nombre.equalsIgnoreCase(nombre.trim())) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Productos disponibles (Se mantiene igual)
        Producto manzana = new Producto("Manzana", 0.50);
        Producto leche = new Producto("Leche", 1.20);
        Producto pan = new Producto("Pan", 1.50);
        Producto cafe = new Producto("Cafe", 1.30);
        Producto arroz = new Producto("Arroz", 2);
        Producto[] productosDisponibles = { manzana, leche, pan, cafe, arroz };
        System.out.println("¡Bienvenido a la tienda! Productos disponibles:");
        System.out.println("- " + manzana.nombre + ": $" + manzana.precio);
        System.out.println("- " + leche.nombre + ": $" + leche.precio);
        System.out.println("- " + pan.nombre + ": $" + pan.precio);
        System.out.println("- " + cafe.nombre + ": $" + cafe.precio);
        System.out.println("- " + arroz.nombre + ": $" + arroz.precio);

        // 2. Ingreso del usuario (Se mantiene igual)
        System.out.println("-------------------------------------------");
        System.out.print(" Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        

        Usuario newUser = new Usuario(nombre);
        System.out.println("El usuario " + newUser.nombre + " ha entrado a la tienda.");
        System.out.println("-------------------------------------------");

        // **********  LÓGICA PARA AGREGAR PRODUCTOS EN LÍNEA ÚNICA **********
        System.out.println(" Ingresa los nombres de los productos que deseas comprar, separados por coma :");
        String entradaProductos = sc.nextLine();

        // 1. Dividir la cadena de entrada usando la coma (",") como delimitador
        // El método split devuelve un array de Strings.
        String[] nombresProductos = entradaProductos.split(",");

        System.out.println(" Procesando tu pedido...");

        // 2. Iterar sobre el array de nombres
        for (String nombreProducto : nombresProductos) {

            // 3. Buscar el producto, asegurándose de limpiar espacios en blanco (trim())
            Producto productoSeleccionado = buscarProducto(nombreProducto.trim(), productosDisponibles);
            if (productoSeleccionado != null) {
                // Producto encontrado, se agrega al carrito
                newUser.agregarProductoAlCarrito(productoSeleccionado);
            } else {
                // Producto no encontrado
                System.out.println(" ERROR: Producto '" + nombreProducto.trim() + "' no existe en la tienda.");
            }
        }

        // ************************************************************************

        System.out.println("-------------------------------------------");
        // 3. Mostrar resumen y total (Similar al código anterior)
        if (newUser.carrito.isEmpty()) {
            System.out.println("El carrito de " + newUser.nombre + " está vacío.");
        } else {
            System.out.println(" Resumen de compra para " + newUser.nombre + ":");
            for (Producto item : newUser.carrito) {
                System.out.println(" - " + item.nombre + " ($" + String.format("%.2f", item.precio) + ")");
            }

            double totalCompra = newUser.calcularTotal();
            System.out.println("El total de la compra es: $" + String.format("%.2f", totalCompra) + "");
        }

        sc.close();
    }
}
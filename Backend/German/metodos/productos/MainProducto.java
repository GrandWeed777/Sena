package metodos.productos;

public class MainProducto {
    public static void main(String[] args) {

        Productos producto1 = new Productos();
        Productos.mostrarTitulo();
        producto1.producto = "Carne 1Kl";
        producto1.precio = 15000;
        producto1.Stok = 13;

        Productos producto2 = new Productos();
        producto2.producto = "Arroz 1L";
        producto2.precio = 3000;
        producto2.Stok = 30;

        Productos producto3 = new Productos();
        producto3.producto = "Papa 1L";
        producto3.precio = 3000;
        producto3.Stok = 20;
        System.out.println();

        System.out.println("=== PRODUCTOS ===");
        producto1.mostrarInfo();
        producto2.mostrarInfo();
        producto3.mostrarInfo();

        System.out.println();
        System.out.println("=== STOCK ===");
        System.out.println("Stok de " + producto1.producto + "es de : " + producto1.cantidadStockLibras());
        System.out.println("Stok de " + producto2.producto + "es de : " + producto2.cantidadStockLibras());
        System.out.println("Stok de " + producto3.producto + "es de : " + producto3.cantidadStockLibras());
        System.out.println();

        System.out.println("=== PRODUCTO COSTOSO? ===");
        System.out.println(producto1.producto + " es costoso? " + producto1.prodcutoCostoso());
        System.out.println(producto2.producto + " es costoso? " + producto2.prodcutoCostoso());
        System.out.println(producto3.producto + " es costoso? " + producto3.prodcutoCostoso());
        System.out.println();

        System.out.println("=== PRECIO TOTAL ===");
        System.out.println("Precio total de " + producto1.producto + " es de : " + producto1.precioTotal());
        System.out.println("Precio total de " + producto2.producto + " es de : " + producto2.precioTotal());
        System.out.println("Precio total de " + producto3.producto + " es de : " + producto3.precioTotal());

    }
}

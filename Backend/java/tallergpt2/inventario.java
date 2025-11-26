package tallergpt2;

import java.util.ArrayList;
import java.util.Scanner;

public class inventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        boolean agregarMasproductos = true;

        while (agregarMasproductos) {
            System.out.println("--Bienvenido--");
            System.out.println("1 - Agregar productos y precios");
            System.out.println("2 - Ver productos");
            System.out.println("3 - Salir");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.print("Agrega un producto: ");
                String producto = sc.nextLine();
                productos.add(producto);

                System.out.print("Agrega un precio: ");
                double precio = sc.nextDouble();
                precios.add(precio);

                System.out.println("Producto y precio agregados!\n");

            } else if (opcion == 2) {
                if (productos.isEmpty()) {
                    System.out.println("No hay productos en el inventario.\n");
                } else {
                    double total = 0; 
                    System.out.println("Productos:");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i + 1) + ". " + productos.get(i) + " - $" + precios.get(i));
                        total += precios.get(i);  
                    }
                    System.out.println("Total del inventario: $" + total + "\n");
                }

            } else if (opcion == 3) {
                System.out.println("Saliendo del programa...");
                agregarMasproductos = false;
            } else {
                System.out.println("Opción incorrecta, intenta de nuevo.\n");
            }
        }
    }
}

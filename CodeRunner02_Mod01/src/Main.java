public class Main {
    public static void main(String[] args) {
        InventarioProductos inventario = new InventarioProductos();
        inventario.agregarProducto(10, "Producto A");
        System.out.println(inventario.buscarProducto(10));
    }
}
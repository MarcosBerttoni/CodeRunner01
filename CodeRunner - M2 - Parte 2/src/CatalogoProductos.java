public class CatalogoProductos {
    // Función de búsqueda binaria para encontrar un producto
    public int buscarProducto(String[] catalogo, String productoBuscado) {
        int izquierda = 0;
        int derecha = catalogo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = catalogo[medio].compareTo(productoBuscado);

            if (comparacion == 0) {
                return medio; // Producto encontrado
            } else if (comparacion < 0) {
                izquierda = medio + 1; // Buscar en la mitad derecha
            } else {
                derecha = medio - 1; // Buscar en la mitad izquierda
            }
        }

        // Producto no encontrado, devolver la posición donde debería insertarse
        return -(izquierda + 1);
    }
}
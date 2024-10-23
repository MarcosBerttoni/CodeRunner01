public class Biblioteca {
    // Método de búsqueda binaria recursiva
    public int buscarLibro(String[] catalogo, String tituloBuscado) {
        return buscarLibroRecursivo(catalogo, tituloBuscado, 0, catalogo.length - 1);
    }

    private int buscarLibroRecursivo(String[] catalogo, String tituloBuscado, int inicio, int fin) {
        if (inicio > fin) {
            // Libro no encontrado, devolver un valor negativo
            return -1;
        }

        int medio = inicio + (fin - inicio) / 2;
        int comparacion = catalogo[medio].compareTo(tituloBuscado);

        if (comparacion == 0) {
            return medio; // Libro encontrado
        } else if (comparacion < 0) {
            return buscarLibroRecursivo(catalogo, tituloBuscado, medio + 1, fin); // Buscar en la mitad derecha
        } else {
            return buscarLibroRecursivo(catalogo, tituloBuscado, inicio, medio - 1); // Buscar en la mitad izquierda
        }
    }
}

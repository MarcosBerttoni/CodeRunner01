import java.util.*;
class GestorBiblioteca {

    public List<Libro> selectionSort(List<Libro> libros) {
        //Completa el método, siguiendo la pauta dada, aquí.
        int n = libros.size();
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el índice del libro con el año de publicación más pequeño
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (libros.get(j).getAnoPublicacion() < libros.get(minIndex).getAnoPublicacion()) {
                    minIndex = j;
                }
            }
            // Intercambia el libro en i con el libro en minIndex
            if (minIndex != i) {
                Collections.swap(libros, i, minIndex);
            }
        }
        return libros;
    }

    public List<Libro> insertionSort(List<Libro> libros) {
        //Completa el método, siguiendo la pauta dada, aquí.
            int n = libros.size();
            for (int i = 1; i < n; i++) {
                Libro clave = libros.get(i);
                int j = i - 1;

                // Mueve los libros que son mayores que la clave hacia una posición adelante
                while (j >= 0 && libros.get(j).getAnoPublicacion() > clave.getAnoPublicacion()) {
                    libros.set(j + 1, libros.get(j));
                    j = j - 1;
                }
                // Coloca la clave en su posición correcta
                libros.set(j + 1, clave);
            }
            return libros;
    }
}
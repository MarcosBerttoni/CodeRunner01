import java.util.*;
public class Main {
    public static void main(String[] args) {
        GestorBiblioteca gestor = new GestorBiblioteca();
        List<Libro> libros = Arrays.asList(
                new Libro("A", 1900),
                new Libro("B", 1950),
                new Libro("C", 2000)
        );
        List<Libro> sortedBySelection = gestor.selectionSort(libros);
        List<Libro> sortedByInsertion = gestor.insertionSort(libros);
        System.out.println("Lista ordenada ascendentemente:");
        System.out.println("Selection Sort: " + sortedBySelection);
        System.out.println("Insertion Sort: " + sortedByInsertion);
    }
}
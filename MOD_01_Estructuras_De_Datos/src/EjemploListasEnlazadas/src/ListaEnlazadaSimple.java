import java.util.LinkedList;

public class ListaEnlazadaSimple {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        // Inserción de elementos al principio
        lista.addFirst(3); // [3]
        lista.addFirst(2); // [2, 3]
        lista.addFirst(1); // [1, 2, 3]

        // Inserción de elementos al final
        lista.addLast(4); // [1, 2, 3, 4]

        // Eliminación de un elemento específico
        lista.remove(Integer.valueOf(2)); // [1, 3, 4]

        // Mostrar la lista
        System.out.printf("Lista enlazada simple: %s ",lista);
    }
}

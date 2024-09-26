package EjemploListasEnlazadas.src;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Inserción de elementos
        lista.add("A"); // ["A"]
        lista.add("B"); // ["A", "B"]
        lista.add("C"); // ["A", "B", "C"]
        lista.add("D"); //["A","B","C","D"]

        // Muestro los elementos de la lista
        System.out.printf("Elementos de la lista: %s", lista);
//        for (String elemento : lista) {
//            System.out.print(elemento+" ");
//        }

        // Acceso a elementos
        System.out.println("\nElemento en índice 1: " + lista.get(1));
        // Imprime "B"
        System.out.println("\nElemento en índice 0: " + lista.get(0));
        // imprime "A"

        // Eliminación de elementos
        lista.removeFirst(); // Elimina "A", lista: ["B", "C", "D"]
        lista.removeLast();
        // Elimina "D", lista: ["C","B"]

        // Recorrido de la lista
        for (String elemento : lista) {
            System.out.print(elemento+" ");

        }
    }
}

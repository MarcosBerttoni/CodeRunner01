import java.util.*;

public class GrafoEtiquetado {

    private Map<String, List<String>> grafo;

    public GrafoEtiquetado() {
        grafo = new HashMap<>();
    }

    // Agregar nodo
    public void agregarNodo(String nodo) {
        grafo.put(nodo, new ArrayList<>());

    }

    // Agregar arista
    public void agregarArista(String origen, String destino) {
        grafo.get(origen).add(destino);
    }

    // Eliminar nodo
    public void eliminarNodo(String nodo) {
        grafo.remove(nodo);

        //Eliminar todas las referencias al nodo en las listas de adyacencia
        for (List<String> adyacentes : grafo.values()) {
            adyacentes.remove(nodo);
        }
    }

    // Eliminar arista
    public void eliminarArista(String origen, String destino) {
        grafo.get(origen).remove(destino);
    }

    // Mostrar grafo
    public void mostrarGrafo() {
        for (String nodo : grafo.keySet()) {
            System.out.println(nodo +" -> " + grafo.get(nodo));
        }
    }

}
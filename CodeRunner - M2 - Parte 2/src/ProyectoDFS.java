import java.util.*;

public class ProyectoDFS {
    // Método de Búsqueda en Profundidad (DFS) iterativa utilizando una pila
    public void dfsIterativa(Map<String, List<String>> grafo, String inicio) {
        Set<String> visitados = new HashSet<>();
        Stack<String> pila = new Stack<>();

        pila.push(inicio);
        visitados.add(inicio);

        while (!pila.isEmpty()) {
            String tareaActual = pila.pop();
            System.out.print(tareaActual + " ");

            List<String> dependencias = grafo.get(tareaActual);
            if (dependencias != null) {
                for (String dependencia : dependencias) {
                    if (!visitados.contains(dependencia)) {
                        pila.push(dependencia);
                        visitados.add(dependencia);
                    }
                }
            }
        }
    }
}
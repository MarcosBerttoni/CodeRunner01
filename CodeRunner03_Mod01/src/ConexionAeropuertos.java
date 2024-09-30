import java.util.*;

public class ConexionAeropuertos {
    private Map<String, Set<String>> grafo;

    public ConexionAeropuertos() {
        grafo = new HashMap<>();
    }

    // Agrega un nuevo aeropuerto al sistema
    public void agregarAeropuerto(String nombre) {
        //Completa el método, siguiendo la pauta dada, aquí.
        grafo.put(nombre, new HashSet<>());
    }

    // Agrega una ruta directa entre dos aeropuertos
    public void agregarRuta(String origen, String destino) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("Aeropuerto no encontrado.");
        if (grafo.containsKey(origen) && grafo.containsKey(destino)) {
            grafo.get(origen).add(destino);
        } else {
            throw new IllegalArgumentException("Aeropuerto no encontrado.");
        }

    }

    // Verifica si existe una ruta directa entre dos aeropuertos
    public boolean buscarRuta(String origen, String destino) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("Aeropuerto no encontrado.");
        if (!grafo.containsKey(origen) && grafo.containsKey(destino)) {
            throw new IllegalArgumentException("Aeropuerto no encontrado.");
        } else {
            return grafo.get(origen).contains(destino);
        }
    }

    // Elimina una ruta directa entre dos aeropuertos
    public void eliminarRuta(String origen, String destino) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("Ruta no encontrada.");
        if (grafo.containsKey(origen) && grafo.containsKey(destino)) {
            grafo.get(origen).remove(destino);
        } else {
            throw new IllegalArgumentException("Ruta no encontrada.");
        }
    }

    // Muestra todas las rutas directas desde un aeropuerto dado
    public void mostrarConexiones(String aeropuerto) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("Aeropuerto no encontrado.");
        if(grafo.containsKey(aeropuerto)) {
            System.out.println("Conexiones desde " + aeropuerto + ": "+grafo.get(aeropuerto).toString());
        }else{
            throw new IllegalArgumentException("Aeropuerto no encontrado.");
        }
    }
}
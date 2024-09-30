import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class AgendaContactos {
    // Tabla Hash para almacenar los contactos (nombre -> teléfono)
    private Map<String, String> contactos;
    // Constructor
    public AgendaContactos() {
        contactos = new HashMap<>();
    }
    // Método para agregar un nuevo contacto o actualizar el número de teléfono si el
    public void agregarContacto(String nombre, String telefono) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        contactos.put(nombre, telefono);
    }
    // Método para eliminar un contacto basado en el nombre
    public void eliminarContacto(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        contactos.remove(nombre);
    }
    // Método para buscar un contacto basado en el nombre
    public String buscarContacto(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
        return contactos.get(nombre);
    }
    // Método para listar todos los nombres de contactos en la agenda
    public Set<String> listarContactos() {
        return contactos.keySet();
    }
}

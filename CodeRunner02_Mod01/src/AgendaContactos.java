import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgendaContactos {

    private Map<String, String> contactos;

    public AgendaContactos() {
        //Completa el método, siguiendo la pauta dada, aquí.
        contactos = new HashMap<>();
    }

    public void agregarContacto(String nombre, String telefono) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        if(nombre != null || contactos.containsKey(nombre)){
                contactos.put(nombre,telefono);
        }else{
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
    }

    public void eliminarContacto(String nombre) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        if(nombre != null || contactos.containsKey(nombre)){
                contactos.remove(nombre);
        }else{
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
    }

    public String buscarContacto(String nombre) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        if(nombre != null || contactos.containsKey(nombre)){
            return contactos.get(nombre);
        }else{
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío");
        }
    }

    public Set<String> listarContactos() {
        //Completa el método, siguiendo la pauta dada, aquí.
       Set<String> contactosSet = new HashSet<>();
        for(String nombre : contactos.keySet()){
            contactosSet.add(nombre);
        }
        return contactosSet;
    }

}
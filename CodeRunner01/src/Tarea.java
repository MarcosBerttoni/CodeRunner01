public class Tarea {
    String nombre;
    int prioridad;

    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ")";
    }
}
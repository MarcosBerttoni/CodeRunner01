import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ListaDeTareas {
    private LinkedList<Tarea> listaDeTareas;

    // Clase interna 'Tarea' debe ser accesible desde dentro de ListaDeTareas
    private class Tarea {
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

    public ListaDeTareas() {
        this.listaDeTareas = new LinkedList<>();
    }

    // Agrega una tarea al final de la lista
    public void addTask(String nombre, int prioridad) {
        if(listaDeTareas.isEmpty()==false) {
            if(listaDeTareas.getFirst().prioridad < prioridad) {
                listaDeTareas.addFirst(new Tarea(nombre, prioridad));
            }else {
                listaDeTareas.addLast(new Tarea(nombre, prioridad));
            }
        } else {
        listaDeTareas.add(new Tarea(nombre,prioridad));
        }

    }

    // Inserta una tarea en un índice específico
    public void addTaskAt(int index, String nombre, int prioridad) {
        if (index < 0 || index > listaDeTareas.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        listaDeTareas.add(index, new Tarea(nombre, prioridad));
    }

    // Elimina la tarea en el índice especificado
    public void removeTask(int index) {
        if (index < 0 || index >= listaDeTareas.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        listaDeTareas.remove(index);
    }

    // Elimina la tarea por su nombre
    public void removeTaskByName(String nombre) {
        boolean found = false;
        for (Tarea tarea : listaDeTareas) {
            if (tarea.nombre.equals(nombre)) {
                listaDeTareas.remove(tarea);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new NoSuchElementException("Tarea no encontrada");
        }
    }

    // Devuelve la tarea en el índice especificado
    public String getTask(int index) {
        if (index < 0 || index >= listaDeTareas.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return listaDeTareas.get(index).toString();
    }

    // Devuelve la tarea por su nombre
    public String getTaskByName(String nombre) {
        for (Tarea tarea : listaDeTareas) {
            if (tarea.nombre.equals(nombre)) {
                return tarea.toString();
            }
        }
        throw new NoSuchElementException("Tarea no encontrada");
    }

    // Método adicional para mostrar la lista completa
    public void printTasks() {
        for (Tarea tarea : listaDeTareas) {
            System.out.println(tarea);
        }
    }
}


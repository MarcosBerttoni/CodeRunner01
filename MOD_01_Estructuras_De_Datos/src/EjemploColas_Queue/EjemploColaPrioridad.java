package EjemploColas_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class EjemploColaPrioridad {
    public static void main(String[] args) {
        Queue<Integer> colaPrioridad = new PriorityQueue<>();
        // Añadir elementos a la cola
        colaPrioridad.offer(3); // [3]
        colaPrioridad.offer(1); // [1, 3]
        colaPrioridad.offer(2); // [1, 3, 2]

        // Mostrar la cola actual
        System.out.println("Contenido de la cola de prioridad: " +
                colaPrioridad);

        // Obtener y eliminar el primer elemento de la cola de prioridad (Dequeue)
        int primerElemento = colaPrioridad.poll(); // 1, cola ahora es [2, 3]
        System.out.println("Primer elemento eliminado de la cola de prioridad: " + primerElemento);

        // Mostrar la cola después de eliminar el primer elemento
        System.out.println("Contenido de la cola de prioridad después de eliminar: " + colaPrioridad);

        // Obtener el primer elemento sin eliminarlo (Peek)
        int primerElementoSinEliminar = colaPrioridad.peek(); // 2
        System.out.println("Primer elemento de la cola de prioridad (sin eliminar): " + primerElementoSinEliminar);

        // Mostrar la cola después de ver el primer elemento
        System.out.println("Contenido de la cola de prioridad después de ver: " + colaPrioridad);

        // Verificar si la cola de prioridad está vacía
        boolean estaVacia = colaPrioridad.isEmpty(); // false
        System.out.println("¿La cola de prioridad está vacía?: " +
                estaVacia);

        // Obtener el tamaño de la cola de prioridad
        int tamaño = colaPrioridad.size(); // 2
        System.out.println("Tamaño de la cola de prioridad: " + tamaño);
    }
}

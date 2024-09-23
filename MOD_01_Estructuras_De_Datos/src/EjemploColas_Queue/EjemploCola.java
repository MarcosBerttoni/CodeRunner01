package EjemploColas_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.offer(1); // [1]
        cola.offer(2); // [1, 2]
        cola.offer(3); // [1, 2, 3]

        // Mostrar la cola actual
        System.out.println("Contenido de la cola: " + cola);

        // Obtener y eliminar el primer elemento de la cola (Dequeue)
        int primerElemento = cola.poll(); // 1, cola ahora es [2, 3]
        System.out.println("Primer elemento eliminado de la cola: " +
                primerElemento);

        // Mostrar la cola después de eliminar el primer elemento
        System.out.println("Contenido de la cola después de eliminar: "
                + cola);

        // Obtener el primer elemento sin eliminarlo (Peek)
        int primerElementoSinEliminar = cola.peek(); // 2
        System.out.println("Primer elemento de la cola (sin eliminar): "
                + primerElementoSinEliminar);

        // Mostrar la cola después de ver el primer elemento
        System.out.println("Contenido de la cola después de ver: " +
                cola);

        // Verificar si la cola está vacía
        boolean estaVacia = cola.isEmpty(); // false
        System.out.println("¿La cola está vacía?: " + estaVacia);

        // Obtener el tamaño de la cola
        int tamaño = cola.size(); // 2
        System.out.println("Tamaño de la cola: " + tamaño);
    }
}

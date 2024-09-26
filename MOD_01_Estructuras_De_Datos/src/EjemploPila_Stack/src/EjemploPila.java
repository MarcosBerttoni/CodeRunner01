import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Operaciones básicas
        pila.push(1); // [1]
        pila.push(2); // [1, 2]
        pila.push(3); // [1, 2, 3]

        // Peek: obtener el elemento superior sin eliminarlo
        int elementoSuperior = pila.peek(); // 3
        System.out.println("Elemento superior de la pila: " +
                elementoSuperior);
        // Pop: eliminar y devolver el elemento superior
        int elementoEliminado = pila.pop(); // 3, pila ahora es [1, 2]
        System.out.println("Elemento eliminado de la pila: " +
                elementoEliminado);

        // Verificar si la pila está vacía
        boolean estaVacia = pila.empty(); // false

        // Mostrar la pila actual
        System.out.println("Contenido de la pila: " + pila);
    }
}
package ListasCirculares;

public class ListaCircular {
    private Nodo cabeza = null;
    private Nodo cola = null;
    // Agregar un nodo al final de la lista
    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza; // Conectar el único nodo a sí mismo
        } else {
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza; // Hacerla circular
        }
    }
    // Mostrar los elementos de la lista circular
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        do {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println(); // Salto de línea después de mostrar la lista
    }
}

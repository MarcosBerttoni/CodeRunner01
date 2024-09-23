package ListasCirculares;

public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        // Agregar elementos a la lista
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(6);
        lista.agregar(7);
        lista.agregar(8);
        lista.agregar(9);
        lista.agregar(10);


        // Mostrar la lista circular
        System.out.println("Lista circular: ");
        lista.mostrar();
    }
}

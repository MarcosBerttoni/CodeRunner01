import java.util.ArrayList;

    public class ListaEnlazada {
        private ArrayList<Integer> lista;

        public ListaEnlazada() {
            this.lista = new ArrayList<>();
        }

        // Agrega un elemento al inicio de la lista
        public void addFirst(int elemento) {
            lista.add(0, elemento);
        }

        // Inserta un elemento en un índice específico
        public void add(int index, int elemento) {
            if (index < 0 || index > lista.size()) {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }
            lista.add(index, elemento);
        }

        // Elimina el elemento en el índice especificado
        public void remove(int index) {
            if (index < 0 || index >= lista.size()) {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }
            lista.remove(index);
        }

        // Devuelve el elemento en el índice especificado
        public int get(int index) {
            if (index < 0 || index >= lista.size()) {
                throw new IndexOutOfBoundsException("Índice fuera de rango");
            }
            return lista.get(index);
        }

        // Devuelve el tamaño de la lista
        public int size() {
            return lista.size();
        }
    }
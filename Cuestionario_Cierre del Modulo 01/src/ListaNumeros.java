import java.util.ArrayList;

public class ListaNumeros {
    private ArrayList<Integer> lista;

    public ListaNumeros() {
        this.lista = new ArrayList<>();
    }

    public void agregarAlInicio(int numero) {
      //  if (!lista.contains(numero)) {
            lista.add(0,numero);
       // }

    }

    public void eliminar(int index) {
        // Agregue la implementación aquí
        // Use esta línea para lanzar la excepción: throw new IndexOutOfBoundsException("Índice inválido");
        if (index < 0 || index >= lista.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        lista.remove(index);
    }

    public int obtener(int index) {
        // Agregue la implementación aquí
        // Use esta línea para lanzar la excepción: throw new IndexOutOfBoundsException("Índice inválido");
        if (index < 0 || index >= lista.size()) {
            throw new IndexOutOfBoundsException("Índice inválido");
        }
        return lista.get(index);
    }
}
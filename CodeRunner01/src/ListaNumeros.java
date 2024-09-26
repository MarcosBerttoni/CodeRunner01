import java.util.ArrayList;

public class ListaNumeros {
    private ArrayList<Integer> lista;

    public ListaNumeros() {
        this.lista = new ArrayList<>();
    }

    public void agregarAlInicio(int numero) {
        if(lista.isEmpty()) {
            lista.add(numero);
        }else{
            lista.add(lista.size()-1, numero);
            //lista.addFirst(numero);
        }
    }

    public void eliminar(int index) {
        // Agregue la implementación aquí
        // Use esta línea para lanzar la excepción: throw new IndexOutOfBoundsException("Índice inválido");
        if(index >= 0 && index < lista.size()) {
            lista.remove(index);
        }else{
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }

    public int obtener(int index) {
        // Agregue la implementación aquí
        // Use esta línea para lanzar la excepción: throw new IndexOutOfBoundsException("Índice inválido");
        if(index >= 0 && index < lista.size()) {
            return lista.get(index);
        }else{
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }
}
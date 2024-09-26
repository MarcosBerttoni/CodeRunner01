import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.NoSuchElementException;

public class HistorialNavegador {

    private Stack<String> pilaHistorial;

    public HistorialNavegador() {
        //Completa el método, siguiendo la pauta dada, aquí.
        pilaHistorial = new Stack<>();
    }

    public void visitarPagina(String url) {
        //Completa el método, siguiendo la pauta dada, aquí.
        pilaHistorial.push(url);
    }

    public String retroceder() {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new NoSuchElementException("No hay páginas en el historial");
        if(pilaHistorial.isEmpty()) {
            throw new NoSuchElementException("No hay páginas en el historial");
        }else{
            return pilaHistorial.pop();
        }
    }

    public String verUltimaPagina() {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new NoSuchElementException("No hay páginas en el historial");
        if(pilaHistorial.isEmpty()) {
            throw new NoSuchElementException("No hay páginas en el historial");
        }else{
            return pilaHistorial.peek();
        }
    }

    public String verHistorialCompleto() {
        if (pilaHistorial.empty()) {
            return "El historial está vacío";
        }

        StringBuilder resultado = new StringBuilder("Historial de navegación:\n");
        List<String> listaHistorial = new ArrayList<>(pilaHistorial);

        //Completa el método, siguiendo la pauta dada, aquí. Lo único que debes agregar es el for que recorre y agrega.
      for (int i = listaHistorial.size() - 1; i >=0 ; i--) {
          resultado.append(listaHistorial.get(i)).append("\n");
      }
        return resultado.toString();
    }
}
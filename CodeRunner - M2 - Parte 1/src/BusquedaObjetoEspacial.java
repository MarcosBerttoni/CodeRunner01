/*Eres el encargado de mantenimiento en una nave espacial,
y uno de los astronautas ha perdido una herramienta crucial
en la bodega de carga. Tienes un inventario desordenado con
miles de objetos almacenados, y necesitas encontrar la herramienta
lo más rápido posible antes de que la nave llegue a su destino.

Implementa una función en Java que realice una búsqueda lineal
para encontrar la herramienta en el inventario. El tiempo es limitado,
así que también deberás medir cuánto tarda la búsqueda para diferentes
tamaños de inventarios, ya que la nave está expandiendo su capacidad de carga.

Instrucciones:

Implementa la función buscarObjeto(String[] inventario, String objetoBuscado)
que recorra el inventario de la nave y busque la herramienta específica. Si el
objeto está en el inventario, la función debe devolver el índice donde se encuentra;
en caso contrario, devolverá -1.

Implementa una función llamada calcularTiempoBusqueda(String[] inventario, String
objetoBuscado) que se encargue de medir el tiempo que tarda en ejecutarse la búsqueda lineal.
Esta función debe llamar a la función buscarObjeto y devolver el tiempo de ejecución en
nanosegundos. Utiliza System.nanoTime() para obtener el tiempo antes y después de la ejecución
de la búsqueda, y retornar la diferencia entre ambos.*/

public class BusquedaObjetoEspacial {

    // Función de búsqueda lineal
    public int buscarObjeto(String[] inventario, String objetoBuscado) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].equals(objetoBuscado)) {
                return i; // Devuelve el índice donde se encuentra el objeto
            }
        }
        return -1; // Devuelve -1 si no se encuentra el objeto

    }
    // Función que mide el tiempo de ejecución de la búsqueda
    public long calcularTiempoBusqueda(String[] inventario, String objetoBuscado) {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para tomar el tiempo (al inicio y al fin): long inicio = System.nanoTime();
        long tiempoInicial = System.nanoTime(); // Obtiene el tiempo inicial en nanosegundos
        buscarObjeto(inventario, objetoBuscado); // Realiza la búsqueda
        long tiempoFinal = System.nanoTime(); // Obtiene el tiempo final en nanosegundos
        return tiempoFinal - tiempoInicial; // Calcula la diferencia en nanosegundos
    }
}

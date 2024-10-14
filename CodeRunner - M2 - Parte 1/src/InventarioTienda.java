/*
Eres parte de un equipo que administra el inventario de una tienda.
Los productos en el inventario están ordenados alfabéticamente, y tu
tarea es implementar una solución que permita buscar un objeto específico
de forma eficiente utilizando el algoritmo de búsqueda binaria. Además,
debes calcular la complejidad temporal del algoritmo.

Requisitos:

Implementa una función llamada buscarObjetoBinario, que tome como
parámetros un arreglo de cadenas de texto ordenadas alfabéticamente
y una cadena que representa el objeto a buscar.
El algoritmo debe aplicar el método de búsqueda binaria.
La función debe devolver el índice del objeto encontrado en el inventario
o -1 si el objeto no se encuentra en el arreglo.
NO se permite usar la función Arrays.binarySearch de Java.
Debes implementar el algoritmo de búsqueda binaria desde cero.
Para cada llamada de búsqueda, Si el objeto está en el inventario,
la función debe devolver el índice donde se encuentra; en caso contrario, devolverá -1.

Ayuda para Implementación:

Función de búsqueda binaria:
Usa los índices inicio, fin, y medio para dividir el arreglo en mitades.
Si el objeto en medio es igual al objeto buscado, devuelve el índice.
Si el objeto buscado es menor que el objeto en medio, ajusta el índice de fin.
Si el objeto buscado es mayor que el objeto en medio, ajusta el índice de inicio.
Continúa dividiendo hasta encontrar el objeto o hasta que inicio sea mayor que fin.
* */

public class InventarioTienda {

    // Función de búsqueda binaria
    public int buscarObjetoBinario(String[] inventario, String objetoBuscado) {
        int inicio = 0;
        int fin = inventario.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; // Calcula el índice medio

            // Compara el objeto en la posición "medio" con el "objetoBuscado"
            if (inventario[medio].compareTo(objetoBuscado) == 0) {
                return medio; // Devuelve el índice si encontró el objeto
            }

            // Si el objetoBuscado es menor, ajusta el índice de fin
            if (inventario[medio].compareTo(objetoBuscado) > 0) {
                fin = medio - 1;
            }
            // Si el objetoBuscado es mayor, ajusta el índice de inicio
            else {
                inicio = medio + 1;
            }
        }
        return -1; // Si no se encuentra, devuelve -1
    }
}
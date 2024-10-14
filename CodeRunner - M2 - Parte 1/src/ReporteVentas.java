/*
* La empresa GobalInvent tiene un sistema de gestión de inventarios
* que genera reportes de ventas mensuales. Estos reportes están almacenados
* en una lista desordenada por nombre de producto, y se necesita ordenarlos
* alfabéticamente para facilitar la elaboración de informes y el análisis de datos.

Para solucionar esto, se ha decidido utilizar el algoritmo Mergesort para ordenar
* los nombres de los productos en los reportes. Tu tarea es implementar el algoritmo
* Mergesort para ordenar una lista de nombres de productos en orden alfabético.

Implementa la función mergesort para ordenar un arreglo de nombres de productos alfabéticamente.
* Como auxiliares para desarrollar dichos métodos, se tiene dos métodos que ya desarrolló un
* compañero de trabajo: merge que combina dos subarreglos ordenados en un solo subarreglo ordenado
* y el método mergesortRecursive que realiza la división recursiva del arreglo en subarreglos más
* pequeños y llama al método merge para combinarlos..*/
public class ReporteVentas {

    // Función de Mergesort para ordenar la lista de nombres de productos
    public void mergesort(String[] productos) {
        //Completa el método, siguiendo la pauta dada, aquí.

        if (productos == null || productos.length < 2) {
            return; // Si el arreglo es nulo o tiene menos de 2 elementos, no necesita ordenarse
        }

        // Arreglo auxiliar para realizar las combinaciones
        String[] aux = new String[productos.length];

        // Llama a la función recursiva mergesortRecursive
        mergesortRecursive(productos, aux, 0, productos.length - 1);

    }

    private void mergesortRecursive(String[] productos, String[] aux, int bajo, int alto) {
        if (bajo < alto) {
            int medio = (bajo + alto) / 2;
            mergesortRecursive(productos, aux, bajo, medio);
            mergesortRecursive(productos, aux, medio + 1, alto);
            merge(productos, aux, bajo, medio, alto);
        }
    }

    private static void merge(String[] productos, String[] aux, int bajo, int medio, int alto) {
        for (int i = bajo; i <= alto; i++) {
            aux[i] = productos[i];
        }

        int i = bajo;
        int j = medio + 1;
        for (int k = bajo; k <= alto; k++) {
            if (i > medio) {
                productos[k] = aux[j++];
            } else if (j > alto) {
                productos[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                productos[k] = aux[j++];
            } else {
                productos[k] = aux[i++];
            }
        }
    }
}

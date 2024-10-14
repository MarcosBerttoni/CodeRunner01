/*
* Estás desarrollando una aplicación para gestionar un torneo de
* videojuegos en una plataforma de eventos en línea. Cada jugador
* en el torneo tiene una puntuación basada en su rendimiento en el juego.
* Estas puntuaciones son números enteros que representan la cantidad de puntos
* obtenidos por cada jugador. El objetivo de esta aplicación es ordenar las
* puntuaciones de los jugadores para determinar los rankings y premiar a los mejores jugadores.

Para facilitar la visualización de los resultados y mejorar la experiencia del usuario,
* necesitas implementar un algoritmo de ordenamiento eficiente que pueda manejar listas de
* puntuaciones de diferentes tamaños y distribuciones. En este caso, se utilizará el
* algoritmo Heapsort para ordenar las puntuaciones en orden descendente, es decir, de la
* puntuación más alta a la más baja.

Implementa el algoritmo Heapsort dentro del método heapsort para ordenar un arreglo de
* puntuaciones de jugadores, La lista de puntuaciones debe ser ordenada en orden descendente,
* con las puntuaciones más altas al principio de la lista y las más bajas al final.
* Como auxiliar para desarrollar dicho método, se tiene un método que ya desarrolló un compañero
* de trabajo: heapify que su propósito es asegurar que una subestructura de un arreglo o lista
* cumpla con las propiedades de un heap.*/

public class GestorPuntuaciones {
    // Función de Heapsort para ordenar la lista de puntuaciones
    public void heapsort(int[] puntuaciones) {
        //Completa el método, siguiendo la pauta dada, aquí.

        int n = puntuaciones.length;
            // Construir el heap máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(puntuaciones, n, i);
        }
        // Extraer elementos del heap
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final
            int temp = puntuaciones[0];
            puntuaciones[0] = puntuaciones[i];
            puntuaciones[i] = temp;
            // Llamar a heapify en el heap reducido
            heapify(puntuaciones, i, 0);
        }

    }

    private void heapify(int[] puntuaciones, int n, int i) {
        int mayor = i; // Inicializar el mayor como raíz
        int izquierda = 2 * i + 1; // izquierda = 2*i + 1
        int derecha = 2 * i + 2; // derecha = 2*i + 2

        // Si el hijo izquierdo es mayor que la raíz
        if (izquierda < n && puntuaciones[izquierda] > puntuaciones[mayor]) {
            mayor = izquierda;
        }

        // Si el hijo derecho es mayor que la raíz
        if (derecha < n && puntuaciones[derecha] > puntuaciones[mayor]) {
            mayor = derecha;
        }

        // Si el mayor no es la raíz
        if (mayor != i) {
            int temp = puntuaciones[i];
            puntuaciones[i] = puntuaciones[mayor];
            puntuaciones[mayor] = temp;

            // Llamar a heapify recursivamente en el subárbol afectado
            heapify(puntuaciones, n, mayor);
        }
    }
}

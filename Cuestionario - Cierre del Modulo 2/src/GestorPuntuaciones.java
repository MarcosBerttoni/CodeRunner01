public class GestorPuntuaciones {
    // Función de Heapsort para ordenar la lista de puntuaciones
    public void heapsort(int[] puntuaciones) {
        int n = puntuaciones.length;

        // Construir el heap (reorganizar el arreglo)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(puntuaciones, n, i);
        }

        // Extraer elementos uno por uno del heap
        for (int i = n - 1; i >= 0; i--) {
            // Mover la raíz actual al final
            int temp = puntuaciones[0];
            puntuaciones[0] = puntuaciones[i];
            puntuaciones[i] = temp;

            // Llamar a heapify en el heap reducido
            heapify(puntuaciones, i, 0);
        }

        // Invertir el arreglo para obtener orden descendente
//        for (int i = 0; i < n / 2; i++) {
//            int temp = puntuaciones[i];
//            puntuaciones[i] = puntuaciones[n - i - 1];
//            puntuaciones[n - i - 1] = temp;
//        }
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

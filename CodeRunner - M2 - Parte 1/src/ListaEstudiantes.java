/*
* En la Escuela Primaria KinderProg, al final del año académico,
* se realiza una ceremonia de entrega de certificados de reconocimiento
* a los estudiantes destacados. Para agilizar el proceso de impresión,
* la administración necesita que los nombres de los estudiantes se encuentren
* ordenados alfabéticamente antes de imprimirlos en los certificados.

Para lograr esto, se ha decidido usar el algoritmo Quicksort para ordenar la
* lista de nombres de los estudiantes. Tu tarea es implementar una función que
* utilice Quicksort para ordenar un arreglo de nombres de estudiantes alfabéticamente.

Implementa la función quicksort(String[] estudiantes, int bajo, int alto) para
* ordenar un arreglo de nombres de estudiantes alfabéticamente. Como auxiliares
* para desarrollar dicho método, se incluirán los métodos que ya desarrolló un
* compañero de trabajo de la escuela:  particionarque separa el arreglo en subarreglos
* con elementos menores y mayores que el pivote y el método intercambiarque intercambia
* dos elementos del arreglo.*/

public class ListaEstudiantes {
    // Función de Quicksort para ordenar la lista de estudiantes
    public static void quicksort(String[] estudiantes, int bajo, int alto) {
        //Completa el método, siguiendo la pauta y las recomendaciones dadas, aquí.
        if (bajo < alto) {
            int pi = particionar(estudiantes, bajo, alto);
            quicksort(estudiantes, bajo, pi - 1);
            quicksort(estudiantes, pi + 1, alto);
        }
    }

    private static int particionar(String[] estudiantes, int bajo, int alto) {
        String pivote = estudiantes[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (estudiantes[j].compareTo(pivote) <= 0) {
                i++;
                intercambiar(estudiantes, i, j);
            }
        }
        intercambiar(estudiantes, i + 1, alto);
        return i + 1;
    }

    private static void intercambiar(String[] estudiantes, int i, int j) {
        String temp = estudiantes[i];
        estudiantes[i] = estudiantes[j];
        estudiantes[j] = temp;
    }
}

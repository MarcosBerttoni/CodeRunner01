/*
* Trabajas para una empresa de logística que gestiona la distribución de
* productos entre múltiples ciudades. La empresa quiere optimizar la ruta
* de un conductor que debe visitar una serie de ciudades para realizar entregas
* y regresar a la ciudad de origen. El objetivo es encontrar la ruta más corta
* que pase por todas las ciudades exactamente una vez y regrese al punto de partida.

Este problema se conoce como el Problema del Viajante (TSP), y la solución
* permitirá optimizar los costos de transporte y reducir el tiempo de entrega.

Se te proporciona un número de ciudades y las distancias entre cada par de ciudades.
* Debes escribir el método int tsp(int[][] distancias, boolean[] visitado, int pos,
* int n, int conteo, int costo, int costoMinimo) en Java que determine la ruta mínima
* que recorra todas las ciudades exactamente una vez y vuelva a la ciudad de origen,
* minimizando la distancia total recorrida.

Entrada:

Un número entero n que representa el número de ciudades.
Una matriz distancias[][] de tamaño n x n, donde distancias[i][j] representa la
* distancia entre la ciudad i y la ciudad j.
Salida:

El programa debe retornar la distancia mínima que recorre el conductor pasando por
* todas las ciudades y regresando al punto de partida.*/

public class ViajanteLogistica {

    // Función para calcular la distancia mínima que pasa por todas las ciudades
    public int tsp(int[][] distancias, boolean[] visitado, int pos, int n, int conteo, int costo, int costoMinimo) {
        // Si hemos visitado todas las ciudades, regresamos al punto de partida (ciudad inicial)
        if (conteo == n && distancias[pos][0] > 0) {
            costoMinimo = Math.min(costoMinimo, costo + distancias[pos][0]);
            return costoMinimo;
        }

        // Recorremos todas las ciudades posibles
        for (int i = 0; i < n; i++) {
            // Verificamos si la ciudad no ha sido visitada y que la distancia sea válida
            if (!visitado[i] && distancias[pos][i] > 0) {
                // Marcamos la ciudad como visitada
                visitado[i] = true;

                // Recursivamente calculamos el costo de visitar la siguiente ciudad
                costoMinimo = tsp(distancias, visitado, i, n, conteo + 1, costo + distancias[pos][i], costoMinimo);

                // Volvemos a desmarcar la ciudad para otras combinaciones
                visitado[i] = false;
            }
        }

        return costoMinimo;
    }
}
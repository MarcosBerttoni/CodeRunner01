/*
* En una tienda de antigüedades, el propietario debe maximizar el
* valor de los objetos que puede llevar en su camión de reparto.
* El camión tiene un límite de peso, y cada objeto tiene un valor
* asociado y un peso específico. El objetivo es seleccionar los
* objetos de manera que se maximice el valor total de los objetos transportados,
* sin exceder el límite de peso del camión.

Implementa el algoritmo de resolución del Problema de la Mochila (Knapsack Problem),
* donde el objetivo es maximizar el valor de los objetos seleccionados bajo una
* restricción de peso en el método resolverKnapsack(int[] valores, int[] pesos, int capacidad .

Contexto del método:

Entrada:
Una lista de valores y otra de pesos, donde cada objeto tiene un valor y un peso.
Un número entero (capacidad) que representa el límite de peso que el camión puede transportar.
Salida:
El valor máximo que se puede obtener transportando un subconjunto de objetos sin exceder
* el límite de peso.
*
Implementación:
Usa el algoritmo de programación dinámica para resolver el problema de la mochila.
*/

public class CamionAntiguedades {
    // Método para resolver el problema de la mochila usando programación dinámica
    public int resolverKnapsack(int[] valores, int[] pesos, int capacidad) {
        //Completa el método, siguiendo la pauta dada, aquí.
        int n = valores.length;
        int[][] dp = new int[n + 1][capacidad + 1];
        // Construir la tabla dp
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidad; w++) {
                if (pesos[i - 1] <= w) {
                    dp[i][w] = Math.max(valores[i - 1] + dp[i - 1][w -
                            pesos[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacidad];
    }
}

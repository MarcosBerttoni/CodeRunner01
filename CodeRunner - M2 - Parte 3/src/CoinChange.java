import java.util.Arrays;

public class CoinChange {
    public int minCoins(int[] coins, int amount) {
        // Creamos un array para almacenar los resultados intermedios (memorización)
        int[] memo = new int[amount + 1];
        // Llenamos el array con un valor mayor al posible (infinito)
        Arrays.fill(memo, amount + 1);
        // Caso base: para obtener 0 monedas, necesitamos 0 monedas
        memo[0] = 0;

        // Iteramos sobre cada monto desde 1 hasta amount
        for (int i = 1; i <= amount; i++) {
            // Iteramos sobre cada moneda disponible
            for (int coin : coins) {
                // Si la moneda es menor o igual al monto actual
                if (coin <= i) {
                    // Actualizamos el valor en memo usando la fórmula de la programación dinámica
                    memo[i] = Math.min(memo[i], memo[i - coin] + 1);
                }
            }
        }

        // Si no es posible alcanzar el monto, devolvemos -1
        return memo[amount] > amount ? -1 : memo[amount];
    }
}

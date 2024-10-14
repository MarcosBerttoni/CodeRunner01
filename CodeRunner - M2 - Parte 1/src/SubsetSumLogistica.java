public class SubsetSumLogistica {
    // Función para comprobar si existe un subconjunto de productos con el peso objetivo
    public boolean esPosibleCargarCamion(int[] productos, int n, int capacidadMaxima) {
        //Completa el método, siguiendo la pauta dada, aquí.
        return esSumaSubconjunto(productos, capacidadMaxima, productos.length);
    }
    private boolean esSumaSubconjunto(int[] arr, int suma, int n) {
        if (suma == 0)
            return true;
        if (n == 0 || suma < 0)
            return false;
            // Caso 1: Incluye el último elemento en el subconjunto
            // Caso 2: Excluye el último elemento del subconjunto
        return esSumaSubconjunto(arr, suma - arr[n - 1], n - 1) ||
                esSumaSubconjunto(arr, suma, n - 1);
    }
}

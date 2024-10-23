public class ProductoDigitos {
    // Método recursivo para calcular el producto de los dígitos
    public int productoDigitos(int numero) {
        // Caso especial: si el número es 0, el producto de sus dígitos es 0
        if (numero == 0) {
            return 0;
        }
        // Convertimos el número a positivo si es negativo
        if (numero < 0) {
            numero = -numero;
        }
        // Caso base: si el número es menor a 10, el producto de sus dígitos es el número mismo
        if (numero < 10) {
            return numero;
        }
        // Llamada recursiva: multiplicar el último dígito y calcular el producto del resto
        return (numero % 10) * productoDigitos(numero / 10);
    }

}

public class ContarDigitos {
    public int contarDigitos(int numero) {
        // Caso especial: si el número es 0, tiene un solo dígito
        if (numero == 0) {
            return 1;
        }
        // Si el número es negativo, lo convertimos a positivo
        if (numero < 0) {
            numero = -numero;
        }
        // Caso base: si el número es menor a 10, tiene un solo dígito
        if (numero < 10) {
            return 1;
        }
        // Llamada recursiva: eliminar el último dígito y contar el resto
        return 1 + contarDigitos(numero / 10);
    }
}

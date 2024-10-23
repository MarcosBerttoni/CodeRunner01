public class SumarDigitos {
    // Método recursivo para sumar los dígitos
    public int sumarDigitos(int numero) {
        // Convertimos el número a positivo si es negativo
        if (numero < 0) {
            numero = -numero;
        }
        // Caso base: si el número es 0, la suma de sus dígitos es 0
        if (numero == 0) {
            return 0;
        }
        // Caso recursivo: sumamos el último dígito y llamamos recursivamente con el resto
        return numero % 10 + sumarDigitos(numero / 10);
    }

}

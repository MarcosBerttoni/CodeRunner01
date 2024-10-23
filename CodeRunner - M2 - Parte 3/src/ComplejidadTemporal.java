public class ComplejidadTemporal {
    public int encontrarMaximo(int[] arr) {
        int maximo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > maximo) {
                    maximo = arr[j];
                }
            }
        }
        return maximo;
    }

    public int encontrarMaximoEficiente(int[] arr) {
        int maximo = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }
}

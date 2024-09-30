public class Main {
    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();
        lista.agregarAlInicio(5);
        lista.agregarAlInicio(10);
        System.out.println(lista.obtener(0));
        System.out.println(lista.obtener(1));

    }
}
public class Documento implements Imprimible {
    private String nombre;
    private int nroPaginas;

    public Documento(String nombre, int nroPaginas) {
        this.nombre = nombre;
        this.nroPaginas = nroPaginas;
    }

    @Override
    public void imprimir() {
        System.out.println("El Documento se está imprimiendo!");
    }
}

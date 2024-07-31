public class Foto implements Imprimible{
    private String nombre;
    private String tamañoFoto;

    public Foto(String nombre, String tamañoFoto) {
        this.nombre = nombre;
        this.tamañoFoto = tamañoFoto;
    }

    @Override
    public void imprimir() {
        System.out.println("Se esta imprimiendo la Foto!");
    }
}

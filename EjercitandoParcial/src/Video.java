public class Video implements Imprimible{
    private String titulo;
    private int duracionEnMinutos;

    public Video(String titulo, int duracionEnMinutos) {
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public void imprimir() {
        System.out.println("Se imprime el Video");
    }
}

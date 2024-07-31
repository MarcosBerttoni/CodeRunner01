public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int nroPagina;

    public Libro(String titulo, String autor, int anioPublicacion, int nroPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.nroPagina = nroPagina;
    }
    public void mostrarInformacion(){
        System.out.println("\n----------------------------------------");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Anio Publicacion: " + this.anioPublicacion);
        System.out.println("Nro Pagina: " + this.nroPagina);
    }
}

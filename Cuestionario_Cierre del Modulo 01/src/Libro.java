import java.util.*;

class Libro {
    private String titulo;
    private int anoPublicacion;

    public Libro(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    @Override
    public String toString() {
        return titulo + " (" + anoPublicacion + ")";
    }
}

import java.util.ArrayList;
import java.util.LinkedList;

public class Carpeta extends Archivo{
    private ArrayList<Archivo> archivos;

    public Carpeta(String nombre) {
        super(nombre, 0);
        this.archivos = new ArrayList<Archivo>();
    }

    public ArrayList<Archivo> getArchivos() {
        return archivos;
    }

    public void agregarArchivo(Archivo archivo) {
        this.archivos.add(archivo);
    }

    @Override
    public double calcularEspacioOcupado() throws calcularTamañoException{
        if(this.archivos.size() < 0) {
            throw new calcularTamañoException();
        }

        double tamañoTotal = 0;
        for(Archivo a: archivos) {
            tamañoTotal += a.calcularEspacioOcupado();
        }
        return tamañoTotal;
    }
    public void mostrarArchivos(LinkedList<Archivo> archivos) {
        for(Archivo archivo : archivos) {
            System.out.print("Nombre: "+archivo.nombre);
            System.out.print(" Tamaño: "+archivo.tamaño+" MB\n");
        }
    }
}

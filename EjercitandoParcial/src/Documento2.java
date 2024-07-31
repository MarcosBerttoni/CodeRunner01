public class Documento2 extends Archivo{

    public Documento2(String nombre, int tamaño) {
        super(nombre, tamaño);
    }

    @Override
    public double calcularEspacioOcupado() {
        return this.tamaño;
    }
}

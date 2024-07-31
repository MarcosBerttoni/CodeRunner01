public class Cubo extends Figura3D{
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}

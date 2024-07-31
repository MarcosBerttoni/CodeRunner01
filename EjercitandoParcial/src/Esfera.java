public class Esfera extends Figura3D{
    private double lado;

    public Esfera(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolumen() {
        return (3.0/4.0) * Math.PI * Math.pow(lado, 2);
    }
}

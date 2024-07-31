public class Cono extends Figura3D{
    private double altura;
    private double radio;

    public Cono(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    @Override
    public double calcularVolumen() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * this.altura;
    }
}

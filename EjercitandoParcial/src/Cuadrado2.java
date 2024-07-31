public class Cuadrado2 implements Calculable{
    private int lado;

    public Cuadrado2(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}

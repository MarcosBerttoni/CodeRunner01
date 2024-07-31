public class Automovil extends Vehiculo {

    public Automovil(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    void arrancar() {
        System.out.println("Automovil encendio");
    }

    @Override
    void frenar() {
        System.out.println("Automovil frenado");
    }

    @Override
    void doblar() {
        System.out.println("Automovil doblado");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}

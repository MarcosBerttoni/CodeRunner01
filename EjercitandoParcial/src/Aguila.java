public class Aguila extends Ave{
    private double envergadura;

    public Aguila(String nombre, String color, double envergadura) {
        super(nombre, color);
        this.envergadura = envergadura;
    }
    public void volarAlto(){
        System.out.println("Aguila vuela alto...");
    }

    @Override
    public String toString() {
        return "Aguila { " + " envergadura = " + envergadura + " }";
    }
}

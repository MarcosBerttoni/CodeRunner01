public class Canario extends Ave {
    private String canto;

    public Canario(String nombre, String color, String canto) {
        super(nombre, color);
        this.canto = canto;
    }
    public void cantar(){
        System.out.println("Canario esta cantando...");
    }

    @Override
    public String toString() {
        return "Canario { " + " canto = " + canto + " }";
    }
}

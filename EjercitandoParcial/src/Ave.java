public class Ave {
    private String nombre;
    private String color;

    public Ave(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ave { " +
                "nombre = '" + nombre + '\'' +
                ", color = '" + color + '\'' +
                " }";
    }
}

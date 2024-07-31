public class Personal {
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    public Personal(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    public void mostrarDatos(){
        System.out.println("---------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion.getDireccion());

    }
}

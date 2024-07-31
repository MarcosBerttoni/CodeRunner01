public class Estudiante {
    private String nombre;
    private int edad;
    private double calificacion;

    public Estudiante(String nombre, int edad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return nombre+","+edad+"," + calificacion;
    }

    public void mostrarDatosEstudiantes(){
        System.out.println("--------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificacion: " + calificacion);
    }
}

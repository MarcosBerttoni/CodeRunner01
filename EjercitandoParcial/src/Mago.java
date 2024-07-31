public class Mago extends Personaje {
    private int puntosMagia;

    public Mago(String nombre, int puntosSalud, int puntosMagia) {
        super(nombre, puntosSalud);
        this.puntosMagia = puntosMagia;
    }

    public void lanzarHechizo(){
        System.out.println("Lanzando Hechizo...");
    }
}

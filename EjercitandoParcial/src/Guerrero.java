public class Guerrero extends Personaje {
    private int puntosAtaque;

    public Guerrero(String nombre, int puntosSalud, int puntosAtaque) {
        super(nombre, puntosSalud);
        this.puntosAtaque = puntosAtaque;
    }

    public void atacar(){
        System.out.println("Atacando...");
    }
}

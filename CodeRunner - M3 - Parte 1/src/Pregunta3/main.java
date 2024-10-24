package Pregunta3;

public class main {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();
        Animal perro = factory.crearAnimal("Perro");
        System.out.println(perro.hacerSonido());

        AnimalFactory factory2 = new AnimalFactory();
        Animal animal = factory2.crearAnimal("Caballo");
        System.out.println(animal == null);
    }
}

package Pregunta3;

// Clase AnimalFactory que crea animales
class AnimalFactory {
    public Animal crearAnimal(String tipo) {
        if (tipo == null) {
            return null;
        }
        if(tipo.equals("Perro")){
            return new Perro();
        }else if(tipo.equals("Gato")){
            return new Gato();
        }
        // Agregue las instrucciones aquí
        return null;
    }
}
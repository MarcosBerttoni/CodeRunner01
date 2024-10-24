package Pregunta4;

class VehiculoFactory {

    public Vehiculo crearVehiculo(String tipo) {
        if(tipo.equals("Moto")) {
            return new Moto();
        }else if(tipo.equals("Auto")) {
            return new Auto();
        }
        return null;
    }
}

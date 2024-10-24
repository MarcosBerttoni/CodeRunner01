package Pregunta4;

public class Main {
    public static void main(String[] args) {
//        VehiculoFactory factory = new VehiculoFactory();
//        Vehiculo auto = factory.crearVehiculo("Auto");
//        System.out.println(auto.tipoVehiculo());

        VehiculoFactory factory = new VehiculoFactory();
        Vehiculo vehiculo = factory.crearVehiculo("Camion");
        System.out.println(vehiculo == null);
    }
}

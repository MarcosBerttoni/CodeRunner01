public class Singleton {

    private static Singleton instance;
    private int counter;

    // Constructor privado
    private Singleton() {
        counter = 0;
    }

    // Método para obtener la única instancia de la clase
    public static Singleton getInstance() {
        // Agregue las instrucciones correctas
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // Método para incrementar el contador
    public void incrementCounter() {
        // Agregue la instrucción correcta
        counter++;
    }

    // Método para obtener el valor del contador
    public int getCounter() {
        // Agregue la instrucción correcta
        return counter;
    }
}
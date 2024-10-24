import java.util.ArrayList;
/*
Implementa el patrón Singleton en Java para una clase llamada Logger. Este Logger almacenará
un historial de mensajes y permitirá registrar nuevas entradas a través de un método llamado logMessage.
Debes crear los siguientes métodos:

getInstance(): Este método devuelve la única instancia de la clase Logger.
logMessage(String message): Este método registra un nuevo mensaje en el historial.
getLog(): Este método devuelve el historial completo de mensajes en un solo String
*/


public class Logger {

    private static Logger instance;
    private ArrayList<String> logMessages;

    // Constructor privado
    private Logger() {
        logMessages = new ArrayList<>();
    }

    // Método para obtener la única instancia de la clase
    public static Logger getInstance() {
        // Agregar las instrucciones aquí
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logMessage(String message) {
        // Agregar la instrucción aquí
        logMessages.add(message);
    }

    public String getLog() {
        // Agregar las instrucciones aquí
        String msj ="";
        for(String message : logMessages) {
            msj += message + "\n";
        }
       return msj;
    }
}

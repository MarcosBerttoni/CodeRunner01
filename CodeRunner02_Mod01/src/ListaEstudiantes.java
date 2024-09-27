import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> estudiantes = new HashMap<>();

        // Leer el número de estudiantes a añadir
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Añadir estudiantes y sus calificaciones
        for (int i = 0; i < n; i++) {
            String nombre = scanner.next();
            int calificacion = scanner.nextInt();
            estudiantes.put(nombre,calificacion);
        }


        // Actualizar la calificación de un estudiante
        String estudianteAActualizar = scanner.next();
        int notaActualizar = scanner.nextInt();
        if (estudiantes.containsKey(estudianteAActualizar)) {
           estudiantes.put(estudianteAActualizar,notaActualizar);
        } else {
            System.out.println("El estudiante '" + estudianteAActualizar + "' no está en la lista.");
        }


        // Mostrar la calificación de un estudiante específico
        String estudianteMostrar = scanner.next();
        if (estudiantes.containsKey(estudianteMostrar)) {
            int notaMostrar = estudiantes.get(estudianteMostrar);
            System.out.println("Calificación de " + estudianteMostrar + ": " + notaMostrar);
        } else {
            System.out.println("El estudiante '" + estudianteMostrar + "' no está en el lista.");
        }


        // Eliminar a un estudiante de la lista
        String estudianteAEliminar = scanner.next();
        estudiantes.remove(estudianteAEliminar); // Paso 5


        // Mostrar la lista completa de estudiantes y sus calificaciones
        System.out.println("Lista completa de estudiantes y sus calificaciones:");
        for (Map.Entry<String, Integer> entry : estudiantes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // Paso 6
        }

    }
}

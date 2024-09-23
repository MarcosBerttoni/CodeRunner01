public class Main {
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        lista.addTask("Tarea A", 2);
        lista.addTask("Tarea B", 3);
        lista.addTask("Tarea C", 1);
        System.out.println(lista.getTask(0));
        System.out.println(lista.getTask(1));
        System.out.println(lista.getTask(2));
    }
}

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ColaDePedidos {

    private Queue<Pedido> colaPedidos;

    private static class Pedido {
        private String nombreCliente;
        private String detallePedido;

        public Pedido(String nombreCliente, String detallePedido) {
            this.nombreCliente = nombreCliente;
            this.detallePedido = detallePedido;
        }

        @Override
        public String toString() {
            return "Cliente: " + nombreCliente + ", Pedido: " + detallePedido;
        }
    }

    public ColaDePedidos() {
        colaPedidos = new LinkedList<>();
    }

    public void agregarPedido(String nombreCliente, String detallePedido) {
        //Completa el método, siguiendo la pauta dada, aquí.
        colaPedidos.offer(new Pedido(nombreCliente, detallePedido));
    }

    public Pedido atenderPedido() {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new NoSuchElementException("No hay pedidos en la cola");
        if (colaPedidos.isEmpty()) {
            throw new NoSuchElementException("No hay pedidos en la cola");
        } else {
            return colaPedidos.poll();
        }
    }

    public Pedido verProximoPedido() {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Usa esta linea para lanzar la excepción: throw new NoSuchElementException("No hay pedidos en la cola");
        if (colaPedidos.isEmpty()) {
            throw new NoSuchElementException("No hay pedidos en la cola");
        }else{
            return colaPedidos.peek();
        }
    }

    public String verTodosLosPedidos() {
        //Completa el método, siguiendo la pauta dada, aquí.
        //Si no hay pedidos en la cola, utiliza esta línea: return "No hay pedidos en la cola";
        if(colaPedidos.isEmpty()){
            return "No hay pedidos en la cola";
        }
        System.out.println("Pedidos en la cola:");
        for(Pedido p: colaPedidos){
            System.out.println(p);
        }
        return "";
        }
    }

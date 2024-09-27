import java.util.Stack;

public class InventarioProductos {
    // Clase NodoProducto anidada dentro de InventarioProductos
    private class NodoProducto {
        int codigo;
        String nombre;
        NodoProducto izquierdo, derecho;

        public NodoProducto(int codigo, String nombre) {
            this.codigo = codigo;
            this.nombre = nombre;
            izquierdo = derecho = null;
        }
    }

    private NodoProducto raiz;

    // Método para agregar un producto al inventario
    public void agregarProducto(int codigo, String nombre) {
        if (codigo < 0 || nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Código inválido o nombre vacío.");
        }

        NodoProducto nuevoNodo = new NodoProducto(codigo, nombre);

        if (raiz == null) {
            raiz = nuevoNodo;
            return;
        }

        NodoProducto actual = raiz;
        NodoProducto padre = null;

        while (actual != null) {
            padre = actual;
            if (codigo < actual.codigo) {
                actual = actual.izquierdo;
            } else if (codigo > actual.codigo) {
                actual = actual.derecho;
            } else {
                actual.nombre = nombre; // Si el código ya existe, se actualiza el nombre
                return;
            }
        }

        if (codigo < padre.codigo) {
            padre.izquierdo = nuevoNodo;
        } else {
            padre.derecho = nuevoNodo;
        }
    }

    // Método para eliminar un producto del inventario
    public void eliminarProducto(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("Código inválido.");
        }

        NodoProducto actual = raiz;
        NodoProducto padre = null;

        while (actual != null && actual.codigo != codigo) {
            padre = actual;
            if (codigo < actual.codigo) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }

        if (actual == null) {
            return; // El código no existe en el árbol
        }

        // Caso 1: Nodo a eliminar no tiene hijos
        if (actual.izquierdo == null && actual.derecho == null) {
            if (actual == raiz) {
                raiz = null;
            } else if (padre.izquierdo == actual) {
                padre.izquierdo = null;
            } else {
                padre.derecho = null;
            }
        }
        // Caso 2: Nodo a eliminar tiene un hijo
        else if (actual.izquierdo == null) {
            if (actual == raiz) {
                raiz = actual.derecho;
            } else if (padre.izquierdo == actual) {
                padre.izquierdo = actual.derecho;
            } else {
                padre.derecho = actual.derecho;
            }
        } else if (actual.derecho == null) {
            if (actual == raiz) {
                raiz = actual.izquierdo;
            } else if (padre.izquierdo == actual) {
                padre.izquierdo = actual.izquierdo;
            } else {
                padre.derecho = actual.izquierdo;
            }
        }
        // Caso 3: Nodo a eliminar tiene dos hijos
        else {
            NodoProducto sucesor = encontrarMinimo(actual.derecho);
            int codigoSucesor = sucesor.codigo;
            String nombreSucesor = sucesor.nombre;
            eliminarProducto(sucesor.codigo);
            actual.codigo = codigoSucesor;
            actual.nombre = nombreSucesor;
        }
    }

    // Método para buscar un producto por su código
    public String buscarProducto(int codigo) {
        NodoProducto actual = raiz;

        while (actual != null) {
            if (codigo == actual.codigo) {
                return actual.nombre;
            } else if (codigo < actual.codigo) {
                actual = actual.izquierdo;
            } else {
                actual = actual.derecho;
            }
        }

        return null; // Si no se encuentra el producto
    }

    // Método para listar todos los productos en orden ascendente por código
    public void listarProductos() {
        if (raiz == null) {
            System.out.println("El inventario está vacío.");
            return;
        }

        Stack<NodoProducto> pila = new Stack<>();
        NodoProducto actual = raiz;

        while (actual != null || !pila.isEmpty()) {
            while (actual != null) {
                pila.push(actual);
                actual = actual.izquierdo;
            }

            actual = pila.pop();
            System.out.println("Código: " + actual.codigo + ", Nombre: " + actual.nombre);
            actual = actual.derecho;
        }
    }

    // Método para encontrar el producto con el código mínimo
    public String productoConCodigoMinimo() {
        if (raiz == null) {
            return null;
        }

        NodoProducto actual = raiz;
        while (actual.izquierdo != null) {
            actual = actual.izquierdo;
        }
        return actual.nombre;
    }

    // Método para encontrar el producto con el código máximo
    public String productoConCodigoMaximo() {
        if (raiz == null) {
            return null;
        }

        NodoProducto actual = raiz;
        while (actual.derecho != null) {
            actual = actual.derecho;
        }
        return actual.nombre;
    }

    // Método para encontrar el nodo con el código mínimo en un subárbol dado
    private NodoProducto encontrarMinimo(NodoProducto nodo) {
        while (nodo.izquierdo != null) {
            nodo = nodo.izquierdo;
        }
        return nodo;
    }
}

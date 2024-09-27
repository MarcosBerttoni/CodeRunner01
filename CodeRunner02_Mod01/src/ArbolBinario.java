class ArbolBinario {
    Nodo raiz;

    // Constructor
    ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    Nodo insertarRec(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRec(raiz.derecho, valor);
        }

        return raiz;
    }

    // Método para recorrer el árbol en preorden (pre-order traversal)
    public void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " "); // Visitar el nodo
            preOrden(nodo.izquierdo); // Recorrer el subárbol izquierdo
            preOrden(nodo.derecho); // Recorrer el subárbol derecho
        }
    }
}
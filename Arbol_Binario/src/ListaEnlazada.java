public class ListaEnlazada {
    protected Nodo head;
    protected Nodo tail;

    public ListaEnlazada() {
        head = null;
        tail = null;
    }

    public void avanzar_Nodo() {
        if (head != null) {
            head = head.siguiente;
        }
    }

    public void agregarNodo(Nodo nodo) {
        if (head == null) {
            head = nodo;
            tail = nodo;
        } else {
            tail.siguiente = nodo;
            nodo.anterior = tail;
            tail = nodo;
        }
    }

    public void eliminarNodo(Nodo nodo) {
        if (head == null) {
            return;
        }

        if (head == nodo) {
            head = head.siguiente;
            if (head != null) {
                head.anterior = null;
            }
        } else {
            Nodo actual = head;
            while (actual != null && actual != nodo) {
                actual = actual.siguiente;
            }

            if (actual != null) {
                actual.anterior.siguiente = actual.siguiente;
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }
            }
        }

        if (nodo == tail) {
            tail = tail.anterior;
        }
    }
}

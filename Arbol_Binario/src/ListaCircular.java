public class ListaCircular extends ListaEnlazada {
    public ListaCircular() {
        super();
    }

    @Override
    public void agregarNodo(Nodo nodo) {
        super.agregarNodo(nodo);
        tail.siguiente = head;
        head.anterior = tail;
    }

    @Override
    public void eliminarNodo(Nodo nodo) {
        super.eliminarNodo(nodo);
        if (head != null) {
            tail.siguiente = head;
            head.anterior = tail;
        }
    }

    public void nodo_Inicial_a_Nodo_Final() {
        if (head != null && head.siguiente != head) {
            Nodo nuevoTail = head;
            head = head.siguiente;
            tail.siguiente = nuevoTail;
            nuevoTail.anterior = tail;
            tail = nuevoTail;
            tail.siguiente = head;
            head.anterior = tail;
        }
    }

    public void nodo_Final_a_Nodo_Inicial() {
        if (tail != null && tail.anterior != tail) {
            Nodo nuevoHead = tail;
            tail = tail.anterior;
            head.anterior = nuevoHead;
            nuevoHead.siguiente = head;
            head = nuevoHead;
            tail.siguiente = head;
            head.anterior = tail;
        }
    }
}

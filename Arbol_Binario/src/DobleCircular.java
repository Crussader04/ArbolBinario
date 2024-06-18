public class DobleCircular extends ListaCircular {
    @Override
    public void avanzar_Nodo() {
        if (head != null) {
            head = head.siguiente;
        }
    }

    public void retroceder_Nodo() {
        if (tail != null) {
            tail = tail.anterior;
        }
    }
}

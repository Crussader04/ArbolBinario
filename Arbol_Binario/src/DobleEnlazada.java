public class DobleEnlazada extends ListaEnlazada {
    public void retroceder_Nodo() {
        if (tail != null) {
            tail = tail.anterior;
        }
    }
}

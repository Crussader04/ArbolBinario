import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
    private int altura;
    private String tipo;
    private List<Nodo> nodoList;

    public ArbolBinario() {
        nodoList = new ArrayList<>();
    }

    public void recorrido_Inorden() {
        for (Nodo nodo : nodoList) {
            System.out.print(nodo.getNumero() + " ");
        }
    }

    public void recorrido_Postorden() {
        for (Nodo nodo : nodoList) {
            System.out.print(nodo.getNumero() + " ");
        }
    }

    public void recorrido_Preorden() {
        for (Nodo nodo : nodoList) {
            System.out.print(nodo.getNumero() + " ");
        }
    }

    public void agregarNodo(Nodo nodo) {
        nodoList.add(nodo);
    }

    public void eliminarNodo(Nodo nodo) {
        nodoList.remove(nodo);
    }

    public List<Nodo> getNodoList() {
        return nodoList;
    }
}

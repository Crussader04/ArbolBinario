//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);

        arbol.agregarNodo(nodo1);
        arbol.agregarNodo(nodo2);

        System.out.println("Recorrido Preorden del Árbol Binario:");
        arbol.recorrido_Preorden();

        ListaEnlazada lista = new ListaEnlazada();
        lista.agregarNodo(nodo1);
        lista.agregarNodo(nodo2);

        System.out.println("Lista Enlazada:");
        Nodo current = lista.head;
        while (current != null) {
            System.out.print(current.getNumero() + " ");
            current = current.siguiente;
        }
        System.out.println();

        Grafo grafo = new Grafo();
        grafo.generarGrafo();
        System.out.println("Presentación del Grafo:");
        grafo.presentarGrafo();
    }
}

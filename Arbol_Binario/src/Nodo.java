public class Nodo implements Accion {
    private int numero;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int numero) {
        this.numero = numero;
        this.siguiente = null;
        this.anterior = null;
    }

    public int mover_Derecha() {
        return numero + 1;
    }

    public int mover_Izquierda() {
        return numero - 1;
    }

    public int cambiar_Raiz() {
        return numero;
    }

    @Override
    public int agregar_Nodo() {
        return 0;
    }

    @Override
    public int eliminar_Nodo() {
        return 0;
    }

    @Override
    public int insertar_Nodo() {
        return 0;
    }

    @Override
    public int buscar_Nodo() {
        return numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

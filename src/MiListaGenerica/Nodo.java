package MiListaGenerica;

public class Nodo <T extends Comparable<T>>{

    //Atributos
    Nodo<T> siguiente;
    private T dato;

    //Constructor
    public Nodo(T dato) {
        this.dato = dato;
    }

    //Getters y Setters
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public T getDato() {
        return dato;
    }


}

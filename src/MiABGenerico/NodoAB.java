package MiABGenerico;

import MiListaGenerica.Nodo;

//AGREGO: extends Comparable<?> POR METODO DE IMPRESION ACA Y EN clase ArbolBinario
public class NodoAB<U extends Comparable<?>> {

    //Parametros
    private final U dato;
    NodoAB<U> der;
    NodoAB<U> izq;

    //Constructores
    public NodoAB(U dato) {
        this.dato = dato;
        this.der = null;
        this.izq = null;
    }

    public NodoAB(U dato, NodoAB<U> der, NodoAB<U> izq) {
        this.dato = dato;
        this.der = der;
        this.izq = izq;
    }

    //Setters y Getters


    public U getDato() {
        return dato;
    }

    public NodoAB<U> getDer() {
        return der;
    }

    public void setDer(NodoAB<U> der) {
        this.der = der;
    }

    public NodoAB<U> getIzq() {
        return izq;
    }

    public void setIzq(NodoAB<U> izq) {
        this.izq = izq;
    }

    //Metodos

    public boolean esHoja(){
        return izq==null && der==null;
    }

}

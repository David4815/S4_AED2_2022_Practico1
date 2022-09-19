package MiListaGenerica;

public class Lista <T extends Comparable<T>> {

    //Parametros ---------------------------------------

    Nodo<T> inicio;
    Nodo<T> ultimo;
    private int cantidadElementos;

    //Constructor ----------------------------------------

    public Lista() {
        this.inicio = null;
        this.ultimo = null;
        this.cantidadElementos = 0;
    }

    //Getters y Setters -------------------------------------

    public Nodo<T> getInicio() {
        return inicio;
    }

    public void setInicio(Nodo<T> inicio) {
        this.inicio = inicio;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getCantidadElementos() {
        return cantidadElementos;
    }

    public void setCantidadElementos(int cantidadElementos) {
        this.cantidadElementos = cantidadElementos;
    }

    //Metodos ----------------------------------------------------------------------------

    /**
     * Devuelve un booleano que nos indica si la lista esta vacia
     * @return
     */
    public boolean estaVacia(){
        return inicio==null;
    }

    /**
     * Agrega un nodo con el valorNuevo que se paso como parametro al inicio de la lista
     * @param valorNuevo
     */
    public void agregarAlPrincipio(T valorNuevo) {

        Nodo<T> nuevo = new Nodo<T>(valorNuevo);

        if (estaVacia()) {
            this.setInicio(nuevo);
            this.setUltimo(nuevo);
        } else {
            nuevo.setSiguiente(this.inicio);
            this.setInicio(nuevo);
        }
        cantidadElementos++;

    }


    /**
     * muestra en pantalla los elementos de la lista que tiene como inicio el nodo pasado por parametros
     * @param nodo
     */
    public void imprimirLista(Nodo<T> nodo){
        if(nodo!=null){
            System.out.print(nodo.getDato());
            //este if agrega un - para separar elementos a todos menos al ultimo y despues del ultimo agrega un salto de linea
            if(nodo.getSiguiente()!=null) {System.out.print(" - ");}else{System.out.println("");};
            nodo = nodo.getSiguiente();
            imprimirLista(nodo);
        }
    }

    /**
     * Agrego el Nodo elementoNuevo que se paso como parametro al final de la lista
     * @param elementoNuevo
     */
    public void agregarAlFinal(T elementoNuevo) {
        Nodo<T> nuevo = new Nodo<T>(elementoNuevo);
        Nodo<T> aux = this.getInicio();
        if(this.estaVacia()){
            this.setInicio(nuevo);
            this.setUltimo(nuevo);
        }else{
            ultimo.setSiguiente(nuevo);
            this.setUltimo(nuevo);
        }
        cantidadElementos++;

    }

    /**
     * Elimino el primer nodo de la lista y retorno el valor de este
     * @return
     */
  public T eliminarPrincipio(){

        //Obtengo el valor del primero nodo antes de borrarlo
        T valor = this.inicio.getDato();

        if(inicio==ultimo){
            this.setInicio(null);
            this.setUltimo(null);
        }else{
            this.setInicio(inicio.getSiguiente());
        }
        this.cantidadElementos--;

        return valor;
  }

    /**
     * Obtengo el valor del nodo que esta en la lista en el lugar correspondiente al indice pasado como parametro
      * @param indice
     * @return
     */
public T obtener(int indice){

      Nodo<T> nodoActual = inicio;
      int contador = 0;

      while(contador<indice && nodoActual!=null){
          contador++;
          nodoActual = nodoActual.getSiguiente();
      }

      if(nodoActual==null){
          return null; //cuando no era generico devolvia -1 aca
      }else{
          return nodoActual.getDato();
      }
}



}

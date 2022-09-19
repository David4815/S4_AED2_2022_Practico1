package MiABGenerico;

public class ArbolBinario<U extends Comparable<?>> {

    //Atributos
    private NodoAB<U> raiz;

    //Constructor
    public ArbolBinario(NodoAB<U> raiz) {
        this.raiz = raiz;
    }

    //Setters y Getters
    public NodoAB<U> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoAB<U> raiz) {
        this.raiz = raiz;
    }

    //Ejercicio 2 - A
    /**
     * Pos: Retorna la cantidad de nodos del AB.
     *
     * @return
     */
    public int cantidadNodos(){
        return cantidadNodos(raiz);
    }

    private int cantidadNodos(NodoAB<U> nodo) {
        if(nodo==null){
            return 0;
        }else{
            return 1 + cantidadNodos(nodo.getIzq()) + cantidadNodos(nodo.getDer());
        }
    }

    //Cantidad de pares
    /**
     * Metodo para ver cuantos nodos hay con numero par
     *
     * @return
     */
    public int cantidadPares() {
        //ACA CASTEO A INTEGER POR QUE ESTOY SUPONIENDO QUE ES UN ARBOL CON NODOS QUE TIENEN NUMEROS
        return cantidadPares((NodoAB<Integer>) raiz);
    }
    //ACA LE TUVE QUE PONER INTEGER AL TIPO EN NODO POR QUE PARA ESTE METODO EL DATO DE LOS NODOS TIENE QUE SER UN NUMERO
    private int cantidadPares(NodoAB<Integer> nodo) {
        if(nodo==null){
            return 0;
        }else if(nodo.getDato() %2 ==0){
            return 1 + cantidadPares(nodo.getIzq()) + cantidadPares(nodo.getDer());
        }else {
            return cantidadPares(nodo.getIzq()) + cantidadPares(nodo.getDer());
        }
    }

    //Ejercicio 2 - B
    /**
     * Pos: Retorna la cantidad de nodos hoja del AB.
     *
     * @return
     */
    public int cantidadHojas(){
        return cantidadHojas(raiz);
    }

    private int cantidadHojas(NodoAB<U> nodo) {
        if(nodo==null){
            return 0;
        }else if(nodo.esHoja()){
            //si el nodo es hoja retorna 1 por que no tiene nada a la izquierda ni derecha
            return 1;
        }else{
            return cantidadHojas(nodo.getIzq()) + cantidadHojas(nodo.getDer());
        }
    }

    //Ejercicio 2 - C
    //Altura (n)= |-1 si n es null  0 si n es hoja  1+ max(altura(s)), para todo s hijo de n.|
    /**
     * Pos: Retorna la altura del AB.
     *
     * @return
     */
    public int altura(){
        return altura(raiz);
    }

    private int altura(NodoAB<U> nodo) {
        if(nodo==null){
            return -1;
            //esto no lo puse cuando hize el practico la primera vez solo puse lo del else
        }else if(nodo.esHoja()){
            return 0;
        }else{
            return 1 + Math.max(altura(nodo.getIzq()),altura(nodo.getDer()));
        }
    }

    //Ejercicio 2 - D
    /**
     * Pos: Retorna true si y solo si todos los elementos del AB son pares.
     *
     * @return
     */
    public boolean todosPares(){
        //CASTEO A INTEGER EL TIPO DE DATO DEL NODO POR QUE ESTOY SUPONIENDO QUE TIENE NUMERO COMO DATO
        return todosPares((NodoAB<Integer>)raiz);
    }

    //LE PASO UN NODO DE TIPO INTEGER POR QUE ESTOY SUPONIENDO QUE TIENE NUMERO EN EL TIPO DE DATO
    private boolean todosPares(NodoAB<Integer> nodo) {
        if(nodo==null){
            return false;
        }
        if(nodo.getDato()%2==0){
            if(nodo.esHoja()){
                return true;
            }else{
                return todosPares(nodo.getIzq()) && todosPares(nodo.getDer());
            }

        }else{
            return false;
        }
    }

    //Ejercicio 2 - E

    //En clase arboles iguales

    /**
     * Pos: Retorna true si y solo si es igual al AB pasado por parámetro. Dos árboles son iguales si son vacíos o si tienen los mismos elementos y en el mismo orden.
     *
     * @param arbolBinario
     * @return
     */
    public boolean iguales(ArbolBinario<U> arbolBinario){
        return iguales(raiz, arbolBinario.getRaiz());
    }

    private boolean iguales(NodoAB<U> nodo1, NodoAB<U> nodo2) {

        if(nodo1==null && nodo2==null){
            return true;
        }else if(nodo1==null || nodo2==null){
            return false;
        }else{
            return nodo1.getDato()==nodo2.getDato()
                    && iguales(nodo1.getIzq(),nodo2.getIzq())
                    && iguales(nodo1.getDer(),nodo2.getDer());
        }

    }

    /**
     * Pos: Retorna true si y solo si el dato pasado como parámetro pertenece al AB.
     *
     * @param x
     * @return
     */
    public boolean pertenece(int x){
        return pertenece(x, raiz);
    }

    private boolean pertenece(int x,NodoAB<U> nodo) {
        return false;
    }

    //-----------------------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Ejercicio 3 - A ----------------------------------------------

    public ArbolBinario clon() {
        return null;
    }

    //Ejercicio 3 - B ----------------------------------------------

    public ArbolBinario espejo() {

        return null;
    }





}

package ClaseGenerica;

public class Pareja<T> {
    //Parametros
    private T primero;

    //Constructor
    public Pareja() {
        this.primero = null;
    }

    //Seter
    public void setPrimero(T nuevoValor) {
        this.primero = primero;
    }
    //Getter
    public T getPrimero(){
        return this.primero;
    }
}

package GenericaObject;

public class ArrayListDavid {

    private Object[] datosElemento;
    private int i=0;

    public ArrayListDavid(int z) {
        this.datosElemento =  new Object[z];
    }

    public Object get(int i) {
        return datosElemento[i];
    }

    public void add(Object o){
        datosElemento[i]=o;
        i++;
    }
}

package GenericaObject;
import java.io.*;

public class UsoArrayListDavid {

    public static void main(String[] args) {
        ArrayListDavid archivos = new ArrayListDavid(5);

        //mi arrayList con String
        archivos.add("Juan");
        archivos.add("Maria");
        archivos.add("Ana");
        archivos.add("Sandra");
        archivos.add(new File("gestionPedidos.accdb"));

        //ESTO NO DA ERROR EN TIEMPO DE COMPILACION
        //PERO DA ERROR EN TIEMPO DE EJECUCION!!!!!!
        String nombrePersona = (String)archivos.get(4);


        System.out.println(nombrePersona);



    }




}

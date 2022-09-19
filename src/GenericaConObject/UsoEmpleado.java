package GenericaConObject;
//Para usar ArrayList
//import java.util.ArrayList;

import java.util.*;

public class UsoEmpleado {

    public static void main(String[] args) {

        //Array de empleados----------------------------------------------------------
        /*Empleado listaEmpleados[] = new Empleado[3];

        listaEmpleados[0] = new Empleado("Ana", 45, 2500);
        listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
        listaEmpleados[2] = new Empleado("Maria", 25, 2600);*/

        //ArrayList de empleados(importo java.util.*)
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();

        //le digo el largo del ArrayList
        //por que si pasa los diez elementos por cada elemento extra copia el array lo pega en otro lugar de memorio, le agrega el nuevo elemento y borra el array original
        listaEmpleados.ensureCapacity(11);

        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Maria", 25, 2600));

        //metodo para borrar lugares reservados al final del ArrayList
        //Lo puedo usar cuando se que no voy a agregar mas elementos al ArrayList
        //listaEmpleados.trimToSize();

        System.out.println(listaEmpleados.size());

        for(Empleado e: listaEmpleados){
            System.out.println(e.dameDatos());
        }
        //Ejemplo de iterador
        /*Iterator <Empleado> miIterador = listaEmpleados.iterator();

        while(miIterador.hasNext()){
            System.out.println(miIterador.next().dameDatos());
        }*/

    }






}

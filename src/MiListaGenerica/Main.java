package MiListaGenerica;

public class Main {

    public static void main(String[] args) {

        Lista<Integer> listaNumeros = new Lista<Integer>();

       // Nodo<Integer> nodoNumero = new Nodo<Integer>(7);

        //AgregarAlPrincipio
        listaNumeros.agregarAlPrincipio(7);
        listaNumeros.agregarAlPrincipio(6);
        listaNumeros.agregarAlPrincipio(5);
        listaNumeros.agregarAlPrincipio(4);
        listaNumeros.agregarAlPrincipio(3);
        //AgregarAlFinal
        listaNumeros.agregarAlFinal(10);
        //EliminarPrincipio
        listaNumeros.imprimirLista(listaNumeros.getInicio());
        listaNumeros.eliminarPrincipio();
        listaNumeros.imprimirLista(listaNumeros.getInicio());
        //Obtener
        int indice = 2;
        int valor = listaNumeros.obtener(indice); //esperado 5
        System.out.println("El nodo en la posicion " + indice + " es: " + valor);


        //System.out.println(listaNumeros.inicio.getDato());



    }

}

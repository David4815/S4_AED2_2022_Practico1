package MiABGenerico;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

        //ARBOL (raiz = 'Ocho')

        //              8
        //       10           3
        //   1       14           6
        //         4    7      13   7
        //

        NodoAB<Integer> sieteG = new NodoAB<Integer>(7);
        NodoAB<Integer> cuatroG = new NodoAB<Integer>(4);
        NodoAB<Integer> catorceG = new NodoAB<Integer>(14);
        NodoAB<Integer> unoG = new NodoAB<Integer>(1);
        NodoAB<Integer> sieteDerG = new NodoAB<Integer>(7);
        NodoAB<Integer> treceG = new NodoAB<Integer>(13);
        NodoAB<Integer> seisG = new NodoAB<Integer>(6);
        NodoAB<Integer> tresG = new NodoAB<Integer>(3);
        NodoAB<Integer> diezG = new NodoAB<Integer>(10);
        NodoAB<Integer> ochoG = new NodoAB<Integer>(8);

        ochoG.izq = diezG;
        ochoG.der = tresG;
        diezG.izq = unoG;
        diezG.der = catorceG;
        tresG.izq = null;
        tresG.der = seisG;
        catorceG.izq = cuatroG;
        catorceG.der = sieteG;
        seisG.izq = treceG;
        seisG.der = sieteDerG;

        ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(ochoG);
        //BTreePrinter.printNode(ochoG);
        System.out.println("ARBOL");
        BTreePrinter.printNode(arbol.getRaiz());

        //ARBOL2

        NodoAB<Integer> treinta2 = new NodoAB<Integer>(30, null, null);  //impar
        //NodoAB<Integer> uno2 = new NodoAB<Integer>(1,null,null);  //comentar para par
        NodoAB<Integer> veinte2 = new NodoAB<Integer>(20, null, null);
        NodoAB<Integer> diez2 = new NodoAB<Integer>(10, null, null);
        NodoAB<Integer> doce2 = new NodoAB<Integer>(12, null, null);
        //NodoAB<Integer> dos2 = new NodoAB<Integer>(2,veinte2,uno2);  //comentar par
        NodoAB<Integer> dos2 = new NodoAB<Integer>(2, veinte2, treinta2);  //impar
        NodoAB<Integer> cuatro2 = new NodoAB<Integer>(4, doce2, diez2);
        NodoAB<Integer> seis2 = new NodoAB<Integer>(6, dos2, cuatro2);

        ArbolBinario<Integer> arbol2 = new ArbolBinario<Integer>(seis2);

        //ARBOL3

        NodoAB<Integer> dos3 = new NodoAB<Integer>(2, null, null);
        NodoAB<Integer> tres3 = new NodoAB<Integer>(3, null, null);
        NodoAB<Integer> seis3 = new NodoAB<Integer>(6, dos3, tres3);

        ArbolBinario<Integer> arbol3 = new ArbolBinario<Integer>(seis3);

        //ARBOL4

        NodoAB<Integer> dos4 = new NodoAB<Integer>(2, null, null);
        NodoAB<Integer> tres4 = new NodoAB<Integer>(3, null, null);
        NodoAB<Integer> seis4 = new NodoAB<Integer>(6, dos4, tres4);

        ArbolBinario<Integer> arbol4 = new ArbolBinario<Integer>(seis4);

        System.out.println("Cantidad de nodos: " + arbol.cantidadNodos());
        System.out.println("Cantidad de nodos pares: " + arbol.cantidadPares());
        System.out.println("Cantidad de hojas: " + arbol.cantidadHojas());
        System.out.println("Altura del arbol: " + arbol.altura());

        //imprimo arbol2
        System.out.println("ARBOL2");
        BTreePrinter.printNode(arbol2.getRaiz());

        System.out.println("Los nodos son todos pares arbol2?: " + arbol2.todosPares());

        //imprimo arbol3
        System.out.println("ARBOL3");
        BTreePrinter.printNode(arbol3.getRaiz());

        System.out.println("Los nodos son todos pares arbol3?: " + arbol3.todosPares());

        //imprimo arbol3
        System.out.println("ARBOL4");
        BTreePrinter.printNode(arbol4.getRaiz());

        System.out.println("El arbol 1 y el 4 son iguales?: " + arbol.iguales(arbol4));
        System.out.println("El arbol 3 y el 4 son iguales?: " + arbol3.iguales(arbol4));
    }

}

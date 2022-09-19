package MiABGenerico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BTreePrinter {

    public static <U extends Comparable<?>> void printNode(NodoAB<U> root) {
        int maxLevel = BTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static <U extends Comparable<?>> void printNodeInternal(List<NodoAB<U>> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<NodoAB<U>> newNodes = new ArrayList<NodoAB<U>>();
        for (NodoAB<U> node : nodes) {
            if (node != null) {
                System.out.print(node.getDato());
                newNodes.add(node.izq);
                newNodes.add(node.der);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).izq != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).der != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    private static <U extends Comparable<?>> int maxLevel(NodoAB<U> node) {
        if (node == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(node.izq), BTreePrinter.maxLevel(node.der)) + 1;
    }

    private static <U> boolean isAllElementsNull(List<U> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}

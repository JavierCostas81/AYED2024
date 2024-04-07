package tp2.ejercicio06;

import tp2.ejercicio01y02.BinaryTree;

public class Transformacion {
    BinaryTree<Integer> binaryTree;

    public Transformacion(BinaryTree<Integer> ab) {
        this.binaryTree = ab;
    }

    public BinaryTree<Integer> suma () {
        BinaryTree<Integer> returnAB;
        if (binaryTree == null) {
            return returnAB = new BinaryTree<Integer>(0);
        }
        returnAB = sumarHijos(binaryTree);
        return returnAB;
    }

    private BinaryTree<Integer> sumarHijos(BinaryTree<Integer> arbol) {
        if (arbol.hasLeftChild()) {
            arbol.setData(arbol.getLeftChild().getData() + sumarHijos(arbol.getLeftChild()).getData());
        }
        else {
            arbol.setData(0);
        }
        if (arbol.hasRightChild()) {
            arbol.setData(arbol.getData() + arbol.getRightChild().getData() + sumarHijos(arbol.getRightChild()).getData()) ;
        }
        else {
            arbol.setData(0);
        }
        return arbol;
    }
}

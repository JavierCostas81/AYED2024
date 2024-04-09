package tp2.ejercicio04;

import tp2.ejercicio01y02.BinaryTree;

public class RedBinariaLlena<T> {

    BinaryTree<T> binaryTree;

    public RedBinariaLlena (BinaryTree<T> ab) {
        binaryTree = ab;
    }

    public int retardoReenvio() {
        int returnInt = rutaCritica(binaryTree);
        return returnInt;
    }

    private int rutaCritica(BinaryTree<T> ab) {
        if ((ab == null) || ab.isEmpty()) { return 0; }
        return Math.max(
                rutaCritica(ab.getLeftChild()),
                rutaCritica(ab.getRightChild())
                ) + (int) ab.getData();

/*
        int maximoIzquierdo = rutaCritica(ab.getLeftChild()) + (int) ab.getData();
        int maximoderecho = rutaCritica(ab.getRightChild()) + (int) ab.getData();
        return Math.max(maximoIzquierdo,maximoderecho);
*/

    }

}

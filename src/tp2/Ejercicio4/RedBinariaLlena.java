package tp2.Ejercicio4;

import tp2.ejercicio1y2.BinaryTree;

public class RedBinariaLlena<T> {

    BinaryTree<T> binaryTree;

    public RedBinariaLlena (BinaryTree<T> ab) {
        binaryTree = ab;
    }

    public int retardoReenvio() {
        int max = 0;
        int returnInt = rutaCritica(binaryTree);
        return returnInt;
    }

    private int rutaCritica(BinaryTree<T> ab) {
        if ((ab == null) || ab.isEmpty()) { return 0; }
        if (ab.isLeaf()) {
            return (int) ab.getData();
        }
        int maximoIzquierdo = rutaCritica(ab.getLeftChild()) + (int) ab.getData();
        int maximoderecho = rutaCritica(ab.getRightChild()) + (int) ab.getData();
        return Math.max(maximoIzquierdo,maximoderecho);

    }

}

package tp2.ejercicio06;


import tp2.ejercicio01y02.BinaryTree;

public class Transformacion<T> {
    BinaryTree<Integer> binaryTree;

    public Transformacion(BinaryTree<Integer> ab) {
        this.binaryTree = ab;
    }

    public BinaryTree<Integer> suma() {
        return sumarHijosArbol(binaryTree);
    }

    private BinaryTree<Integer> sumarHijosArbol(BinaryTree<Integer> arbol) {
        BinaryTree<Integer> result = new BinaryTree<>(0);
        if ((arbol != null) && (!arbol.isLeaf()) && (!arbol.isEmpty())) {
            if (arbol.hasLeftChild()) {
                result.addLeftChild(sumarHijosArbol(arbol.getLeftChild()));
                result.setData(result.getLeftChild().getData() + arbol.getLeftChild().getData());
            }
            if (arbol.hasRightChild()) {
                result.addRightChild(sumarHijosArbol(arbol.getRightChild()));
                result.setData(result.getData() + result.getRightChild().getData() + arbol.getRightChild().getData());
            }
        }
        return result;
    }
}



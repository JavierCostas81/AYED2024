package tp2.ejercicio05;

import tp1.ejercicio08.Queue;
import tp2.ejercicio01y02.BinaryTree;

public class ProfundidadDeArbolBinario<T> {

    BinaryTree<T> binaryTree;

    public ProfundidadDeArbolBinario(BinaryTree<T> binaryTree) {
        this.binaryTree = binaryTree;
    }


    public int sumaElementosProfundidad (int p) throws IllegalAccessException {
        Queue<BinaryTree<T>> cola = new Queue<>();
        BinaryTree<T> aBTemp;
        int nivel = 0;
        int suma = 0;
        if ((p<0) || (binaryTree == null)) return suma;
        cola.enqueue(binaryTree);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            aBTemp = cola.dequeue();
            if (aBTemp != null) {
                if (nivel == p) {
                    suma+= (int) aBTemp.getData();
                }
                if (aBTemp.hasLeftChild()) {
                    cola.enqueue(aBTemp.getLeftChild());
                }
                if (aBTemp.hasRightChild()) {
                    cola.enqueue(aBTemp.getRightChild());
                }
            } else {
                nivel++;
                if (nivel > p) {
                    return suma;
                }
                if (!cola.isEmpty()) {
                    cola.enqueue(null);
                }
            }
        }
        return suma;
    }
}

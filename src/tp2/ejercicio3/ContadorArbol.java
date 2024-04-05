package tp2.ejercicio3;

import tp2.ejercicio1y2.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
    BinaryTree<Integer> arbolBinario;

    public ContadorArbol (BinaryTree<Integer> controlar) {
        arbolBinario = controlar;
    }

    public List<Integer> numerosPares() {
        List<Integer> returnList = new ArrayList<>();
        if ((Math.random() % 2) == 0) {
            System.out.println("Numeros pares inOrden:");
            inOrden(arbolBinario,returnList);
        }
        else {
            System.out.println("Numeros pares postOrden:");
            postOrden(arbolBinario,returnList);
        }
        return returnList;
    }

    private void postOrden(BinaryTree<Integer> arbolBinario, List<Integer> returnList) {
        if (arbolBinario.hasLeftChild()) {
            this.postOrden(arbolBinario.getLeftChild(), returnList);
        }
        if (arbolBinario.hasRightChild()) {
            this.postOrden(arbolBinario.getRightChild(), returnList);
        }
        if (arbolBinario.getData() % 2 == 0) {
            returnList.add(arbolBinario.getData());
        }
    }
    private void inOrden(BinaryTree<Integer> arbolBinario, List<Integer> returnList) {
        if (arbolBinario.hasLeftChild()) {
            this.inOrden(arbolBinario.getLeftChild(),returnList);
        }
        if (arbolBinario.getData() % 2 == 0) { returnList.add(arbolBinario.getData()); }
        if (arbolBinario.hasRightChild()) {
            this.inOrden(arbolBinario.getRightChild(),returnList);
        }
    }
}

package tp2.ejercicio03;

import tp2.ejercicio01y02.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ContadorArbol {
    BinaryTree<Integer> arbolBinario;

    public ContadorArbol (BinaryTree<Integer> controlar) {
        arbolBinario = controlar;
    }

    public List<Integer> numerosPares() {

        if (Math.random() >= 0.5) {
            System.out.println("Numeros pares inOrden:");
            return inOrden(arbolBinario);
        }
        else {
            System.out.println("Numeros pares postOrden:");
            return postOrden(arbolBinario);
        }
    }
    private List<Integer> postOrden(BinaryTree<Integer> arbolBinario) {
        List<Integer> returnList = new ArrayList<>();
        if ((arbolBinario != null) && (!arbolBinario.isEmpty())) {
            returnList.addAll(this.postOrden(arbolBinario.getLeftChild()));
            returnList.addAll(this.postOrden(arbolBinario.getRightChild()));
            if (arbolBinario.getData() % 2 == 0) {
                returnList.add(arbolBinario.getData());
            }
        }
        return returnList;
    }
    private List<Integer> inOrden(BinaryTree<Integer> arbolBinario) {
        List<Integer> returnList = new ArrayList<>();
        if ((arbolBinario != null) && (!arbolBinario.isEmpty())) {
            returnList.addAll(this.inOrden(arbolBinario.getLeftChild()));
            if (arbolBinario.getData() % 2 == 0) {
                returnList.add(arbolBinario.getData());
            }
            returnList.addAll(this.inOrden(arbolBinario.getRightChild()));
        }
        return returnList;
    }
}

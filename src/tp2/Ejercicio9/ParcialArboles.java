package tp2.Ejercicio9;

import tp2.ejercicio1y2.BinaryTree;

public class ParcialArboles extends tp2.Ejercicio7.ParcialArboles {


    public ParcialArboles(BinaryTree<Integer> ab) {
        super(ab);
    }

    public BinaryTree<int[]> sumAndDif(BinaryTree<Integer> arbol) {
        int[] raiz = {arbol.getData(),arbol.getData()};
        BinaryTree<int[]> result = new BinaryTree<int[]>(raiz);
        sumAndDifAux(arbol.getLeftChild(), result);
        sumAndDifAux(arbol.getRightChild(),result);
        return result;
    }

    private void sumAndDifAux(BinaryTree<Integer> arbol, BinaryTree<int[]> result) {
        if (arbol != null) {
            if (arbol.hasLeftChild()) {
                int[] aux = {result.getData()[0] + arbol.getLeftChild().getData(), arbol.getLeftChild().getData() - result.getData()[1]};
                result.addLeftChild(new BinaryTree<>(aux));
            }
            if (arbol.hasRightChild()) {
                int[] aux = {result.getData()[0] + arbol.getData(), arbol.getData() - result.getData()[1]};
                result.addRightChild(new BinaryTree<>(aux));
            }
            sumAndDifAux(arbol.getLeftChild(),result.getLeftChild());
            sumAndDifAux(arbol.getRightChild(),result.getRightChild());
        }
    }

}

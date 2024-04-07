package tp2.ejercicio09;

import tp2.ejercicio01y02.BinaryTree;

public class ParcialArboles extends tp2.ejercicio07.ParcialArboles {


    public ParcialArboles(BinaryTree<Integer> ab) {
        super(ab);
    }

    public BinaryTree<int[]> sumAndDif(BinaryTree<Integer> arbol) {
        BinaryTree<int[]> result = new BinaryTree<int[]>();
        sumAndDifAux(arbol, result,0,0);
        return result;
    }

    private void sumAndDifAux(BinaryTree<Integer> arbol, BinaryTree<int[]> result, int sum, int dif) {
        if (arbol != null) {
            int[] aux = {arbol.getData() + sum, arbol.getData() - dif};
            result.setData(aux);
            if (arbol.hasLeftChild()) {
                result.addLeftChild(new BinaryTree<int[]>());
                sumAndDifAux(arbol.getLeftChild(), result.getLeftChild(), aux[0], arbol.getData());
            }
            if (arbol.hasRightChild()) {
                result.addRightChild(new BinaryTree<int[]>());
                sumAndDifAux(arbol.getRightChild(), result.getRightChild(), aux[0], arbol.getData());
            }
        }
    }

}

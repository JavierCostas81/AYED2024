package tp2.ejercicio09;

import tp2.ejercicio01y02.BinaryTree;

public class ParcialArboles extends tp2.ejercicio07.ParcialArboles {


    public ParcialArboles(BinaryTree<Integer> ab) {
        super(ab);
    }

    public BinaryTree<SumaDeEnteros> sumAndDif(BinaryTree<Integer> arbol) {
        return sumAndDifAux(arbol,0,0);
    }

    private BinaryTree<SumaDeEnteros> sumAndDifAux(BinaryTree<Integer> arbol, Integer sum, Integer dif) {
        BinaryTree<SumaDeEnteros> result = new BinaryTree<>();
        if ((arbol != null) || (!arbol.isEmpty())) {
            SumaDeEnteros aux = new SumaDeEnteros(arbol.getData() + sum, arbol.getData() - dif);
            result.setData(aux);
            if (arbol.hasLeftChild()) {
                result.addLeftChild(sumAndDifAux(arbol.getLeftChild(), aux.getSum(), arbol.getData()));
            }
            if (arbol.hasRightChild()) {
                result.addRightChild(sumAndDifAux(arbol.getRightChild(), aux.getSum(), arbol.getData()));

            }
        }
        return result;
    }

}

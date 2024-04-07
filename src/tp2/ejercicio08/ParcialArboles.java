package tp2.ejercicio08;

import tp2.ejercicio01y02.BinaryTree;

public class ParcialArboles extends tp2.ejercicio07.ParcialArboles {


    public ParcialArboles(BinaryTree<Integer> ab) {
        super(ab);
    }

    public boolean esPrefijo(BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2) {
        if(arbol1 == null) {
            return true;
        }
        else if (arbol2 == null) {
            return false;
        } else {
            return (arbol1.getData() == arbol2.getData())
                    && esPrefijo(arbol1.getLeftChild(),arbol2.getLeftChild())
                    && esPrefijo(arbol1.getRightChild(),arbol2.getRightChild());
        }
    }
}

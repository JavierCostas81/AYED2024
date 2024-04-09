package tp2.ejercicio07;

import tp2.ejercicio01y02.BinaryTree;

public class ParcialArboles {
    BinaryTree<Integer> binaryTree;



    public ParcialArboles(BinaryTree<Integer> ab) {
        binaryTree = ab;
    }

    public BinaryTree<Integer> getBinaryTree() {
        return binaryTree;
    }


    public boolean isLeftTree(int num) {
        return busquedaYComparacion(binaryTree, num);
    }

    private boolean busquedaYComparacion(BinaryTree<Integer> arbol, int num) {
        if (arbol == null) return false;
        if (arbol.getData() == num) {
            int izq = contarHijosUnicos(arbol.getLeftChild());
            int der = contarHijosUnicos(arbol.getRightChild());
            System.out.println("Hijos únicos izquierda: " + izq + "\nHijos únicos derecha: " + der);
            return izq > der;
        } else {
            return (busquedaYComparacion(arbol.getLeftChild(), num) ||
                    busquedaYComparacion(arbol.getRightChild(), num));
        }

    }

    private int contarHijosUnicos(BinaryTree<Integer> childs) {
        if (childs == null) return -1;
        if (childs.hasLeftChild() && childs.hasRightChild()) {
            return 0 +
                    contarHijosUnicos(childs.getLeftChild())
                    + contarHijosUnicos(childs.getRightChild());
        }
        else if (childs.hasLeftChild()) {
            return 1 + contarHijosUnicos(childs.getLeftChild());
        }
        else if (childs.hasRightChild()) {
            return 1 + contarHijosUnicos(childs.getRightChild());
        }
        else return 0;
    }

    private int contarHijosUnicosDerecha(BinaryTree<Integer> rightChild) {
        return 0;
    }
}
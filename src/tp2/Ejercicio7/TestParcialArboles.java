package tp2.Ejercicio7;

import tp2.ejercicio1y2.BinaryTree;

public class TestParcialArboles {
    public static void main(String[] args) throws IllegalAccessException {
        BinaryTree<Integer> a = new BinaryTree<>(2);
        BinaryTree<Integer> b = new BinaryTree<>(7);
        BinaryTree<Integer> c = new BinaryTree<>(-5);
        BinaryTree<Integer> d = new BinaryTree<>(23);
        BinaryTree<Integer> e = new BinaryTree<>(6);
        BinaryTree<Integer> f = new BinaryTree<>(19);
        BinaryTree<Integer> g = new BinaryTree<>(-3);
        BinaryTree<Integer> h = new BinaryTree<>(55);
        BinaryTree<Integer> i = new BinaryTree<>(11);
        BinaryTree<Integer> j = new BinaryTree<>(4);
        BinaryTree<Integer> k = new BinaryTree<>(18);
        a.addLeftChild(b);
        a.addRightChild(c);
        b.addLeftChild(d);
        b.addRightChild(e);
        c.addLeftChild(f);
        d.addRightChild(g);
        e.addLeftChild(h);
        e.addRightChild(i);
        f.addRightChild(j);
        j.addLeftChild(k);
        /*
        Si num = 7 devuelve true 1>0
        Si num = 2 devuelve false 1>3
        Si num = -5 devuelve true 2>-1
        Si num = 19 debería devolver false -1>1
        Si num = -3 debería devolver false -1>-1
         */
        ParcialArboles parcialArboles = new ParcialArboles(a);
        System.out.println(parcialArboles.isLeftTree(444));
    }
}

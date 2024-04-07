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
        System.out.println(parcialArboles.isLeftTree(-5));
        BinaryTree<Integer> a1 = new BinaryTree<>(65);
        BinaryTree<Integer> b1 = new BinaryTree<>(37);
        BinaryTree<Integer> c1 = new BinaryTree<>(81);
        BinaryTree<Integer> d1 = new BinaryTree<>(22);
        BinaryTree<Integer> e1 = new BinaryTree<>(47);
        BinaryTree<Integer> f1 = new BinaryTree<>(76);
        BinaryTree<Integer> g1 = new BinaryTree<>(93);
        BinaryTree<Integer> h1 = new BinaryTree<>(11);
        BinaryTree<Integer> i1 = new BinaryTree<>(29);
        BinaryTree<Integer> j1 = new BinaryTree<>(85);
        BinaryTree<Integer> k1 = new BinaryTree<>(94);
        a1.addLeftChild(b1);
        a1.addRightChild(c1);
        b1.addLeftChild(d1);
        b1.addRightChild(e1);
        c1.addLeftChild(f1);
        c1.addRightChild(g1);
        d1.addLeftChild(h1);
        d1.addRightChild(i1);
        g1.addLeftChild(j1);
        g1.addRightChild(k1);
        a1.entreNiveles(0,3);
        BinaryTree<Integer> a2 = new BinaryTree<>();
        a1.clonar(a2);
        a2.getLeftChild().removeLeftChild();
        a2.getLeftChild().getRightChild().removeLeftChild();
        a2.getLeftChild().getRightChild().removeRightChild();
        a2.getRightChild().removeLeftChild();
        a2.getRightChild().getRightChild().removeRightChild();
        a2.getRightChild().getRightChild().removeLeftChild();
        a2.entreNiveles(0,3);
        BinaryTree<Integer> a3 = new BinaryTree<>();
        a1.clonar(a3);
        a3.getRightChild().removeRightChild();
        a3.entreNiveles(0,3);
        tp2.Ejercicio8.ParcialArboles parcialArboles1 = new tp2.Ejercicio8.ParcialArboles(a1);
        System.out.println(parcialArboles1.esPrefijo(a3,a1));


    }

}

package tp2.ejercicio07;

import tp1.ejercicio08.Queue;
import tp2.ejercicio01y02.BinaryTree;
import tp2.ejercicio09.SumaDeEnteros;

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
        tp2.ejercicio08.ParcialArboles parcialArboles1 = new tp2.ejercicio08.ParcialArboles(a1);
        System.out.println(parcialArboles1.esPrefijo(a3,a1));

        BinaryTree<Integer> a10 = new BinaryTree<>(20);
        BinaryTree<Integer> b10 = new BinaryTree<>(5);
        BinaryTree<Integer> c10 = new BinaryTree<>(30);
        BinaryTree<Integer> d10 = new BinaryTree<>(-5);
        BinaryTree<Integer> e10 = new BinaryTree<>(10);
        BinaryTree<Integer> f10 = new BinaryTree<>(50);
        BinaryTree<Integer> g10 = new BinaryTree<>(-9);
        BinaryTree<Integer> h10 = new BinaryTree<>(1);
        BinaryTree<Integer> i10 = new BinaryTree<>(4);
        BinaryTree<Integer> j10 = new BinaryTree<>(6);

        a10.addLeftChild(b10);
        a10.addRightChild(c10);
        b10.addLeftChild(d10);
        b10.addRightChild(e10);
        c10.addLeftChild(f10);
        c10.addRightChild(g10);
        e10.addLeftChild(h10);
        f10.addRightChild(i10);
        i10.addRightChild(j10);
        a10.entreNiveles(0,13);
        tp2.ejercicio09.ParcialArboles parcialArboles2 = new tp2.ejercicio09.ParcialArboles(a10);
        BinaryTree<SumaDeEnteros> resultado = parcialArboles2.sumAndDif(a10);
        imprimeNiveles(resultado);
    }
    public static void imprimeNiveles(BinaryTree<SumaDeEnteros> arbol) throws IllegalAccessException {
        Queue<BinaryTree<SumaDeEnteros>> cola = new Queue<>();
        BinaryTree<SumaDeEnteros> aBTemp;
        int nivel = 0;
        cola.enqueue(arbol);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            aBTemp = cola.dequeue();
            if (aBTemp != null) {
                System.out.print("Nivel : " + nivel + " con valor: " + aBTemp.getData().getSum() + "," + aBTemp.getData().getDif() + "\n");
                if (aBTemp.hasLeftChild()) {
                    cola.enqueue(aBTemp.getLeftChild());
                }
                if (aBTemp.hasRightChild()) {
                    cola.enqueue(aBTemp.getRightChild());
                }
            }
            else {
                nivel++;
                if (!cola.isEmpty()) {
                    cola.enqueue(null);
                }
                System.out.println("");
            }

        }
    }

}

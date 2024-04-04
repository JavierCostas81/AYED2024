package tp2.ejercicio1y2;

import tp1.ejercicio8.Queue;
public class TestBinaryTree {
    public static void main(String[] args) throws IllegalAccessException, CloneNotSupportedException {

        BinaryTree<Integer> a = new BinaryTree<>(1);
        BinaryTree<Integer> b = new BinaryTree<>(2);
        BinaryTree<Integer> c = new BinaryTree<>(3);
        BinaryTree<Integer> d = new BinaryTree<>(4);
        BinaryTree<Integer> e = new BinaryTree<>(5);
        BinaryTree<Integer> f = new BinaryTree<>(6);
        BinaryTree<Integer> g = new BinaryTree<>(7);
        BinaryTree<Integer> h = new BinaryTree<>(8);
        BinaryTree<Integer> i = new BinaryTree<>(9);
        BinaryTree<Integer> j = new BinaryTree<>(10);
        BinaryTree<Integer> k = new BinaryTree<>(11);
        a.addLeftChild(b);
        a.addRightChild(c);
        b.addLeftChild(d);
        b.addRightChild(e);
        c.addLeftChild(f);
        c.addRightChild(g);
        d.addLeftChild(h);
        d.addRightChild(i);
        e.addLeftChild(j);
        e.addRightChild(k);
        System.out.println("La cantidad de hojas de " + a + " es: " + a.contarHojas());
        Queue<Integer> cola = new Queue<>();
        imprimirArbol(a,cola);

        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        System.out.println(" ");
        a.entreNiveles(2,2);
        /*imprimirArbol(a.espejo(),cola);
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        System.out.println(" ");

        imprimirArbol(a,cola);
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }*/

    }

    public static void imprimirArbol(BinaryTree<Integer> t, Queue<Integer> cola) {
        cola.enqueue(t.getData());
        if (t.hasLeftChild()) {
            imprimirArbol(t.getLeftChild(),cola);
        }
        if(t.hasRightChild()){
            imprimirArbol(t.getRightChild(),cola);
        }
    }
}

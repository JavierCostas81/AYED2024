package tp2.ejercicio1y2;

import tp1.ejercicio8.Queue;
import tp2.Ejercicio4.RedBinariaLlena;
import tp2.Ejercicio5.ProfundidadDeArbolBinario;
import tp2.Ejercicio6.Transformacion;
import tp2.ejercicio3.ContadorArbol;

import java.util.ArrayList;
import java.util.List;

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
       /* BinaryTree<Integer> k1 = new BinaryTree<>(25);
        BinaryTree<Integer> k2 = new BinaryTree<>(13);
        BinaryTree<Integer> k3 = new BinaryTree<>(17);*/
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
    /*    k.addRightChild(k1);
        k1.addLeftChild(k2);
        k2.addRightChild(k3);*/
        System.out.println("La cantidad de hojas de " + a + " es: " + a.contarHojas());
        Queue<Integer> cola = new Queue<>();
        imprimirArbol(a, cola);

        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        System.out.println(" ");
        a.entreNiveles(2, 2);
        /*imprimirArbol(a.espejo(),cola);
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }
        System.out.println(" ");

        imprimirArbol(a,cola);
        while (!cola.isEmpty()) {
            System.out.print(cola.dequeue() + " ");
        }*/
        List<Integer> check = new ArrayList<>();
        ContadorArbol contadorArbol = new ContadorArbol(a);
        check = contadorArbol.numerosPares();
        for (Integer m : check) {
            System.out.println(m);
        }
        RedBinariaLlena<Integer> redBinariaLlena = new RedBinariaLlena(a);
        System.out.println("Mayor retardo posible: " + redBinariaLlena.retardoReenvio() + " segundos");
        ProfundidadDeArbolBinario<Integer> profundidadDeArbolBinario = new ProfundidadDeArbolBinario<>(a);
        int p = 2;
        System.out.println("La suma de los nodos de profundidad " + p + " es " + profundidadDeArbolBinario.sumaElementosProfundidad(p));
        BinaryTree<Integer> aa = new BinaryTree<>(1);
        BinaryTree<Integer> bb = new BinaryTree<>(2);
        BinaryTree<Integer> cc = new BinaryTree<>(3);
        BinaryTree<Integer> dd = new BinaryTree<>(4);
        BinaryTree<Integer> ee = new BinaryTree<>(5);
        BinaryTree<Integer> ff = new BinaryTree<>(6);
        BinaryTree<Integer> gg = new BinaryTree<>(7);
        BinaryTree<Integer> hh = new BinaryTree<>(8);
        aa.addLeftChild(bb);
        aa.addRightChild(cc);
        bb.addRightChild(dd);
        cc.addLeftChild(ee);
        cc.addRightChild(ff);
        ee.addLeftChild(gg);
        ee.addRightChild(hh);
        Transformacion arbolTransformado = new Transformacion(aa);
        BinaryTree<Integer> aaa = arbolTransformado.suma();
        Queue<String> cola2 = new Queue<>();
        imprimirArbol2(aaa, cola2);
        while (!cola2.isEmpty()) {
            System.out.print(cola2.dequeue() + " ");
        }
        System.out.println(" ");
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
    public static void imprimirArbol2(BinaryTree<Integer> t, Queue<String> cola) {
        cola.enqueue(t.getData().toString());
        if (t.hasLeftChild()) {
            imprimirArbol2(t.getLeftChild(),cola);
        }
        else if (!t.isLeaf()) { cola.enqueue("null"); }
        if(t.hasRightChild()){
            imprimirArbol2(t.getRightChild(),cola);
        }
        else if (!t.isLeaf()) { cola.enqueue("null"); }
    }
}

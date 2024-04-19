package tp3.ejercicio01;


import tp3.ejercicio02.RecorridosAG;

import java.util.List;

public class TestTP3 {
    public static void main (String[] args) throws IllegalAccessException {
        System.out.println("Ejercicio 2:");
        RecorridosAG recorridosAG = new RecorridosAG();
        List<Integer> listaResultadoEj2;
        GeneralTree<Integer> a = new GeneralTree<>(1);        GeneralTree<Integer> b = new GeneralTree<>(2);
        GeneralTree<Integer> c = new GeneralTree<>(3);        GeneralTree<Integer> d = new GeneralTree<>(4);
        GeneralTree<Integer> e = new GeneralTree<>(5);        GeneralTree<Integer> f = new GeneralTree<>(6);
        GeneralTree<Integer> g = new GeneralTree<>(7);        GeneralTree<Integer> h = new GeneralTree<>(8);
        GeneralTree<Integer> i = new GeneralTree<>(9);        GeneralTree<Integer> j = new GeneralTree<>(10);
        GeneralTree<Integer> k = new GeneralTree<>(11);       GeneralTree<Integer> l = new GeneralTree<>(12);
        a.addChild(b);        a.addChild(c);        a.addChild(d);
        b.addChild(e);
        d.addChild(f);        d.addChild(g);
        e.addChild(h);        e.addChild(i);        e.addChild(j);
        g.addChild(k);        g.addChild(l);
        listaResultadoEj2 = recorridosAG.numerosImparesMayoresQuePreOrden(a,1);
        if (listaResultadoEj2.isEmpty()) {
            System.out.println("Empty List");
        } else {
            System.out.println("PreOrden: " + listaResultadoEj2);
        }
        listaResultadoEj2.clear();
        listaResultadoEj2 = recorridosAG.numerosImparesMayoresQueInOrden(a,1);
        if (listaResultadoEj2.isEmpty()) {
            System.out.println("Empty List");
        } else {
            System.out.println("InOrden: " + listaResultadoEj2);
        }
        listaResultadoEj2.clear();
        listaResultadoEj2 = recorridosAG.numerosImparesMayoresQuePostOrden(a,1);
        if (listaResultadoEj2.isEmpty()) {
            System.out.println("Empty List");
        } else
        System.out.println("PostOrden: " + listaResultadoEj2);
        listaResultadoEj2.clear();
        listaResultadoEj2 = recorridosAG.numerosImparesMayoresQuePorNiveles(a,1);
        if (listaResultadoEj2.isEmpty()) {
            System.out.println("Empty List");
        } else
            System.out.println("Por Niveles: " + listaResultadoEj2);
        System.out.println("Ejercicio 3");
        System.out.println("La altura del arbol es: " + a.altura());
        int min = 0;
        int max = 13;
        int range = max - min + 1;
        int dato = (int) (range * Math.random() + min);
        System.out.println("El dato " + dato + " está en el nivel: " + a.nivel(dato));

    }
}

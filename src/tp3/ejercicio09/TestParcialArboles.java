package tp3.ejercicio09;

import tp3.ejercicio01.GeneralTree;

import java.util.Arrays;

public class TestParcialArboles {
    public static void main(String[] args) throws IllegalAccessException {
        ejercicio9();
        ejercicio10();
        ejercicio11();
    }

    private static void ejercicio9() {
        GeneralTree<Integer> a = new GeneralTree<>(12); GeneralTree<Integer> b = new GeneralTree<>(12);
        GeneralTree<Integer> c = new GeneralTree<>(25); GeneralTree<Integer> d = new GeneralTree<>(35);
        GeneralTree<Integer> e = new GeneralTree<>(12); GeneralTree<Integer> f = new GeneralTree<>(25);
        GeneralTree<Integer> g = new GeneralTree<>(35); GeneralTree<Integer> h = new GeneralTree<>(14);
        GeneralTree<Integer> i = new GeneralTree<>(12); GeneralTree<Integer> j = new GeneralTree<>(33);
        GeneralTree<Integer> k = new GeneralTree<>(35); GeneralTree<Integer> l = new GeneralTree<>(35);
        GeneralTree<Integer> m = new GeneralTree<>(83); GeneralTree<Integer> n = new GeneralTree<>(90);
        GeneralTree<Integer> o = new GeneralTree<>(33);
        j.setChildren(Arrays.asList(l,m,n,o));
        g.addChild(k);
        e.setChildren(Arrays.asList(h,i,j));
        d.addChild(g);
        c.addChild(f);
        b.setChildren(Arrays.asList(d,e));
        a.setChildren(Arrays.asList(b,c));
        //System.out.println(a.toString() + b + c + d + e + f + g + h + i + j + k + l + m + n + o);
        System.out.println("Ejercicio 9\na) ¿Es de Selección?: " + ParcialArboles.esDeSeleccion(a));
        e.setData(18);
        i.setData(18);
        System.out.println("b) ¿Es de Selección?: " + ParcialArboles.esDeSeleccion(a));
    }

    private static void ejercicio10() {
        GeneralTree<Integer> a = new GeneralTree<>(1);
        GeneralTree<Integer> b = new GeneralTree<>(0);
        GeneralTree<Integer> c = new GeneralTree<>(1);
        GeneralTree<Integer> d = new GeneralTree<>(1);
        GeneralTree<Integer> e = new GeneralTree<>(1);
        GeneralTree<Integer> f = new GeneralTree<>(1);
        GeneralTree<Integer> g = new GeneralTree<>(1);
        GeneralTree<Integer> h = new GeneralTree<>(0);
        GeneralTree<Integer> i = new GeneralTree<>(0);
        GeneralTree<Integer> j = new GeneralTree<>(1);
        GeneralTree<Integer> k = new GeneralTree<>(1);
        GeneralTree<Integer> l = new GeneralTree<>(1);
        GeneralTree<Integer> m = new GeneralTree<>(0);
        GeneralTree<Integer> n = new GeneralTree<>(0);
        GeneralTree<Integer> o = new GeneralTree<>(1);
        GeneralTree<Integer> p = new GeneralTree<>(0);
        GeneralTree<Integer> q = new GeneralTree<>(0);
        n.setChildren(Arrays.asList(p,q));
        m.addChild(o);
        i.addChild(n);
        h.addChild(m);
        e.setChildren(Arrays.asList(j,k,l));
        d.addChild(i);
        c.setChildren(Arrays.asList(g,h));
        b.setChildren(Arrays.asList(e,f));
        a.setChildren(Arrays.asList(b,c,d));
        System.out.println("Ejercicio 10:\nLa lista filtrada es: " + ParcialArboles.resolver(a));
    }

    private static void ejercicio11() throws IllegalAccessException {
        GeneralTree<Integer> a = new GeneralTree<>(2);  GeneralTree<Integer> b = new GeneralTree<>(1);
        GeneralTree<Integer> c = new GeneralTree<>(25); GeneralTree<Integer> d = new GeneralTree<>(5);
        GeneralTree<Integer> e = new GeneralTree<>(4);  GeneralTree<Integer> f = new GeneralTree<>(13);
        GeneralTree<Integer> g = new GeneralTree<>(18); GeneralTree<Integer> h = new GeneralTree<>(7);
        GeneralTree<Integer> i = new GeneralTree<>(11); GeneralTree<Integer> j = new GeneralTree<>(3);
        GeneralTree<Integer> k = new GeneralTree<>(83); GeneralTree<Integer> l = new GeneralTree<>(33);
        GeneralTree<Integer> m = new GeneralTree<>(12); GeneralTree<Integer> n = new GeneralTree<>(17);
        GeneralTree<Integer> o = new GeneralTree<>(9);
        j.setChildren(Arrays.asList(l,m,n,o));
        g.addChild(k);
        e.setChildren(Arrays.asList(h,i,j));
        d.addChild(g);
        c.addChild(f);
        b.setChildren(Arrays.asList(d,e));
        a.setChildren(Arrays.asList(b,c));
        System.out.println("Ejercicio 11:\na) ¿Es creiciente?: " + ParcialArboles.resolver2(a));
        e.setChildren(Arrays.asList(h,j));
        System.out.println("b) ¿Es creciente?: " + ParcialArboles.resolver2(a));
    }
}

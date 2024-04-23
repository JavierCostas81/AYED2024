package tp3.ejercicio01;
import tp3.ejercicio02.RecorridosAG;
import tp3.ejercicio04.AnalizadorArbol;
import tp3.ejercicio04.AreaEmpresa;
import tp3.ejercicio06.RedDeAguaPotable;
import tp3.ejercicio07.Caminos;
import tp3.ejercicio08.Navidad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TestTP3 {
    public static void main (String[] args) throws IllegalAccessException {
       ejercicio2();
       ejercicio3();
       ejercicio4();
       ejercicio5();
       ejercicio6();
       ejercicio7();
       ejercicio8();
    }
    private static void ejercicio2() throws IllegalAccessException {
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
    }

    private static void ejercicio3() throws IllegalAccessException {
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
        e.addChild(k);        g.addChild(l);
        System.out.println("Ejercicio 3");
        System.out.println("La altura del arbol es: " + a.altura());
        int min = 0;
        int max = 13;
        int range = max - min + 1;
        int dato = (int) (range * Math.random() + min);
        System.out.println("El dato " + dato + " está en el nivel: " + a.nivel(dato));
        System.out.println("El ancho del arbol es: " + a.ancho());
    }

    private static void ejercicio4() throws IllegalAccessException {
        AreaEmpresa m1 = new AreaEmpresa("M",14);
        AreaEmpresa j1 = new AreaEmpresa("J",13);
        AreaEmpresa k1 = new AreaEmpresa("K",25);
        AreaEmpresa l1 = new AreaEmpresa("L",10);
        AreaEmpresa a1 = new AreaEmpresa("A",4);
        AreaEmpresa b1 = new AreaEmpresa("B",7);
        AreaEmpresa c1 = new AreaEmpresa("C",5);
        AreaEmpresa d1 = new AreaEmpresa("D",6);
        AreaEmpresa e1 = new AreaEmpresa("E",10);
        AreaEmpresa f1 = new AreaEmpresa("F",18);
        AreaEmpresa g1 = new AreaEmpresa("G",9);
        AreaEmpresa h1 = new AreaEmpresa("H",12);
        AreaEmpresa i1 = new AreaEmpresa("I",19);
        GeneralTree<AreaEmpresa> a = new GeneralTree<>(a1);
        GeneralTree<AreaEmpresa> b = new GeneralTree<>(b1);
        GeneralTree<AreaEmpresa> c = new GeneralTree<>(c1);
        GeneralTree<AreaEmpresa> d = new GeneralTree<>(d1);
        GeneralTree<AreaEmpresa> e = new GeneralTree<>(e1);
        GeneralTree<AreaEmpresa> f = new GeneralTree<>(f1);
        GeneralTree<AreaEmpresa> g = new GeneralTree<>(g1);
        GeneralTree<AreaEmpresa> h = new GeneralTree<>(h1);
        GeneralTree<AreaEmpresa> i = new GeneralTree<>(i1);
        GeneralTree<AreaEmpresa> j = new GeneralTree<>(j1, Arrays.asList(a,b,c));
        GeneralTree<AreaEmpresa> k = new GeneralTree<>(k1, Arrays.asList(d,e,f));
        GeneralTree<AreaEmpresa> l = new GeneralTree<>(l1, Arrays.asList(g,h,i));
        GeneralTree<AreaEmpresa> m = new GeneralTree<>(m1, Arrays.asList(j,k,l));
        System.out.println("Ejercicio 4\nEl máximo promedio de tardanza es: " + AnalizadorArbol.devolverMaximoPromedio(m));
    }
    private static void ejercicio5() {
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
        int A = 4;
        int B = 6;
        System.out.println(String.format("Ejercicio 5\nEs " + A + " ancestro de " + B + "?" + "( %s )",a.esAncestro(A,B)));
    }
    private static void ejercicio6() {
        RedDeAguaPotable redDeAguaPotable;
        GeneralTree<Character> a = new GeneralTree<>('A');        GeneralTree<Character> b = new GeneralTree<>('B');
        GeneralTree<Character> c = new GeneralTree<>('C');        GeneralTree<Character> d = new GeneralTree<>('D');
        GeneralTree<Character> e = new GeneralTree<>('E');        GeneralTree<Character> f = new GeneralTree<>('F');
        GeneralTree<Character> g = new GeneralTree<>('G');        GeneralTree<Character> h = new GeneralTree<>('H');
        GeneralTree<Character> i = new GeneralTree<>('I');        GeneralTree<Character> j = new GeneralTree<>('J');
        GeneralTree<Character> k = new GeneralTree<>('K');        GeneralTree<Character> l = new GeneralTree<>('L');
        GeneralTree<Character> m = new GeneralTree<>('M');        GeneralTree<Character> n = new GeneralTree<>('N');
        GeneralTree<Character> p = new GeneralTree<>('P');
        g.addChild(l);
        j.setChildren(Arrays.asList(m,n));
        c.setChildren(Arrays.asList(f,g));
        d.setChildren(Arrays.asList(h,i,j,k,p));
        a.setChildren(Arrays.asList(b,c,d,e));
        double caudal = 1000;
        redDeAguaPotable = new RedDeAguaPotable(a);
        System.out.println("Ejercicio 6\nEl caudal mínimo para " + caudal +
                " litros de agua es: " + redDeAguaPotable.minimoCaudal(caudal) + " litros");
    }
    private static void ejercicio7() {
        GeneralTree<Integer> a = new GeneralTree<>(12);        GeneralTree<Integer> b = new GeneralTree<>(17);
        GeneralTree<Integer> c = new GeneralTree<>(9);        GeneralTree<Integer> d = new GeneralTree<>(15);
        GeneralTree<Integer> e = new GeneralTree<>(10);        GeneralTree<Integer> f = new GeneralTree<>(6);
        GeneralTree<Integer> g = new GeneralTree<>(8);        GeneralTree<Integer> h = new GeneralTree<>(14);
        GeneralTree<Integer> i = new GeneralTree<>(18);        GeneralTree<Integer> j = new GeneralTree<>(1);
        GeneralTree<Integer> k = new GeneralTree<>(16);       GeneralTree<Integer> l = new GeneralTree<>(7);
        h.setChildren(Arrays.asList(k,l));
        f.addChild(j);
        c.addChild(g);
        d.setChildren(Arrays.asList(h,i));
        b.setChildren(Arrays.asList(e,f));
        a.setChildren(Arrays.asList(b,c,d));
        Caminos caminos = new Caminos(a);
        System.out.println(caminos.caminoAHojaMasLejana());
    }
    private static void ejercicio8() {
        GeneralTree<Integer> a = new GeneralTree<>(1);        GeneralTree<Integer> b = new GeneralTree<>(2);
        GeneralTree<Integer> c = new GeneralTree<>(3);        GeneralTree<Integer> d = new GeneralTree<>(4);
        GeneralTree<Integer> e = new GeneralTree<>(5);        GeneralTree<Integer> f = new GeneralTree<>(6);
        GeneralTree<Integer> g = new GeneralTree<>(7);        GeneralTree<Integer> h = new GeneralTree<>(8);
        a.setChildren(Arrays.asList(b,c,d));
        Navidad abeto = new Navidad(a);
        System.out.println("Ejercicio 8\nEjemplo 1: ¿Es abeto?: " + abeto.esAbetoNavidenio());
        b.setChildren(Arrays.asList(e,f,g));
        System.out.println("Ejemplo 2: ¿Es abeto?: " + abeto.esAbetoNavidenio());
        a.setChildren(Arrays.asList(b,c,d,e));
        c.setChildren(Arrays.asList(f,g,h));
        b.setChildren(new ArrayList<>());
        System.out.println("Ejemplo 3: ¿Es abeto?: " + abeto.esAbetoNavidenio());
    }
}

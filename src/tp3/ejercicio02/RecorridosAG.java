package tp3.ejercicio02;

import tp1.ejercicio08.Queue;
import tp3.ejercicio01.GeneralTree;

import java.util.ArrayList;
import java.util.List;

public class RecorridosAG {

    public List<Integer> numerosImparesMayoresQuePreOrden (GeneralTree<Integer> a, Integer n) {
//Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
//pasados como parámetros, recorrido en preorden.
        List<Integer> resultado = new ArrayList<>();
        if ((a != null) && !a.isEmpty()) {
            int b = a.getData();
            if (b % 2 != 0 && b > n) {
                resultado.add(b);
            }
            for (GeneralTree<Integer> childs: a.getChildren()) {
                resultado.addAll(numerosImparesMayoresQuePreOrden(childs,n));
            }

        }
        return resultado;
    }

    public List<Integer> numerosImparesMayoresQueInOrden (GeneralTree <Integer> a,Integer n) {
  /*  Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
    pasados como parámetros, recorrido en inorden.*/
        List<Integer> resultado = new ArrayList<>();
        if ((a != null) && !a.isEmpty()) {
            if (a.hasChildren()) {
                for (int i = 0; i < a.getChildren().size(); i++) {
                    if (i == 0) {
                        resultado.addAll(numerosImparesMayoresQueInOrden(a.getChildren().get(i), n));
                        int b = a.getData();
                        if (b % 2 != 0 && b > n) {
                            resultado.add(b);
                        }
                    } else {
                        resultado.addAll(numerosImparesMayoresQueInOrden(a.getChildren().get(i), n));
                    }
                }
            }
            else
            {
                int b = a.getData();
                if (b % 2 != 0 && b > n) {
                    resultado.add(b);
                }
            }
        }
        return resultado;
    }
    public List<Integer> numerosImparesMayoresQuePostOrden (GeneralTree <Integer> a,Integer n) {
    /*Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
    pasados como parámetros, recorrido en postorden.*/
        List<Integer> resultado = new ArrayList<>();
        if ((a != null) && !a.isEmpty()) {
            for (GeneralTree<Integer> childs: a.getChildren()) {
                resultado.addAll(numerosImparesMayoresQuePostOrden(childs, n));
            }
            int b = a.getData();
            if (b % 2 != 0 && b > n) {
                resultado.add(b);
            }
        }
        return resultado;
    }
    public List<Integer> numerosImparesMayoresQuePorNiveles(GeneralTree <Integer> a,Integer n) throws IllegalAccessException {
   /* Método que retorna una lista con los elementos impares del árbol “a” que sean mayores al valor “n”
    pasados como parámetros, recorrido por niveles.*/
        List<Integer> resultado = new ArrayList<>();
        Queue<GeneralTree<Integer>> cola = new Queue<>();
        GeneralTree<Integer> aG;
        cola.enqueue(a);
        cola.enqueue(null);
        while (!cola.isEmpty()) {
            if (((aG = cola.dequeue()) != null) && (!aG.isEmpty())) {
                int b = aG.getData();
                if (b % 2 != 0 && b > n) {
                    resultado.add(b);
                }
                for (GeneralTree<Integer> gT : aG.getChildren()
                ) {
                    cola.enqueue(gT);
                }
            } else if (!cola.isEmpty()) {
                cola.enqueue(null);
            }
        }
        return resultado;
    }
}
/*
b) Si ahora tuviera que implementar estos métodos en la clase GeneralTree<T>, ¿qué modificaciones
        haría tanto en la firma como en la implementación de los mismos?
    El llamado recursivo se haría sobre él mismo "this".
    La firma cambiaría porque el objeto árbol no se pasaría por parámetro.


*/

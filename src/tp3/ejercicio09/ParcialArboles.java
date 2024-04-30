package tp3.ejercicio09;

import tp1.ejercicio08.Queue;
import tp3.ejercicio01.GeneralTree;

import java.util.ArrayList;
import java.util.List;

/*Implemente en la clase ParcialArboles el método:
public static boolean esDeSeleccion (GeneralTree<Integer> arbol)
        que devuelve true si el árbol recibido por parámetro es de selección, falso sino lo es.
        Un árbol general es de selección si cada nodo tiene en su raíz el valor del menor de sus hijos.Por
        ejemplo, para el siguiente árbol se debería retornar: true
        Para este otro árbol se debería retornar false (el árbol con raíz 18 tiene un hijo con valor mínimo 14 )
*/
public class ParcialArboles {
    public static boolean esDeSeleccion(GeneralTree<Integer> arbol) {
        boolean ok = false;
        if (arbol != null && !arbol.isEmpty()) {
            ok = minimoHijos(arbol);
            for (GeneralTree<Integer> child : arbol.getChildren()) {
                if (!child.isLeaf())
                    ok = ok && esDeSeleccion(child);
            }
        }
        return ok;
    }

    private static boolean minimoHijos(GeneralTree<Integer> padre) {
        int minimo = Integer.MAX_VALUE;
        for (GeneralTree<Integer> child : padre.getChildren()) {
            minimo = Math.min(child.getData(), minimo);
        }
        return minimo == padre.getData();
    }

    public static List<Integer> resolver(GeneralTree<Integer> arbol) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> tLista = new ArrayList<>();
        resolver(arbol,0,0, 0, lista, tLista);
        return lista;
    }

    private static int resolver (GeneralTree<Integer> arbol,int nivel, int suma, int max, List<Integer> lista, List<Integer> tLista) {
        if (arbol != null && !arbol.isEmpty()) {
            if (arbol.getData() == 1) {
                tLista.add(arbol.getData());
            }
            suma += (arbol.getData() * nivel);
            for (GeneralTree<Integer> ag : arbol.getChildren()) {
                max = resolver(ag, nivel + 1, suma , max, lista,tLista);
            }
            if (arbol.isLeaf()) {
                if (max<suma) {
                    max = suma;
                    lista.clear();
                    lista.addAll(tLista);
                }
            }
            if (arbol.getData() == 1) {
                tLista.remove(tLista.size()-1);
            }
        }
        return Math.max(max,suma);
    }

    public static boolean resolver2(GeneralTree<Integer> arbol) throws IllegalAccessException {
        Queue<GeneralTree<Integer>> cola = new Queue<>();
        GeneralTree<Integer> agTemp;
        boolean test = (arbol != null && !arbol.isEmpty());
        int nivel = test ? 1 : -1;
        cola.enqueue(arbol);
        cola.enqueue(null);
        while (!cola.isEmpty() && test) {
            int nodosNivel = 0;
            while ((agTemp = cola.dequeue()) != null) {
                for (GeneralTree<Integer> child : agTemp.getChildren()) {
                     nodosNivel++;
                     if (!child.isLeaf()){
                         cola.enqueue(child);
                     }
                }
                test = (nivel + 1) == nodosNivel;
            }
            if (!cola.isEmpty() && test) {
                cola.enqueue(null);
                nivel++;
            }
        }
        return test;
    }
}
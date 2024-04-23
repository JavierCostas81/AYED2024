package tp3.ejercicio09;

import tp3.ejercicio01.GeneralTree;

import java.util.List;

/*Implemente en la clase ParcialArboles el método:
public static boolean esDeSeleccion (GeneralTree<Integer> arbol)
        que devuelve true si el árbol recibido por parámetro es de selección, falso sino lo es.
        Un árbol general es de selección si cada nodo tiene en su raíz el valor del menor de sus hijos.Por
        ejemplo, para el siguiente árbol se debería retornar: true
        Para este otro árbol se debería retornar false (el árbol con raíz 18 tiene un hijo con valor mínimo 14 )
*/
public class ParcialArboles {
    public static boolean esDeSeleccion (GeneralTree<Integer> arbol) {
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
            minimo = Math.min(child.getData(),minimo);
        }
        return minimo == padre.getData();
    }
}

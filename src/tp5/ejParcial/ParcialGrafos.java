package tp5.ejParcial;

import tp5.ejercicio01.Graph;
import tp5.ejercicio01.Vertex;

import java.util.ArrayList;
import java.util.List;

public class ParcialGrafos {

    public List<String> retornarMejorCaminoMaxFrutales(Graph<String> bosque, String caperucita, String abuelita,
                                                       int maxFrutales) {

        Resultado res = new Resultado();
        if ((bosque != null) && (!bosque.isEmpty())) {
            Vertex<String> v = bosque.search(caperucita);
            Vertex<String> w = bosque.search(abuelita);
            if (v != null && w != null) {
                boolean[] bool = new boolean[bosque.getSize()];
                bool[v.getPosition()] = true;
                int temp = 0;
                List<String> lis = new ArrayList<>();
                lis.add(caperucita);
                dfs(bosque,v,abuelita,temp,maxFrutales, lis, res, bool);
            }
        }
        return res.getRecorrido();
    }

    private void dfs(Graph<String> bosque, Vertex<String> v, String abuelita, int temp, int maxFrutales,
                     List<String> lis, Resultado res, boolean[] bool) {

        for (var ady: bosque.getEdges(v)) {
            int pos = ady.getTarget().getPosition();
            if (!bool[pos]) {
                int peso = ady.getWeight();
                Vertex<String> aux = ady.getTarget();
                if (peso < maxFrutales) {
                    bool[pos] = true;
                    lis.add(aux.getData());
                    temp += peso;
                    if (aux.getData().equals(abuelita)) {
                        if (temp > res.getMax()) {
                            res.add(temp,lis);
                        }
                    }
                    else {
                        dfs(bosque,aux,abuelita,temp,maxFrutales,lis,res,bool);
                    }
                    lis.remove(aux.getData());
                    bool[pos] = false;
                    temp -= peso;
                }
            }

        }
    }
}

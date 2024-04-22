package tp3.ejercicio07;

import tp3.ejercicio01.GeneralTree;

import java.util.ArrayList;
import java.util.List;

public class Caminos {
    /*Ejercicio 7
    Dada una clase Caminos que contiene una variable de instancia de tipo GeneralTree de números
    enteros, implemente un método que retorne el camino a la hoja más lejana. En el caso de haber
    más de un camino máximo retorne el primero que encuentre.
    El método debe tener la siguiente firma: public List<Integer> caminoAHojaMasLejana ()
    Por ejemplo, para el siguiente árbol, la lista a retornar seria: 12, 17, 6, 1 de longitud 3
    */
   GeneralTree<Integer> caminos;

   public Caminos (GeneralTree<Integer> arbolDeCaminos) {
       this.caminos = arbolDeCaminos;
   }

    public List<Integer> caminoAHojaMasLejana () {
       List<Integer> lista = new ArrayList<>();
        caminoAHojaMasLejana(0,lista);
        return lista;
    }

    private int caminoAHojaMasLejana (int i, List<Integer> lista) {
        int max = 0;
        if ((caminos == null) || (caminos.isEmpty())) {
            return -1;
        }

        else {
            lista.add(caminos.getData());
            for (GeneralTree<Integer> ag : caminos.getChildren()
            ) {
                Caminos caminos = new Caminos(ag);
                max = Math.max(caminos.caminoAHojaMasLejana(i + 1,lista), max);
            }

        }
        return Math.max(max,i);
    }
}

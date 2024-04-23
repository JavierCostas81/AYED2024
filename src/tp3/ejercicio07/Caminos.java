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

        return caminoAHojaMasLejana(caminos);
    }

    private List<Integer> caminoAHojaMasLejana (GeneralTree<Integer> arbol) {
        List<Integer> max = new ArrayList<>();
        if (arbol != null && !arbol.isEmpty()) {
            List<Integer> tmp;
            for (GeneralTree<Integer> ag : arbol.getChildren()) {
                tmp = caminoAHojaMasLejana(ag);
                if (tmp.size() > max.size()) {
                    max = tmp;
                }
            }
            max.add(0, arbol.getData());

        }
        return max;
    }
}

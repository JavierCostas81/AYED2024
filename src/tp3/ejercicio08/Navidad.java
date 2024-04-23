package tp3.ejercicio08;

import tp3.ejercicio01.GeneralTree;

public class Navidad {
    /*Ejercicio 8
    Retomando el ejercicio abeto navideño visto en teoría, cree una clase Navidad que cuenta con una
    variable de instancia GeneralTree que representa al abeto (ya creado) e implemente el método con la
    firma: public String esAbetoNavidenio()*/
    GeneralTree<Integer> abeto;
    public Navidad(GeneralTree<Integer> isAbeto) {
        this.abeto = isAbeto;
    }
    public String esAbetoNavidenio() {
        if (esAbetoNavidenio(abeto)) {
            return "Yes";
        }
        return "No";
    }
    private boolean esAbetoNavidenio(GeneralTree<Integer> arbol) {
        boolean control = false;
        if (arbol != null && !arbol.isEmpty()) {
            if (!arbol.isLeaf()) {
                int hojas = 0;
                for (GeneralTree<Integer> hijo : arbol.getChildren()) {
                    if (!hijo.isLeaf()) {
                        control = esAbetoNavidenio(hijo);
                    } else {
                        hojas++;
                        control = (hojas >= 3);
                    }
                }
            }
        }
        return control;
    }
}

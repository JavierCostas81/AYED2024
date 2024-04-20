package tp3.ejercicio04;

/*Se debe devolver el mayor promedio entre todos los valores promedios de los niveles.
        Para el ejemplo presentado, el promedio del nivel 0 es 14, el del nivel 1 es 16 y el del nivel 2 es 10. Por
        lo tanto, debe devolver 16.
        a) Indique y justifique qué tipo de recorrido utilizará para resolver el problema.
        b) Implementar en una clase AnalizadorArbol, el método con la siguiente firma:
public double devolverMaximoPromedio (GeneralTree<AreaEmpresa>arbol)
        Donde AreaEmpresa es una clase que representa a un área de la empresa mencionada y que contiene
        la identificación de la misma representada con un String y una tardanza de transmisión de mensajes
        interna representada con int.*/

import tp1.ejercicio08.Queue;
import tp3.ejercicio01.GeneralTree;

import java.util.List;

public class AnalizadorArbol {
    //Un recorrido por niveles como en el método ancho() para poder sacar el cálculo por nivel de retardo.
    public static double devolverMaximoPromedio (GeneralTree<AreaEmpresa> arbol) throws IllegalAccessException {
        Queue<List<GeneralTree<AreaEmpresa>>> cola = new Queue<>();
        List<GeneralTree<AreaEmpresa>> childs;
        double resultado = -1.0;
        if ((!arbol.isEmpty())) {
            resultado = arbol.getData().getTardanzaTransmision();
        }
        else {
            return resultado;
        }
        cola.enqueue(arbol.getChildren());
        cola.enqueue(null);

        while (!cola.isEmpty()) {
            int divisor = 0;
            int dividendo = 0;
            while ((childs = cola.dequeue()) != null) {
                divisor+= childs.size();
                for (GeneralTree<AreaEmpresa> aG: childs
                ) {
                    if (!aG.isLeaf()) {
                        cola.enqueue(aG.getChildren());
                    }
                    dividendo+= aG.getData().getTardanzaTransmision();
                }
            }
            resultado = Math.max(resultado,dividendo/divisor);
            if (!cola.isEmpty()) {
                cola.enqueue(null);
            }
        }
        return resultado;
    }

}

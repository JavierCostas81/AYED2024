package tp3.ejercicio06;

import tp2.ejercicio01y02.BinaryTree;
import tp3.ejercicio01.GeneralTree;

public class RedDeAguaPotable {
     /*Ejercicio 6
        Sea una red de agua potable, la cual comienza en un caño maestro y la misma se va dividiendo
        sucesivamente hasta llegar a cada una de las casas.
        Por el caño maestro ingresan “x” cantidad de litros y en la medida que el caño se divide, de acuerdo
        con las bifurcaciones que pueda tener, el caudal se divide en partes iguales en cada una de ellas. Es
        decir, si un caño maestro recibe 1000 litros y tiene por ejemplo 4 bifurcaciones se divide en 4 partes
        iguales, donde cada división tendrá un caudal de 250 litros.
        Luego, si una de esas divisiones se vuelve a dividir, por ej. en 5 partes, cada una tendrá un caudal de
        50 litros y así sucesivamente hasta llegar a un lugar sin bifurcaciones.
        Se debe implementar una clase RedDeAguaPotable que contenga el método con la siguiente firma:
        public double minimoCaudal(double caudal)
        que calcule el caudal de cada nodo y determine cuál es el caudal mínimo que recibe una casa. Asuma
        que la estructura de caños de la red está representada por una variable de instancia de la clase
        RedAguaPotable y que es un GeneralTree<Character>.
        Extendiendo el ejemplo en el siguiente gráfico, al llamar al método minimoCaudal con un valor de
        1000.0 debería retornar 25.0
*/
    private GeneralTree<Character> redAguaPotable;

    public RedDeAguaPotable (GeneralTree<Character> aGeneralTree) {
        this.redAguaPotable =  aGeneralTree;
    }
     public double minimoCaudal(double caudal) {
         double min = caudal;
         if ((redAguaPotable == null) || (redAguaPotable.isEmpty())) {
             return caudal;
         }
         else {
             for (GeneralTree<Character> nodo : redAguaPotable.getChildren()
             ) {
                 RedDeAguaPotable hijo = new RedDeAguaPotable(nodo);
                 min = Math.min(hijo.minimoCaudal((caudal / redAguaPotable.getChildren().size())),min);
             }
         }
         return Math.min(caudal,min);
       // return calcularCaudalMínimo(caudal,redAguaPotable);
     }
    private double calcularCaudalMínimo(double caudal, GeneralTree<Character> red) {
        double min = caudal;
        if ((red == null) || (red.isEmpty())) {
            return caudal;
        }
        else {
            for (GeneralTree<Character> nodo : red.getChildren()
            ) {
                min = Math.min(calcularCaudalMínimo((caudal / red.getChildren().size()), nodo),min);
            }
        }
        return Math.min(caudal,min);
    }
}

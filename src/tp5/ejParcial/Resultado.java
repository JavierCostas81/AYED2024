package tp5.ejParcial;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private int max;
    private List<String> recorrido;
    public Resultado () {
        this.max = 0;
        this.recorrido = new ArrayList<>();
    }
    public void add (int maximo, List<String> camino) {
        this.max = maximo;
        this.recorrido = new ArrayList<>(camino);
    }

    public int getMax() {
        return this.max;
    }

    public List<String> getRecorrido () {
        return this.recorrido;
    }

}

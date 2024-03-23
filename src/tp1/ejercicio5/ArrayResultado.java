package tp1.ejercicio5;

public class ArrayResultado {
    private int min,
                max,
                prom;
    public ArrayResultado() {

    }

    public ArrayResultado(int min, int max, int prom) {
        this.min = min;
        this.max = max;
        this.prom = prom;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getProm() {
        return prom;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }

    public void sumProm(int prom) {
        this.prom += prom;
    }

    public ArrayResultado calcularMinMaxProm(int[] arr) {
        if (arr.length < 1) return new ArrayResultado(0,0,0);
        setMin(arr[0]);
        setMax(arr[0]);
        setProm(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (getMin() > arr[i]) {
                setMin(arr[i]);
            }
            else if (getMax() < arr[i]) {
                setMax(arr[i]);
            }
            sumProm(arr[i]);
        }
        setProm(getProm() / arr.length);
        return this;
    }
}

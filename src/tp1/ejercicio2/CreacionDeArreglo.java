package tp1.ejercicio2;

public class CreacionDeArreglo {
    public static int[] arregloDeMultiplos (int n) {
        int[] arrayDeMultiplos = new int[n];
        for (int i = 1; i <= n; i++) {
            arrayDeMultiplos[i-1] = i * n;
        }

        return arrayDeMultiplos;

    }

    public static void ImprimirArreglo (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

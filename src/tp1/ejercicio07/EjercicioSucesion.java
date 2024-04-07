package tp1.ejercicio07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioSucesion {
    public static List<Integer> calcularSucesion(int n) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(n));
        calcularSucesionRecursivo(integerList, n);
        return integerList;

    }

    private static void calcularSucesionRecursivo(List<Integer> lista, int n) {
        if (n > 1) {
            if (n % 2 == 0) {
                lista.add(n/2);
                calcularSucesionRecursivo(lista,n/2);
            }
            else {
                lista.add((3*n)+1);
                calcularSucesionRecursivo(lista,(3*n)+1);
            }
        }
    }
}

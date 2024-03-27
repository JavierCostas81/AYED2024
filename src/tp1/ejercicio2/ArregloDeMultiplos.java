package tp1.ejercicio2;

import java.util.Scanner;

public class ArregloDeMultiplos {

    public static void main(String[] args) {
        int[] resul;
        Scanner s = new Scanner(System.in);
        System.out.println("Largo del array: ");
        int scanInt = s.nextInt();
        while (scanInt > 0) {
            resul = new int[scanInt];
            resul = CreacionDeArreglo.arregloDeMultiplos(scanInt);
            CreacionDeArreglo.ImprimirArreglo(resul);
            System.out.println("Largo del array: ");
            scanInt = s.nextInt();
        }
        System.out.println("Valor de salida " + scanInt);
        s.close();
    }

}

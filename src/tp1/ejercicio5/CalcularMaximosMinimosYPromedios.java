package tp1.ejercicio5;


import java.util.Scanner;

public class CalcularMaximosMinimosYPromedios {
    static ArrayResultado gArrayResultado;
    public static void main(String[] args) {
        int[] arrayVacioDeEnteros = new int[0];
        int[] arrayDeEnteros = {0, 5, 18, 9, 33, 25};
        ArrayResultado arrayResultado = new ArrayResultado();
        Scanner s = new Scanner(System.in);
        String menu = "\nIngrese:\n" +
                "1: Para calcular Máximo, Mínimo y Promedio mediante return\n" +
                "2: Para calcular Máximo, Mínimo y Promedio mediante parámetro\n" +
                "3: Para calcular Máximo, Mínimo y Promedio sin return ni parámetro\n" +
                "Cualquier otro entero para salir.\n" +
                "Esperando ingreso por teclado...";
        System.out.println(menu);
        int sValue =  s.nextInt();
        while ((sValue > 0) && (sValue<4)) {
            switch (sValue) {
                case 1: {
                    arrayResultado = devolucionPorReturn(arrayDeEnteros);
                }
                case 2: {
                    devolucionPorParametro(arrayDeEnteros, arrayResultado);
                }
                case 3: {
                    int i = calcularSinReturnNiParametro(0, arrayDeEnteros);
                    arrayResultado = gArrayResultado;
                }
                System.out.println("Mínimo: " + arrayResultado.getMin() + ", Máximo: " + arrayResultado.getMax() +
                        ", Promedio: " + arrayResultado.getProm());
                System.out.println(menu);
                sValue = s.nextInt();
            }
        }
        System.out.println("Saliendo...");
        s.close();
    }

    public static ArrayResultado devolucionPorReturn (int[] arr) {
        return new ArrayResultado().calcularMinMaxProm(arr);
    }
    public static void devolucionPorParametro(int[] arr, ArrayResultado arrayResultado){
        arrayResultado.calcularMinMaxProm(arr);
    }

    public static int calcularSinReturnNiParametro(int i, int[] arr) {
        if (arr.length < 1) {
            gArrayResultado = new ArrayResultado(0, 0, 0);
            return -1;
        }
        if (i == 0) {
            gArrayResultado = new ArrayResultado(arr[i], arr[i], arr[i]);
            return calcularSinReturnNiParametro(i + 1, arr);
        } else if (i < arr.length) {
            if (gArrayResultado.getMax() < arr[i]) {
                gArrayResultado.setMax(arr[i]);
            } else if (gArrayResultado.getMin() > arr[i]) {
                gArrayResultado.setMin(arr[i]);
            }
            gArrayResultado.sumProm(arr[i]);
            return calcularSinReturnNiParametro(i + 1, arr);
        }
        else {
            gArrayResultado.setProm(gArrayResultado.getProm()/i);
            return i;
        }
    }
}

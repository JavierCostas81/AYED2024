package tp1.ejercicio01;

public class Estructuras {

    public static void usandoFor(int a, int b) {
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            System.out.println(i);
        }
    }

    public static void usandoWhile(int a, int b) {
        int w = Math.max(a, b) - Math.min(a, b);
        while (w > 0) {
            System.out.println(Math.max(a, b) - w);
            w--;
        }
    }

    public static void sinEstructurasDeDatos(int a, int b){
        if (a > b) {
            sinEstructurasDeDatos(a-1, b);
            System.out.println(a);
        }
        else if (a < b) {
            sinEstructurasDeDatos(a, b-1);
            System.out.println(b);
        }
        else {
            System.out.println(a);
        }
    }

}

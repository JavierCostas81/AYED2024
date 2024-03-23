package tp1.ejercicio4;

public class SwapValores {
    public static void swap1 (int x, int y ) {
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
    }

    public static void swap2 (Integer x, Integer y) {
        if (x < y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
    }
    public static void main(String args[]) {
        int a=1,
            b=2;
        Integer c=3,
                d=4;
        swap1(a,b);
        swap2(c,d);
        System.out.println("a= " + a + " b= " + b);
        System.out.println("c= " + c + " d= " + d);
        /*b) El resultado esperado coincide con el ejercicio,
        ya que los parámetros pasan por valor y tanto
        los valores primitivos como los objetos pierden
        referencia al finalizar el método.*/
    }

}

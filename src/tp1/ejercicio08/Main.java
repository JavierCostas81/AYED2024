package tp1.ejercicio08;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //CircularQueue<Integer> cola = new CircularQueue<>();
        DoubleEndedQueue<Integer> cola = new DoubleEndedQueue<>();
        Integer n;
        cola.enqueue(1);
        cola.enqueue(5);
        cola.enqueue(3);
        cola.enqueue(5);
        System.out.println(cola.toString());
        //cola.shift();
        //System.out.println(cola.shift());
        System.out.println(cola.toString());
        cola.enqueueFirst(22);
        System.out.println(cola.toString());

    }
}

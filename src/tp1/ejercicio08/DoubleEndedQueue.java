package tp1.ejercicio08;

public class DoubleEndedQueue<E> extends Queue{

    public void enqueueFirst(E dato) throws IllegalAccessException {
        this.enqueue(dato);
        int size = this.size() - 1;
        for (int i = 0; i < size; i++) {
            this.enqueue(this.dequeue());
        }


    }
}

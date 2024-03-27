package tp1.ejercicio8;
//Ejercicio 8a
import java.util.ArrayList;
import java.util.List;


public class Queue<E> extends Sequence{
    private List<E> data;

    public Queue () {
        this.data = new ArrayList<>();
    }
    public void enqueue(E dato) {
        this.data.add(dato);
    }

    public E dequeue() throws IllegalAccessException {
        if (this.isEmpty()) {
            throw new IllegalAccessException("La cola está vacía");
        }
        else return this.data.remove(0);
    }

    public E head() throws IllegalAccessException {
        if (this.isEmpty()) {
            throw new IllegalAccessException("La cola está vacía");
        }
        else return this.data.get(0);
    }
    @Override
    public int size() {
        return this.data.size();
    }



    @Override
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + data +
                '}';
    }
}

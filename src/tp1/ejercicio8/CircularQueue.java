package tp1.ejercicio8;
//Ejercicio 8b
public class CircularQueue<E> extends Queue{
    public E shift() throws IllegalAccessException {
        E aux = (E) this.dequeue();
        this.enqueue(aux);
        return aux;
    }
}

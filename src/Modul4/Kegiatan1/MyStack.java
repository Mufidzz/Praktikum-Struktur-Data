package Modul4.Kegiatan1;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    private ArrayList<E> elements = new ArrayList<>();

    public E push(E item) {
        this.elements.add(item);
        return item;
    }

    public E peek() {
        int len = this.size();
        if (len == 0) {
            throw new EmptyStackException();
        } else {
            return this.elements.get(len - 1);
        }
    }

    public E pop() {
        int len = this.size();
        E obj = this.peek();
        this.elements.remove(len - 1);
        return obj;
    }

    public int size(){
        return elements.size();
    }

}

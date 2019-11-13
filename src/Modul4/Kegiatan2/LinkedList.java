package Modul4.Kegiatan2;

public class LinkedList<E> {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    public void insert(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    public E get(int index) {
        return node(index).item;
    }

    void linkBefore(E e, Node<E> succ) {
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
        size++;
    }

    public void add(int index, E element) {
        if (index == size)
            insert(element);
        else
            linkBefore(element, node(index));
    }

    public int size() {
        return this.size;
    }

    public E set(int index, E element) {
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }
    public void display() {
        System.out.print("[ ");
        for(int i = 0; i < this.size; i++){
            System.out.print(get(i) + " ");
        }
        System.out.println("]");
    }

    public E remove(int index) {
        return this.unlink(this.node(index));
    }

    E unlink(LinkedList.Node<E> x) {
        E element = x.item;
        LinkedList.Node<E> next = x.next;
        LinkedList.Node<E> prev = x.prev;
        if (prev == null) {
            this.first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        --this.size;
        return element;
    }

}
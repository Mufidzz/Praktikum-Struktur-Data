package Modul4.Kegiatan2;

public class MyQueue<E> extends LinkedList{

    public synchronized E enqueque(E item){
        this.insert(item);
        return item;
    }

    public synchronized E dequeque(){
        int len = this.size();
        E obj = this.peek();
        this.remove(0);
        return obj;
    }

    public synchronized E peek(){
        int len = this.size();
        if (len == 0) {
            throw new NullPointerException();
        } else {
            return (E) this.get(0);
        }
    }

    public boolean isEmpty(){
        return this.size <= 0;
    }

}

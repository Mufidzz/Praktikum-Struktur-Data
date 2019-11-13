package Modul2.Kegiatan2;

public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.insert(50);
        list.insert(30);
        list.display();

        RadixSort<Integer> sorted = new RadixSort<Integer>(list);
        sorted.display();

    }
}

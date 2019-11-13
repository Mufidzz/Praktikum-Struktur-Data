package Modul1.Kegiatan1;

import java.util.ArrayList;

public class GenericArray {
    ArrayList<Generic> list = new ArrayList<>();

    public void insertItem(Generic g){
        this.list.add(g);
    }

    public int getTotalItem(){
        return this.list.size();
    }

    public void printList(){
        for(Generic myList : this.list){
            System.out.println(myList.toString());
        }
    }
}

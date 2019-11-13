package Modul1.Kegiatan1;

public class Generic<K,V> {
    private K key;
    private V value;

    public Generic(K key, V value){
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "Key : " + this.key +" -> "+ "Value : " + this.value;
    }
}
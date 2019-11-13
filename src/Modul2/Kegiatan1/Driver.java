package Modul2.Kegiatan1;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<String>();
        namaMahasiswa.add("Lala");
        namaMahasiswa.add("Shani");
        namaMahasiswa.add("Gracia");
        namaMahasiswa.add("Kyla");
        namaMahasiswa.add("Gio");
        System.out.println(namaMahasiswa);

        namaMahasiswa.add(0,"Jamal");
        namaMahasiswa.add(3,"Ageng");
        System.out.println(namaMahasiswa);

        namaMahasiswa.remove(2);
        namaMahasiswa.remove(4);
        System.out.println(namaMahasiswa);

        System.out.println("Lala ada di index : " + namaMahasiswa.indexOf("Lala"));
        System.out.println("Gracia ada di index : " + namaMahasiswa.indexOf("Gracia"));
    }
}

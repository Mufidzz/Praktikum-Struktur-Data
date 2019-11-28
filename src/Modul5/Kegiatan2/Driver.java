package Modul5.Kegiatan2;


import java.util.*;

public class Driver {
    public static void main(String[] args) {

        Fibonacci ob = new Fibonacci();
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan String :");
        String a = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(a.split(" ")));
        Collections.sort(arr);

        System.out.println("Masukkan Nilai yang akan Dicari : ");
        String tmp = sc.next();
        int result = ob.search(arr, tmp, arr.size());
        if (result == -1)
            System.out.println("Nilai Tidak Ditemukan");
        else
            System.out.println("Nilai " +tmp+  " Ditemukan pada Index : " + result);
    }
}

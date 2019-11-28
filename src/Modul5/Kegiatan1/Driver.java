package Modul5.Kegiatan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Binary ob = new Binary();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        arr.add("1.2");
        arr.add("1");
        arr.add("23");
        arr.add("2.2");
        arr.add("9.2");
        arr.add("3.2");
        Collections.sort(arr);

        System.out.println("Masukkan Nilai yang akan Dicari : ");
        String tmp = sc.next();
        int result = ob.search(arr, 0, arr.size() - 1, tmp);
        if (result == -1)
            System.out.println("Angka Tidak Ditemukan");
        else
            System.out.println("Angka " +tmp+  " Ditemukan pada Index : " + result);
    }
}

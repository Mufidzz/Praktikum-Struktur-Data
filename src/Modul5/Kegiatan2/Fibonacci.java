package Modul5.Kegiatan2;

import java.util.ArrayList;

public class Fibonacci {
    public static int min(int x, int y) {
        return (x <= y) ? x : y;
    }

    public static int stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = str1.charAt(i);
            int str2_ch = str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        else {
            return 0;
        }
    }


    public static int search(ArrayList<String> arr, String x, int n) {
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm2 + fibMMm1;

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = min(offset + fibMMm2, n - 1);
            if (stringCompare(arr.get(i),x) < 0) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (stringCompare(arr.get(i),x) > 0) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else return i;
        }
        if (fibMMm1 == 1 && arr.get(offset + 1).equals(x))
            return offset + 1;
        return -1;
    }
}

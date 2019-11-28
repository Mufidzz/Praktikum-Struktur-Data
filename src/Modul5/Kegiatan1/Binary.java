package Modul5.Kegiatan1;
import java.util.ArrayList;

public class Binary {

    public static int stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

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

    int search(ArrayList<String> arr, int l, int r, String x){
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid).equals(x))
                return mid;
            if (stringCompare(arr.get(mid),x) > 0)
                return search(arr, l, mid - 1, x);
            return search(arr, mid + 1, r, x);
        }
        return -1;
    }
}

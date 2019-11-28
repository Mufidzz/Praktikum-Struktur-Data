package Modul4.Kegiatan1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        a = sc.nextLine();

        MyStack<Character> s = new MyStack<>();

        for (int i = 0 ; i < a.length() ; i++){
            s.push(a.charAt(i));
        }

        int num = s.size();

        for (int i = 0 ; i < num ; i++){
            System.out.print(s.pop());
        }
    }
}

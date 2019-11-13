package Modul4.Kegiatan1;

import java.util.Stack;

public class Driver {
    public static void main(String[] args) {
        MyStack<Character> s = new MyStack<>();
        s.push('k');
        s.push('e');
        s.push('e');
        s.push('p');

        int num = s.size();

        for (int i = 0 ; i < num ; i++){
            System.out.print(s.pop());
        }
    }
}

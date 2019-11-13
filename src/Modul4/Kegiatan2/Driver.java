package Modul4.Kegiatan2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int maxQueue = 2;
        int maxThread;
        MyQueue<Threading> queue = new MyQueue<>();
        ArrayList<Threading> TM = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        maxThread = sc.nextInt();

        for (int i = 0; i < maxThread; i++) {
            TM.add(new Threading(sc.next(), sc.nextInt(), sc.nextInt()));
            queue.enqueque(TM.get(i));
        }

        Thread T[] = new Thread[maxThread];
        for (int i = 0; i < maxQueue; i++) {
            T[i] = new Thread(queue.peek());
            T[i].start();
            queue.dequeque();
        }

        while (!queue.isEmpty()){
            for (int i = 0; i < maxQueue; i++) {
                if(!queue.isEmpty() && !T[i].isAlive()) {
                    T[i] = new Thread(queue.peek());
                    T[i].start();
                    queue.dequeque();
                }
            }

        }
    }


}

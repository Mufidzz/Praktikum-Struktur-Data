package Modul4.Kegiatan2;

public class Threading implements Runnable{
    int number;
    int maxLoop;
    int delay;
    String threadName;

    public Threading(String nama, int threadCount, int threadWidth){
        number = 0;
        threadName = nama;
        maxLoop = threadCount;
        delay = threadWidth;
    }

    public void run(){
        try {
            do {
                Thread.sleep(delay);
                System.out.println("Request From : "+threadName+", is Running for Task Number : "+number);
                number++;
            } while (number<maxLoop);
            System.out.println("Thread "+threadName+" Has Stopped.");
        } catch (InterruptedException e){
            System.out.println("error!");
        }
    }
}

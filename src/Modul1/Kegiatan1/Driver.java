package Modul1.Kegiatan1;

public class Driver {

    public static void main(String[] args) {
        GenericArray genericArray = new GenericArray();
        Generic<Integer, String> car_one = new Generic<>(2010, "Ertiga");
        Generic<Integer, String> car_two = new Generic<>(2016, "Xpander");
        Generic<Integer, String> car_three = new Generic<>(2019, "Mobilio");

        genericArray.insertItem(car_one);
        genericArray.insertItem(car_two);
        genericArray.insertItem(car_three);

        System.out.println();

        System.out.println(genericArray.getTotalItem());
        genericArray.printList();
    }
}

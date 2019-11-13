package Modul1.Kegiatan2;

public class Kubus<T extends Number> {
    private T panjang;
    private T lebar;
    private T tinggi;

    public void Kubus(T panjang, T lebar, T tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public String toString() {
        return "Panjang : " + this.panjang + " -> Lebar : " + this.lebar + " -> Tinggi : " + this.lebar;
    }

    public Long getResultAsLong() {
        return (long) this.panjang * (long) this.lebar * (long) this.tinggi;
    }

    public int getResultAsInt() {
        return (int) this.panjang * (int) this.lebar * (int) this.tinggi;
    }

    public double getResultAsDouble() {
        return (double) this.panjang * (double) this.lebar * (double) this.tinggi;
    }
}

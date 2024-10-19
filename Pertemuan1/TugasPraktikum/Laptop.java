package Pertemuan1.TugasPraktikum;

public class Laptop {
    private String merek;
    private int harga;

    public void setMerek(String merk) {
        merek = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void powerOn() {
        System.out.println("Laptop " + merek + " dinyalakan.");
    }

    public void powerOff() {
        System.out.println("Laptop " + merek + " dimatikan.");
    }

    public void cetakInformasi() {
        System.out.println("Merk laptop: " + merek);
        System.out.println("Harga      : Rp " + harga);
    }
}
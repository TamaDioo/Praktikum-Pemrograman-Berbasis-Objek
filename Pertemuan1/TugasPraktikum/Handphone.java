package Pertemuan1.TugasPraktikum;

public class Handphone {
    String merk;
    double ukuranLayar;
    int harga;

    public Handphone(String mr, double ukuran, int prc) {
        merk = mr;
        ukuranLayar = ukuran;
        harga = prc;
    }

    public void cetakInformasi() {
        System.out.println("Merk handphone: " + merk);
        System.out.println("Ukuran layar: " + ukuranLayar + " inchi");
        System.out.println("Harga: Rp " + harga);
    }

    public void powerOn() {
        System.out.println("Handphone " + merk + " dinyalakan.");
    }

    public void powerOff() {
        System.out.println("Handphone " + merk + " dimatikan.");
    }

    public void mengirimPesan(String pesan, String penerima, int pulsa) {
        if (pulsa > 0) {
            System.out.printf("Pesan \"%s\" berhasil dikirim ke %s.\n", pesan, penerima);
        } else {
            System.out.printf("Pengiriman pesan ke %s gagal!", penerima);
        }
    }
}
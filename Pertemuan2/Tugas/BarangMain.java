package Tugas;

public class BarangMain {
    public static void main(String[] args) {
        Barang br1 = new Barang();
        br1.kode = "B001";
        br1.namaBarang = "Pulpen";
        br1.hargaDasar = 3000;
        br1.diskon = 30f;
        br1.tampilData();
    }
}
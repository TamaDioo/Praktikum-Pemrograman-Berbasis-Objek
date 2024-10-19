package Tugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public double hitungHargaJual() {
        return hargaDasar - ((diskon / 100) * hargaDasar);
    }

    public void tampilData() {
        System.out.printf("╔═════════════════════════════════════╗%n");
        System.out.printf("║           DATA BARANG               ║%n");
        System.out.printf("╠═════════════════════════════════════╣%n");
        System.out.printf("║ Kode Barang       : %-15s ║%n", kode);
        System.out.printf("║ Nama Barang       : %-15s ║%n", namaBarang);
        System.out.printf("║ Harga Dasar       : Rp %-12s ║%n", hargaDasar);
        System.out.printf("║ Diskon            : %-4s %% %8s ║%n", diskon, " ");
        System.out.printf("║ Harga Jual        : Rp %-12s ║%n", this.hitungHargaJual());
        System.out.printf("╚═════════════════════════════════════╝%n");
    }
}
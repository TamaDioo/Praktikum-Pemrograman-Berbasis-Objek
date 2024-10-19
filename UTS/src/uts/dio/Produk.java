package uts.dio;

public class Produk {
    private String id;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getIdProduk() {
        return id;
    }

    public void setIdProduk(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tampilDataProduk() {
        System.out.printf("ID Produk         : %-15s %n", id);
        System.out.printf("Nama              : %-15s %n", nama);
        System.out.printf("Harga             : Rp %-12s %n", harga);
        System.out.printf("Stok              : %-15s %n", stok);
    }
}

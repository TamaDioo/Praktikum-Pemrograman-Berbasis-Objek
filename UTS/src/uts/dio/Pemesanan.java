package uts.dio;

import java.util.ArrayList;
import java.util.List;

public class Pemesanan {
    private String idPesanan;
    private Pelanggan pelanggan;
    private List<PemesananBarang> pemesananBarang;

    public String getIdPesanan() {
        return idPesanan;
    }

    public Pemesanan(String idPesanan, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.pemesananBarang = new ArrayList<>();
    }

    public void tambahProduk(Produk produk, int qty) {
        PemesananBarang item = new PemesananBarang(produk, qty);
        this.pemesananBarang.add(item);
    }

    public void tampilPesanan() {
        System.out.println("ID Pemesanan: " + idPesanan);
        System.out.println();
        pelanggan.tampilDataPelanggan();
        for (PemesananBarang item : pemesananBarang) {
            item.tampilPemesananBrg();
        }
        System.out.println("Total Harga yang harus dibayar: Rp" + hitungTotal());
    }

    private double hitungTotal() {
        double total = 0;
        for (PemesananBarang item : pemesananBarang) {
            total += item.getTotalBarang();
        }
        return total;
    }
}

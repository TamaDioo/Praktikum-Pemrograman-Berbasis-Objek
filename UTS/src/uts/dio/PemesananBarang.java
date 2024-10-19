package uts.dio;

public class PemesananBarang {
    private Produk produk;
    private int qty;

    public PemesananBarang(Produk produk, int qty) {
        this.produk = produk;
        if (qty > produk.getStok()) {
            System.out.println("Maaf, jumlah produk melebihi stok!");
        } else {
            this.qty = qty;
            produk.setStok(produk.getStok() - qty);
        }
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotalBarang() {
        return produk.getHarga() * qty;
    }

    public void tampilPemesananBrg() {
        produk.tampilDataProduk();
        System.out.printf("Jumlah yang dibeli: %-15s %n", qty);
        System.out.printf("Total Harga       : Rp %-12s %n", getTotalBarang());
        System.out.println();
    }
}

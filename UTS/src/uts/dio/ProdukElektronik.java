package uts.dio;

public class ProdukElektronik extends Produk {
    private int masaGaransi; 

    public ProdukElektronik(String idProduk, String nama, double harga, int stok, int masaGaransi) {
        super(idProduk, nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }

    public int getMasaGaransi() {
        return masaGaransi;
    }

    public void setMasaGaransi(int masaGaransi) {
        this.masaGaransi = masaGaransi;
    }

    public void tampilDataProduk() {
        super.tampilDataProduk();
        System.out.printf("Masa Garansi      : %-15s %n", masaGaransi);
    }
}

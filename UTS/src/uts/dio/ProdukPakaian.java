package uts.dio;

public class ProdukPakaian extends Produk {
    private String ukuran;
    private String bahan;

    public ProdukPakaian(String idProduk, String nama, double harga, int stok, String ukuran, String bahan) {
        super(idProduk, nama, harga, stok);
        this.ukuran = ukuran;
        this.bahan = bahan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void tampilDataProduk() {
        super.tampilDataProduk();
        System.out.printf("Ukuran            : %-15s %n", ukuran);
        System.out.printf("Bahan             : %-15s %n", bahan);
    }
}

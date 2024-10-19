package pertemuan6.latihan1;

public class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float luas() {
        return panjang * lebar;
    }

    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
    
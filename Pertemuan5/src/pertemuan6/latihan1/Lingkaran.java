package pertemuan6.latihan1;

public class Lingkaran extends BangunDatar {
    public float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return (float) (Math.PI * r * r);
    }

    public float keliling() {
        return (float) (2 * Math.PI * r);
    } 
}

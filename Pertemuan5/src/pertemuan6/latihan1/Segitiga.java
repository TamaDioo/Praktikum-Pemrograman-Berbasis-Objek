package pertemuan6.latihan1;

public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (alas * tinggi) / 2;
    }

    public float keliling() {
        // Asumsi segitiga sama sisi 
        return 3 * alas;
    }
}

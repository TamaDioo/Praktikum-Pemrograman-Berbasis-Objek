package Pertemuan1.TugasPraktikum;

public class Kamera {
    private String merek;
    private int resolusi;

    public Kamera(String merek, int mp) {
        this.merek = merek;
        this.resolusi = mp;
    }

    public void cetakInformasi() {
        System.out.println("Merek Kamera: " + merek);
        System.out.println("Resolusi: " + resolusi + " MP");
    }

    public void ambilFoto() {
        System.out.println("Foto diambil dengan kamera " + merek + " beresolusi " + resolusi + " MP.");
    }

    public void rekamVideo() {
        System.out.println("Merekam video dengan kamera " + merek + " beresolusi " + resolusi + " MP.");
    }
}
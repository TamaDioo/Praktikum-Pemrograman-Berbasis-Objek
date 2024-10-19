package Tugas;

public class LingkaranMain {
    public static void main(String[] args) {
        Lingkaran lk1 = new Lingkaran();
        lk1.phi = 3.14;
        lk1.r = 9;
        System.out.println("Jari-jari lingkaran: " + lk1.r);
        System.out.printf("Luas lingkaran     : %.2f%n", lk1.hitungLuas());
        System.out.printf("Keliling lingkaran : %.2f%n", lk1.hitungKeliling());
    }
}
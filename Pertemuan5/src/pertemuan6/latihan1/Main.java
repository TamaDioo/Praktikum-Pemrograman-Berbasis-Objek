package pertemuan6.latihan1;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(9, 6);
        Lingkaran lingkaran = new Lingkaran(7);
        Segitiga segitiga = new Segitiga(4, 3);

        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());
        System.out.println();

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println();

        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}

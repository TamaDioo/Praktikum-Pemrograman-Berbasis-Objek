package dio.relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Penulis penulis1 = new Penulis("Pramoedya Ananta Toer", "Indonesia");
        Penulis penulis2 = new Penulis("Andrea Hirata", "Indonesia");

        Penerbit penerbit1 = new Penerbit("Lentera Hati", "Jl. Kalibata Tengah No. 37, Jakarta Selatan");
        Penerbit penerbit2 = new Penerbit("Bentang Pustaka", "Jl. Plemburan, Blok B/9, Sleman, Yogyakarta");

        Buku buku1 = new Buku("Bumi Manusia", penulis1, penerbit1);
        Buku buku2 = new Buku("Laskar Pelangi", penulis2, penerbit2);

        Perpustakaan perpustakaan = new Perpustakaan("Polinema", 2);

        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}

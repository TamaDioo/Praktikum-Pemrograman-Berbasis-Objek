package tugas.overriding;

public class Main {
    public static void main(String[] args) {
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        dosen.bernafas();
        dosen.makan(); // Memanggil metode makan() milik Dosen

        mahasiswa.bernafas();
        mahasiswa.makan(); // Memanggil metode makan() milik Mahasiswa

        // Jika ingin memanggil metode khusus dari kelas turunan, perlu dilakukan casting
        if (dosen instanceof Dosen) {
            ((Dosen) dosen).lembur();
        }

        if (mahasiswa instanceof Mahasiswa) {
            ((Mahasiswa) mahasiswa).tidur();
        }
    }
}

package Tugas;

import java.time.LocalDateTime;

public class PeminjamanMain {
    public static void main(String[] args) {
        LocalDateTime tanggalPinjam = LocalDateTime.of(2024, 8, 25, 10, 30, 10);
        LocalDateTime tanggalKembali = LocalDateTime.of(2024, 8, 30, 10, 30, 20);

        Peminjaman peminjaman = new Peminjaman(1, "Andi", "FIFA 23", 50000, tanggalPinjam, tanggalKembali);

        peminjaman.tampilData();
    }
}
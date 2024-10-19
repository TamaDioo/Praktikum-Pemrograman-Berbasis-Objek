package Tugas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Peminjaman {
    private int id;
    private String namaMember;
    private String namaGame;
    private double harga;
    private LocalDateTime tanggalPinjam;
    private LocalDateTime tanggalKembali;

    public Peminjaman(int id, String namaMember, String namaGame, double harga, LocalDateTime tanggalPinjam,
            LocalDateTime tanggalKembali) {
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.harga = harga;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public long hitungLamaSewa() {
        return Duration.between(tanggalPinjam, tanggalKembali).toDays();
    }

    public double hitungTotalHarga() {
        return hitungLamaSewa() * harga;
    }

    public void tampilData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.printf("╔═══════════════════════════════════════════╗%n");
        System.out.printf("║         DATA PERSEWAAN GAME               ║%n");
        System.out.printf("╠═══════════════════════════════════════════╣%n");
        System.out.printf("║ ID Peminjaman    : %-22s ║%n", id);
        System.out.printf("║ Nama Member      : %-22s ║%n", namaMember);
        System.out.printf("║ Nama Game        : %-22s ║%n", namaGame);
        System.out.printf("║ Harga per Hari   : Rp %-20s║%n", harga);
        System.out.printf("║ Tanggal Pinjam   : %-22s ║%n", tanggalPinjam.format(formatter));
        System.out.printf("║ Tanggal Kembali  : %-22s ║%n", tanggalKembali.format(formatter));
        System.out.printf("║ Lama Sewa        : %-2s hari %14s ║%n", hitungLamaSewa(), "");
        System.out.printf("║ Total Harga      : Rp %-19s ║%n", hitungTotalHarga());
        System.out.printf("╚═══════════════════════════════════════════╝%n");
    }
}
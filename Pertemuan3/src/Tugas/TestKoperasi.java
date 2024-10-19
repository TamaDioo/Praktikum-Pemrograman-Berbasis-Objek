package Tugas;
import java.util.Scanner;

public class TestKoperasi {
  public static void main(String[] args) {
    Anggota donny = new Anggota("111333444", "Donny", 5000000);

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Nama Anggota: " + donny.getNama());
    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

    System.out.print("\nMasukkan jumlah pinjaman: ");
    double jumlahPinjaman = sc.nextDouble();
    donny.pinjam(jumlahPinjaman);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    System.out.print("\nMasukkan jumlah pinjaman: ");
    double jumlahPinjaman2 = sc.nextDouble();
    donny.pinjam(jumlahPinjaman2);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    System.out.print("\nMasukkan jumlah angsuran yang ingin dibayar: ");
    double jumlahAngsuran = sc.nextDouble();
    donny.angsur(jumlahAngsuran);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    System.out.print("\nMasukkan jumlah angsuran yang ingin dibayar: ");
    double jumlahAngsuran1 = sc.nextDouble();
    donny.angsur(jumlahAngsuran1);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    System.out.print("\nMasukkan jumlah angsuran yang ingin dibayar: ");
    double jumlahAngsuran2 = sc.nextDouble();
    donny.angsur(jumlahAngsuran2);
    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
  }
}

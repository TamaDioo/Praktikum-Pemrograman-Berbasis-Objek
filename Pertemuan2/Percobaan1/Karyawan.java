package Percobaan1;

public class Karyawan {
    public String id;
    public String nama;
    public String jenisKelamin;
    public String jabatan;
    public int gaji;

    public Karyawan(String id, String nama, String jnsKlmn, String jbt, int gaji) {
        this.id = id;
        this.nama = nama;
        jenisKelamin = jnsKlmn;
        jabatan = jbt;
        this.gaji = gaji;
    }

    public void tampilData() {
        System.out.printf("╔════════════════════════════════════════╗%n");
        System.out.printf("║           DATA KARYAWAN                ║%n");
        System.out.printf("╠════════════════════════════════════════╣%n");
        System.out.printf("║ Nama            : %-20s ║%n", nama);
        System.out.printf("║ ID              : %-20s ║%n", id);
        System.out.printf("║ Jenis Kelamin   : %-20s ║%n", jenisKelamin);
        System.out.printf("║ Jabatan         : %-20s ║%n", jabatan);
        System.out.printf("╚════════════════════════════════════════╝%n");
    }

    public void lihatGaji() {
        System.out.printf("╔════════════════════════════════════════╗%n");
        System.out.printf("║           GAJI KARYAWAN                ║%n");
        System.out.printf("╠════════════════════════════════════════╣%n");
        System.out.printf("║ Nama            : %-20s ║%n", nama);
        System.out.printf("║ ID              : %-20s ║%n", id);
        System.out.printf("║ Gaji            : Rp %-17s ║%n", gaji);
        System.out.printf("╚════════════════════════════════════════╝%n");
    }
}
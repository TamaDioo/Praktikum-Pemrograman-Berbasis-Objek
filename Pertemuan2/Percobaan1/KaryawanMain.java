package Percobaan1;

public class KaryawanMain {
    public static void main(String[] args) {
        Karyawan kry1 = new Karyawan("A1009", "Budi Nugroho", "Pria", "Staff Gudang", 3400000);
        kry1.tampilData();
        System.out.println();
        kry1.lihatGaji();
    }
}
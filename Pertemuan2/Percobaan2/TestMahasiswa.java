package Percobaan2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Dio Andika";
        mhs2.alamat = "Jl. Raya Kidal No 129";
        mhs2.kelas = "2D";
        mhs2.tampilBiodata();
        System.out.println();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Wulan Eka Putri";
        mhs3.alamat = "Jl. Pegangsaan No 2P";
        mhs3.kelas = "1F";
        mhs3.tampilBiodata();
    }
}
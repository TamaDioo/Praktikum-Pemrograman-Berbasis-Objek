package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(2);

        Dosen dosen1 = new Dosen("001", "Dr. Andrean", "Jl. Pisang Kipas, Malang");
        dosen1.setSKS(14); 
        daftarGaji.addPegawai(dosen1);

        Pegawai pegawai1 = new Pegawai("002", "Prasetyo", "Jl. Kembang Turi, Malang");
        daftarGaji.addPegawai(pegawai1);
        
        daftarGaji.printSemuaGaji();
    }
}

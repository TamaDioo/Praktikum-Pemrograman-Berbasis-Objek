package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;

    public DaftarGaji(int jml) {
        listPegawai =  new Pegawai[jml];
    }

    public void addPegawai(Pegawai pgw) {
        boolean penuh = true;
        for (int j = 0; j < listPegawai.length; j++) {
            if (listPegawai[j] == null) {
                listPegawai[j] = pgw;
                penuh = false;
                break;
            } 
        }
        
        if (penuh) { 
        System.out.println("Daftar gaji sudah penuh, "
                + "tidak bisa menambah pegawai lagi!");
        }
    }

    public void printSemuaGaji() {
        for (Pegawai listPegawai1 : listPegawai) {
            System.out.println("Nama: " + listPegawai1.getNama());
            System.out.println("Gaji: Rp" + listPegawai1.getGaji());
            System.out.println();
        }
    }
}

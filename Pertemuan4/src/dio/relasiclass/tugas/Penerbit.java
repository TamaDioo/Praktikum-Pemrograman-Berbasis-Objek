package dio.relasiclass.tugas;

public class Penerbit {
    private String nama;
    private String alamat;

    public Penerbit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setNama(String nama) {
      this.nama = nama;
    }

    public void setAlamat(String alamat) {
      this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void infoPenerbit() {
        System.out.println("Penerbit: " + nama + "\nAlamat Penerbit: " + alamat);
    }
}

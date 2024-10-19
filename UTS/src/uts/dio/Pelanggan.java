package uts.dio;

public class Pelanggan {
    private String id;
    private String nama;
    private String email;
    private String alamat;

    public Pelanggan(String id, String nama, String email, String alamat) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
    }

    public String getIdPelanggan() {
        return id;
    }

    public void setIdPelanggan(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tampilDataPelanggan() {
        System.out.printf("ID Pelanggan      : %-15s %n", id);
        System.out.printf("Nama              : %-15s %n", nama);
        System.out.printf("Email             : %-15s %n", email);
        System.out.printf("Alamat            : %-15s %n", alamat);
        System.out.println();
    }
}

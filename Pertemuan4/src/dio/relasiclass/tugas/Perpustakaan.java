package dio.relasiclass.tugas;

public class Perpustakaan {
    private String nama;
    private Buku[] buku;
    private int jumlahBuku;

    public Perpustakaan(String nama, int kapasitas) {
        this.nama = nama;
        this.buku = new Buku[kapasitas]; 
        this.jumlahBuku = 0;
    }

    public void setNama(String nama) {
      this.nama = nama;
    }

    public void setBuku(Buku[] buku) {
      this.buku = buku;
    }

    public void setJumlahBuku(int jumlahBuku) {
      this.jumlahBuku = jumlahBuku;
    }

    public String getNama() {
      return nama;
    }

    public Buku[] getBuku() {
      return buku;
    }

    public int getJumlahBuku() {
      return jumlahBuku;
    }

    public void tambahBuku(Buku newBuku) {
        if (jumlahBuku < buku.length) {
            buku[jumlahBuku] = newBuku;
            jumlahBuku++;
        } else {
            System.out.println("Kapasitas perpustakaan sudah penuh, tidak dapat menambah buku lagi.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("Daftar buku pada perpustakaan " + nama +  ":\n");
        for (int i = 0; i < jumlahBuku; i++) {
            buku[i].infoBuku();
            System.out.println();
        }
    }
}

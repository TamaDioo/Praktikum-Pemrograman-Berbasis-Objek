package dio.relasiclass.tugas;

public class Buku {
    private String judul;
    private Penulis penulis;
    private Penerbit penerbit;

    public Buku(String judul, Penulis penulis, Penerbit penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    public void setJudul(String judul) {
      this.judul = judul;
    }

    public void setPenerbit(Penerbit penerbit) {
      this.penerbit = penerbit;
    }

    public void setPenulis(Penulis penulis) {
      this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public Penerbit getPenerbit() {
      return penerbit;
    }

    public Penulis getPenulis() {
      return penulis;
    }

    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        penulis.infoPenulis();
        penerbit.infoPenerbit();
    }
}

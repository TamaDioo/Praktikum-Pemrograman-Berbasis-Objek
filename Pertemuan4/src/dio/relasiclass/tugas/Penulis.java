package dio.relasiclass.tugas;

public class Penulis {
    private String nama;
    private String negara;

    public Penulis(String nama, String negara) {
        this.nama = nama;
        this.negara = negara;
    }

    public void setNama(String nama) {
      this.nama = nama;
    }

    public void setNegara(String negara) {
      this.negara = negara;
    }

    public String getNama() {
        return nama;
    }

    public String getNegara() {
        return negara;
    }

    public void infoPenulis() {
        System.out.println("Penulis: " + nama + "\nKebangsaan: " + negara);
    }

}

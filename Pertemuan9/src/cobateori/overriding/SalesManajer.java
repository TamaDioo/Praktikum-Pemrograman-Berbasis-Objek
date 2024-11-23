package cobateori.overriding;

public class SalesManajer extends Manajer {
    protected String departemen;

    public SalesManajer(String nama, String dpt, int gaji) {
        super(nama, gaji);
        departemen = dpt;
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji: " + gaji);
    }
}

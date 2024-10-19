package Pertemuan1.TugasPraktikum;

public class LaptopGaming extends Laptop {
    private String VGA;
    private int refreshRate;

    public void setVGA(String vga) {
        VGA = vga;
    }

    public void setRefreshRate(int refRate) {
        refreshRate = refRate;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Kartu Grafis: " + VGA);
        System.out.println("Refresh Rate Layar: " + refreshRate + " Hz");
    }

    public void mainkanGame(String game) {
        System.out.println("Sedang memainkan game " + game + ".");
    }
}
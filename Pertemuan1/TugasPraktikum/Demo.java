package Pertemuan1.TugasPraktikum;

public class Demo {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop();
        LaptopGaming lp2 = new LaptopGaming();
        LaptopWorkstation lp3 = new LaptopWorkstation();
        Handphone hp = new Handphone("Iphone 15 Pro Max", 6.7, 24999000);
        Kamera cam = new Kamera("Nikon D3500", 24);

        lp1.setMerek("Asus Vivobook Go 14");
        lp1.setHarga(6499000);
        lp1.cetakInformasi();
        lp1.powerOn();
        lp1.powerOff();
        System.out.println();

        lp2.setMerek("Lenovo Legion 5 Pro");
        lp2.setHarga(29999000);
        lp2.setVGA("Nvidia RTX 4070");
        lp2.setRefreshRate(165);
        lp2.cetakInformasi();
        lp2.powerOn();
        lp2.mainkanGame("Black Myth Wukong");
        lp2.powerOff();
        System.out.println();

        lp3.setMerek("HP ZBook Studio");
        lp3.setHarga(54999000);
        lp3.setCpuCores(14);
        lp3.setRamSize(32);
        lp3.cetakInformasi();
        lp3.powerOn();
        lp3.renderVideo();
        lp3.powerOff();
        System.out.println();

        hp.cetakInformasi();
        hp.powerOn();
        hp.mengirimPesan("Halo, Apa kabar?", "Adi", 12000);
        hp.powerOff();
        System.out.println();

        cam.cetakInformasi();
        cam.ambilFoto();
        cam.rekamVideo();
        System.out.println();
    }
}
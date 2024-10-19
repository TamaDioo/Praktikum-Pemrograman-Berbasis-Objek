package Pertemuan1.TugasPraktikum;

public class LaptopWorkstation extends Laptop {
    private int cpuCores;
    private int ramSize;

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jumlah Core Prosesor: " + cpuCores);
        System.out.println("Kapasitas RAM: " + ramSize + " GB");
    }

    public void renderVideo() {
        System.out.println("Rendering video dengan RAM berkapasitas " + ramSize + " GB dan jumlah core processor "
                + cpuCores + ".");
    }
}
package BangunRuang;

public class TampilPersegi {
    public static void main(String[] args) {
        Persegi psg = new Persegi(10);
        psg.dataPersegi();
        System.out.println("Luas persegi: " + psg.luasPersegi());
        System.out.println("Keliling persegi: " + psg.kelilingPersegi());
        System.out.println();

        Persegi psg1 = new Persegi(6);
        psg1.dataPersegi();
        System.out.println("Luas persegi: " + psg1.luasPersegi());
        System.out.println("Keliling persegi: " + psg1.kelilingPersegi());
    }
}
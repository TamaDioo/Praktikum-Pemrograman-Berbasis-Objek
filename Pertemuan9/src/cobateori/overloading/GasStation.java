package cobateori.overloading;

public class GasStation {
    public void isiBahanBakar(MobilMewah mw, int bayar) {
        int liter = bayar / 10000;
        System.out.println("Mobil mewah telah diisi dengan Pertamax sebanyak "
        + liter + " liter");
    }

    public void isiBahanBakar(MobilKuno mk, int bayar) {
        int liter = bayar / 5000;
        System.out.println("Mobil kuno telah diisi dengan Pertalite sebanyak " 
        + liter + " liter");
    }
}

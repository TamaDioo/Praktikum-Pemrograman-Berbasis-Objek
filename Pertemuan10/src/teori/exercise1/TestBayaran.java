package teori.exercise1;

public class TestBayaran {
    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
    
        System.out.println("Bayaran untuk Manajer: "+ hr.hitungBayaran(man));
        System.out.println("Bayaran untuk Programmer: "+ hr.hitungBayaran(prog));
    }
}

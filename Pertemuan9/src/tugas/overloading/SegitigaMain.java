package tugas.overloading;

public class SegitigaMain {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        System.out.println("Total sudut dengan 1 sudut yang diketahui: " 
        + segitiga.totalSudut(60));
        System.out.println("Total sudut dengan 2 sudut yang diketahui: " 
        + segitiga.totalSudut(60, 50));
        
        System.out.println("Keliling segitiga dengan 3 sisi yang diketahui: " 
        + segitiga.keliling(6, 4, 5));
        System.out.println("Keliling segitiga siku-siku dengan 2 sisi yang diketahui: " 
        + segitiga.keliling(3, 4));
    }
}

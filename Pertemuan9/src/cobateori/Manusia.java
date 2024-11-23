package cobateori;

public class Manusia {
    public void setBiodata(String nama) {
        System.out.println("Method setBiodata yg pertama dipanggil");
    }
    
    public void setBiodata(String nama, int umur) {
        System.out.println("Method setBiodata yg kedua dipanggil");
    }
    
    public void setBiodata(String nama, int umur, String alamat) {
        System.out.println("Method setBiodata yg ketiga dipanggil");
    }
}

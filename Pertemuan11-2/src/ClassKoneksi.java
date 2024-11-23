import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassKoneksi {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Biodata;encrypt=true;trustServerCertificate=true;";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "admin1234";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}

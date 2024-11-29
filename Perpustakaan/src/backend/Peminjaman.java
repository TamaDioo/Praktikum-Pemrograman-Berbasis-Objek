package backend;
import java.sql.*;
import java.util.ArrayList;

public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private String tanggalPinjam;
    private String tanggalKembali;

    public int getIdpeminjaman() {
        return idpeminjaman;
    }

    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();
        String query = "SELECT * FROM peminjaman "
                     + "LEFT JOIN anggota ON peminjaman.idanggota = anggota.idanggota "
                     + "LEFT JOIN buku ON peminjaman.idbuku = buku.idbuku "
                     + "WHERE idpeminjaman = " + id;

        ResultSet rs = DBHelper.selectQuery(query);
        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList<>();
        String query = "SELECT * FROM peminjaman "
                     + "LEFT JOIN anggota ON peminjaman.idanggota = anggota.idanggota "
                     + "LEFT JOIN buku ON peminjaman.idbuku = buku.idbuku";

        ResultSet rs = DBHelper.selectQuery(query);
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public void save() {
        if (getById(idpeminjaman).getIdpeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES ("
                       + "'" + this.getAnggota().getIdanggota() + "', "
                       + "'" + this.getBuku().getIdbuku() + "', "
                       + "'" + this.tanggalPinjam + "', "
                       + "'" + this.tanggalKembali + "')";
            this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE peminjaman SET "
                       + "idanggota = '" + this.getAnggota().getIdanggota() + "', "
                       + "idbuku = '" + this.getBuku().getIdbuku() + "', "
                       + "tanggalpinjam = '" + this.tanggalPinjam + "', "
                       + "tanggalkembali = '" + this.tanggalKembali + "' "
                       + "WHERE idpeminjaman = '" + this.idpeminjaman + "'";
            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper.executeQuery(SQL);
    }
}

package uts.dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Produk> produks = new ArrayList<>();
    private static List<Pelanggan> pelanggans = new ArrayList<>();
    private static List<Pemesanan> pemesanans = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        produks.add(new ProdukElektronik("P001", "Laptop", 7899000, 9, 24));
        produks.add(new ProdukPakaian("P002", "Jaket", 240000, 5, "M", "Polyester"));
        produks.add(new Produk("P003", "Komik Sinchan", 30000, 23));
        pelanggans.add(new Pelanggan("PG001", "Dio", "tamadio91@gmail.com", "Malang"));

        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Tambah Pelanggan");
            System.out.println("6. Tampilkan Pelanggan");
            System.out.println("7. Update Data Pelanggan");
            System.out.println("8. Hapus Pelanggan");
            System.out.println("9. Buat Pesanan");
            System.out.println("10. Tampilkan Pesanan");
            System.out.println("11. Keluar");
            System.out.print("Pilih opsi: ");
            int pilih = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilih) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilProduk();
                    break;
                case 3:
                    updateProduk();
                    break;
                case 4:
                    hapusProduk();
                    break;
                case 5:
                    tambahPelanggan();
                    break;
                case 6:
                    tampilPelanggan();
                    break;
                case 7:
                    updateDataPelanggan();
                    break;
                case 8:
                    hapusPelanggan();
                    break;
                case 9:
                    buatPesanan();
                    break;
                case 10:
                    tampilPesanan();
                    break;
                case 11:
                    running = false;
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void tambahProduk() {
        System.out.println("Jenis Produk:");
        System.out.println("1. Produk Elektronik");
        System.out.println("2. Produk Pakaian");
        System.out.println("3. Produk Lainnya");
        System.out.print("Pilih jenis produk (1/2/3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Masukkan ID Produk: ");
        String id = scanner.nextLine();
    
        // Cek apakah ID produk sudah ada
        for (Produk produk : produks) {
            if (produk.getIdProduk().equals(id)) {
                System.out.println("Produk dengan ID " + id + " sudah ada. Tidak dapat menambahkan produk dengan ID yang sama.");
                return;  
            }
        }
    
        switch (choice) {
                case 1: // Produk Elektronik
                System.out.print("Masukkan Nama Produk: ");
                String name = scanner.nextLine();
                System.out.print("Masukkan Harga Produk: ");
                double price = scanner.nextDouble();
                System.out.print("Masukkan Stok Produk: ");
                int stock = scanner.nextInt();
                //Pengecekan stok (upcoming)
                System.out.print("Masukkan Masa Garansi (bulan): ");
                int garansi = scanner.nextInt();
                scanner.nextLine(); 
                produks.add(new ProdukElektronik(id, name, price, stock, garansi));
                break;
    
            case 2: // Produk Pakaian
                System.out.print("Masukkan Nama Produk: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Harga Produk: ");
                double harga = scanner.nextDouble();
                System.out.print("Masukkan Stok Produk: ");
                int stok = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Ukuran Pakaian: ");
                String ukuran = scanner.nextLine();
                System.out.print("Masukkan Bahan Pakaian: ");
                String bahan = scanner.nextLine();
                produks.add(new ProdukPakaian(id, nama, harga, stok, ukuran, bahan));
                break;
    
            case 3: // Produk Lainnya
                System.out.print("Masukkan Nama Produk: ");
                String nama2 = scanner.nextLine();
                System.out.print("Masukkan Harga Produk: ");
                double harga2 = scanner.nextDouble();
                System.out.print("Masukkan Stok Produk: ");
                int stok2 = scanner.nextInt();
                produks.add(new Produk(id, nama2, harga2, stok2));
                break;
    
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
    
        System.out.println("Produk berhasil ditambahkan.");
    }

    // Fitur Tampilkan Produk
    public static void tampilProduk() {
        System.out.println("\n=== Daftar Produk ===");
        for (Produk produk : produks) {
            produk.tampilDataProduk();
            System.out.println();
        }
    }

    // Fitur Ubah Produk
    public static void updateProduk() {
        System.out.print("Masukkan ID Produk yang akan diubah: ");
        String id = scanner.nextLine();
        for (Produk produk : produks) {
            if (produk.getIdProduk().equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                produk.setNama(scanner.nextLine());
                System.out.print("Masukkan Harga Baru: ");
                produk.setHarga(scanner.nextDouble());
                System.out.print("Masukkan Stok Baru: ");
                produk.setStok(scanner.nextInt());
                scanner.nextLine(); 
                System.out.println("Produk berhasil diubah.");
                return;
            }
        }   
        System.out.println("Produk dengan ID " + id + " tidak ditemukan.");
    }

    public static void updateDataPelanggan() {
        System.out.print("Masukkan ID Pelanggan yang akan diubah datanya: ");
        String id = scanner.nextLine();
        for (Pelanggan plg : pelanggans) {
            if (plg.getIdPelanggan().equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                plg.setNama(scanner.nextLine());
                System.out.print("Masukkan Email Baru: ");
                plg.setEmail(scanner.nextLine());
                System.out.print("Masukkan Alamat Baru: ");
                plg.setAlamat(scanner.nextLine());
                System.out.println("Data pelanggan berhasil diubah.");
                return;
            }
        }
        System.out.println("Pelanggan dengan ID " + id + " tidak ditemukan.");
    }

    // Fitur Hapus Produk
    public static void hapusProduk() {
        System.out.print("Masukkan ID Produk yang akan dihapus: ");
        String id = scanner.nextLine();
        produks.removeIf(produk -> produk.getIdProduk().equals(id));
        System.out.println("Produk berhasil dihapus.");
    }

    // Fitur Tambah Pelanggan
    public static void tambahPelanggan() {
        System.out.print("Masukkan ID Pelanggan: ");
        String id = scanner.nextLine();

        // Cek apakah ID pelanggan sudah ada
        for (Pelanggan pelanggan : pelanggans) {
            if (pelanggan.getIdPelanggan().equals(id)) {
                System.out.println("Pelanggan dengan ID " + id + " sudah ada. Tidak dapat menambahkan pelanggan dengan ID yang sama.");
                return;  // Keluar dari method jika ID sudah ada
            }
        }

        System.out.print("Masukkan Nama Pelanggan: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Email Pelanggan: ");
        String email = scanner.nextLine();
        System.out.print("Masukkan Alamat Pelanggan: ");
        String address = scanner.nextLine();

        pelanggans.add(new Pelanggan(id, name, email, address));
        System.out.println("Pelanggan berhasil ditambahkan.");
    }

    // Fitur Tampilkan Pelanggan
    public static void tampilPelanggan() {
        System.out.println("\n=== Daftar Pelanggan ===");
        for (Pelanggan pelanggan : pelanggans) {
            pelanggan.tampilDataPelanggan();
        }
    }

    public static void hapusPelanggan() {
        System.out.print("Masukkan ID Pelanggan yang akan dihapus: ");
        String id = scanner.nextLine();
        pelanggans.removeIf(plg -> plg.getIdPelanggan().equals(id));
        System.out.println("Pelanggan berhasil dihapus.");
    }

    // Fitur Buat Pesanan
    public static void buatPesanan() {
        System.out.print("Masukkan ID Pesanan: ");
        String orderId = scanner.nextLine();
        
        for (Pemesanan psn : pemesanans) {
            if (psn.getIdPesanan().equals(orderId)) {
                System.out.println("Pesanan dengan ID " + orderId + " sudah ada. Tidak dapat menambahkan pesanan dengan ID yang sama.");
                return;  
            }
        }

        System.out.print("Masukkan ID Pelanggan: ");
        String customerId = scanner.nextLine();
        Pelanggan customer = null;
        for (Pelanggan c : pelanggans) {
            if (c.getIdPelanggan().equals(customerId)) {
                customer = c;
                break;
            }
        }
        if (customer == null) {
            System.out.println("Pelanggan tidak ditemukan.");
            return;
        }

        Pemesanan order = new Pemesanan(orderId, customer);

        boolean tambahProduk = true;
        while (tambahProduk) {
            System.out.print("Masukkan ID Produk: ");
            String productId = scanner.nextLine();
            Produk produk = null;
            for (Produk p : produks) {
                if (p.getIdProduk().equals(productId)) {
                    produk = p;
                    break;
                }
            }
            if (produk == null) {
                System.out.println("Produk tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan Jumlah Produk: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); 

            order.tambahProduk(produk, quantity);

            System.out.print("Tambah produk lain? (y/n): ");
            tambahProduk = scanner.nextLine().equalsIgnoreCase("y");
        }

        pemesanans.add(order);
        System.out.println("Pesanan berhasil dibuat.");
    }

    // Fitur Tampilkan Pesanan
    public static void tampilPesanan() {
        System.out.println("\n=== Daftar Pesanan ===");
        for (Pemesanan order : pemesanans) {
            order.tampilPesanan();
        }
    }
}

package P6.Tugas;

import java.util.Scanner;

public class DosenMain27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen27 daftarDosen = new DataDosen27();
        int pilihan;

        do {
            System.out.println("=== MENU MANAJEMEN DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data Dosen");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen: ");
                    String kode = scanner.nextLine();
                    System.out.print("Masukkan Nama Dosen: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = scanner.nextLine();
                    Boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Masukkan Usia: ");
                    int usia = scanner.nextInt();
                    
                    Dosen27 dosenBaru = new Dosen27(kode, nama, jk, usia);
                    daftarDosen.tambah(dosenBaru);
                    System.out.println("Data berhasil ditambahkan!\n");
                    break;
                case 2:
                    System.out.println("\n--- DAFTAR SELURUH DOSEN ---");
                    daftarDosen.tampil();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        } while (pilihan != 3);
        
        scanner.close();
    }
}

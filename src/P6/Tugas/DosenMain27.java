package P6.Tugas;

import java.util.Scanner;

public class DosenMain27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen27 dd = new DataDosen27();
        int menu;

        do {
            System.out.println("=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Urutkan Data (ASC)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Kode Dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jenisKelaminStr = sc.nextLine();
                    boolean jk = jenisKelaminStr.equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine(); 
                    Dosen27 dsn = new Dosen27(kode, nama, jk, usia);
                    dd.tambah(dsn);
                    System.out.println("Data berhasil ditambahkan!\n");
                    break;
                case 2:
                    System.out.println("\n=== DATA SELURUH DOSEN ===");
                    dd.tampil();
                    break;
                case 3:
                    dd.SortingASC();
                    System.out.println("Data berhasil diurutkan secara ASCENDING (Bubble Sort)!\n");
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Menu tidak valid!\n");
            }
        } while (menu != 4);

        sc.close();
    }
}
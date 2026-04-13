package P8;

import java.util.Scanner;

public class SistemPeminjamanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa27[] daftarMhs = {
            new Mahasiswa27("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa27("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa27("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku27[] daftarBuku = {
            new Buku27("B001", "Algoritma", 2020),
            new Buku27("B002", "Basis Data", 2019),
            new Buku27("B003", "Pemrograman", 2021),
            new Buku27("B004", "Fisika", 2024)
        };

        Peminjaman27[] daftarPinjam = {
            new Peminjaman27(daftarMhs[0], daftarBuku[0], 7),
            new Peminjaman27(daftarMhs[1], daftarBuku[1], 3),
            new Peminjaman27(daftarMhs[2], daftarBuku[2], 10),
            new Peminjaman27(daftarMhs[2], daftarBuku[3], 6),
            new Peminjaman27(daftarMhs[0], daftarBuku[1], 4)
        };

        int pilihan;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa27 m : daftarMhs) {
                        m.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (Buku27 b : daftarBuku) {
                        b.tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (Peminjaman27 p : daftarPinjam) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    insertionSortDesc(daftarPinjam);
                    for (Peminjaman27 p : daftarPinjam) {
                        p.tampilPeminjaman();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cariNim = sc.nextLine();
                    binarySearchNim(daftarPinjam, cariNim);
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }

    public static void insertionSortDesc(Peminjaman27[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman27 temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].denda < temp.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    private static void sortNimAsc(Peminjaman27[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman27 temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void binarySearchNim(Peminjaman27[] arr, String targetNim) {
        sortNimAsc(arr); 

        int left = 0;
        int right = arr.length - 1;
        int j = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = arr[mid].mhs.nim.compareTo(targetNim);

            if (compare == 0) {
                j = mid;
                right = mid - 1; 
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (j != -1) {
            for (int i = j; i < arr.length; i++) {
                if (arr[i].mhs.nim.equals(targetNim)) {
                    arr[i].tampilPeminjaman();
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Data peminjaman dengan NIM " + targetNim + " tidak ditemukan.");
        }
    }
}

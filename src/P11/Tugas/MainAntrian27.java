package P11.Tugas;

import java.util.Scanner;

public class MainAntrian27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList27 queue = new QueueLinkedList27(10);
        int menu;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Daftar Antrian Baru");
            System.out.println("2. Panggil Antrian (Proses)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Sisa Antrian");
            System.out.println("5. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String kep = sc.nextLine();
                    MahasiswaAntrian27 mhs = new MahasiswaAntrian27(nim, nama, kep);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFrontRear();
                    break;
                case 4:
                    queue.checkSize();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Program selesai. Happy coding!");
                    break;
                default:
                    System.out.println("Pilihan nggak valid, coba lagi!");
            }
        } while (menu != 0);
        
        sc.close();
    }
}
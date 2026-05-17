package P13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedListAntrian listAntrian = new DoubleLinkedListAntrian();
        DoubleLinkedListPesanan listPesanan = new DoubleLinkedListPesanan();
        Scanner sc = new Scanner(System.in);
        int autoNoAntrian = 1;

        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Ainra", "08224500000"));
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Danra", "08224511111"));
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Sanri", "08224522222"));

        int pilihan;
        do {
            System.out.println("\n=========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    listAntrian.tambahAntrian(autoNoAntrian, new Pembeli(nama, hp));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + autoNoAntrian);
                    autoNoAntrian++;
                    break;

                case 2:
                    listAntrian.cetakAntrian();
                    break;

                case 3:
                    NodeAntrian dipanggil = listAntrian.hapusAntrianPertama();
                    if (dipanggil != null) {
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String menuMakanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        listPesanan.tambahPesanan(new Pesanan(kode, menuMakanan, harga));
                        System.out.println(dipanggil.pembeli.namaPembeli + " telah memesan " + menuMakanan);
                    } else {
                        System.out.println("Tidak ada antrian pembeli saat ini.");
                    }
                    break;

                case 4:
                    listPesanan.cetakLaporan();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
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
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Budi", "08224533333"));
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Cita", "08224544444"));
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Dina", "08224555555"));
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Eko", "08224566666"));
        listAntrian.tambahAntrian(autoNoAntrian++, new Pembeli("Fina", "08224577777"));
        listAntrian.hapusAntrianPertama();
        listPesanan.tambahPesanan(new Pesanan(101, "Nasi Goreng", 25000));
        listAntrian.hapusAntrianPertama();
        listPesanan.tambahPesanan(new Pesanan(102, "Mie Goreng", 20000));
        listAntrian.hapusAntrianPertama();
        listPesanan.tambahPesanan(new Pesanan(103, "Ayam Bakar", 30000));
        listAntrian.hapusAntrianPertama();
        listPesanan.tambahPesanan(new Pesanan(104, "Es Teh Manis", 5000));

        int pilihan;
        do {
            System.out.println("\n=========================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Update Pesanan");
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
                case 5:
                    System.out.print("Masukkan Kode Pesanan yang diupdate: ");
                    int kodePesananUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan Baru: ");
                    String menuBaru = sc.nextLine();
                    System.out.print("Harga Baru       : ");
                    int hargaBaruUpdate = sc.nextInt();
                    sc.nextLine();
                    if (listPesanan.updatePesanan(kodePesananUpdate, menuBaru, hargaBaruUpdate)) {
                        System.out.println("Data pesanan berhasil diperbarui.");
                    } else {
                        System.out.println("Kode Pesanan tidak ditemukan.");
                    }
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
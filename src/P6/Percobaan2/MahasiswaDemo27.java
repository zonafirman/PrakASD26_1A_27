package P6.Percobaan2;
import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Jumlah Mahasiswa :");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27(jumMhs);
        for(int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            
            System.out.println("-----------------------------------");
            list.tambah(new Mahasiswa27(nim, nama, kelas, ipk));
        }

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("-----------------------------------");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk =");
        list.insertionSort();
        list.tampil();

        System.out.println("Pencarian data");
        System.out.println("-----------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        String ipCari = sc.nextLine();
        double cari = Double.parseDouble(ipCari);

        System.out.println("menggunakan binary search");
        int posisi = list.findBinarySearch(cari,0,jumMhs-1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
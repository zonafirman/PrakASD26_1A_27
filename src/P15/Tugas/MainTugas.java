package P15.Tugas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Mahasiswa {
    String nim;
    String nama;
    String telf;

    public Mahasiswa(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
}

class MataKuliah {
    String kode;
    String namaMk;
    String sks;

    public MataKuliah(String kode, String namaMk, String sks) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.sks = sks;
    }
}

class Nilai {
    Mahasiswa mhs;
    MataKuliah mk;
    double nilai;

    public Nilai(Mahasiswa mhs, MataKuliah mk, double nilai) {
        this.mhs = mhs;
        this.mk = mk;
        this.nilai = nilai;
    }
}

public class MainTugas {
    static List<Mahasiswa> listMahasiswa = new ArrayList<>();
    static List<MataKuliah> listMk = new ArrayList<>();
    static List<Nilai> listNilai = new ArrayList<>();
    static Queue<Mahasiswa> queueMahasiswa = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inisialisasiData();

        int menu;
        do {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa (Implementasi Queue)");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    inputNilai(sc);
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    mencariNilai(sc);
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    hapusMahasiswaQueue();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (menu != 6);
    }

    static void inisialisasiData() {
        listMahasiswa.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        listMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        queueMahasiswa.addAll(listMahasiswa);

        listMk.add(new MataKuliah("00001", "Internet of Things", "3"));
        listMk.add(new MataKuliah("00002", "Algoritma dan Struktur Data", "2"));
        listMk.add(new MataKuliah("00003", "Algoritma dan Pemrograman", "2"));
        listMk.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        listMk.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", "3"));
    }

    static void inputNilai(Scanner sc) {
        System.out.println("--- DAFTAR MAHASISWA ---");
        System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "Telf");
        for (Mahasiswa mhs : queueMahasiswa) { 
            System.out.printf("%-10s %-15s %-10s\n", mhs.nim, mhs.nama, mhs.telf);
        }
        System.out.print("Pilih mahasiswa by nim : ");
        String nim = sc.nextLine();
        
        Mahasiswa mhsPilih = null;
        for (Mahasiswa mhs : queueMahasiswa) {
            if (mhs.nim.equals(nim)) {
                mhsPilih = mhs;
                break;
            }
        }

        System.out.println("\n--- DAFTAR MATA KULIAH ---");
        System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : listMk) {
            System.out.printf("%-10s %-40s %-5s\n", mk.kode, mk.namaMk, mk.sks);
        }
        System.out.print("Pilih MK by kode : ");
        String kode = sc.nextLine();

        MataKuliah mkPilih = null;
        for (MataKuliah mk : listMk) {
            if (mk.kode.equals(kode)) {
                mkPilih = mk;
                break;
            }
        }

        if (mhsPilih != null && mkPilih != null) {
            System.out.print("Masukkan Nilai : ");
            double nilaiAngka = sc.nextDouble();
            listNilai.add(new Nilai(mhsPilih, mkPilih, nilaiAngka));
            System.out.println("Data nilai berhasil ditambahkan!");
        } else {
            System.out.println("NIM atau Kode MK tidak ditemukan!");
        }
    }

    static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*************************************************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-5s %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
        }
        System.out.println("*************************************************************************");
    }

    static void mencariNilai(Scanner sc) {
        tampilNilai();
        System.out.print("Masukkan data mahasiswa (nim) : ");
        String cariNim = sc.nextLine();

        System.out.println("*************************************************************************");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
        
        int totalSks = 0;
        boolean found = false;
        
        for (Nilai n : listNilai) {
            if (n.mhs.nim.equals(cariNim)) {
                System.out.printf("%-10s %-15s %-40s %-5s %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                totalSks += Integer.parseInt(n.mk.sks);
                found = true;
            }
        }
        
        if (found) {
            System.out.println("Total SKS " + totalSks + " telah diambil.");
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    static void urutDataNilai() {
        listNilai.sort((n1, n2) -> Double.compare(n2.nilai, n1.nilai));
        System.out.println("Data berhasil diurutkan berdasarkan Nilai terbesar!");
        tampilNilai();
    }

    static void hapusMahasiswaQueue() {
        if (!queueMahasiswa.isEmpty()) {
            Mahasiswa mhsDihapus = queueMahasiswa.poll(); 
            System.out.println("Berhasil menghapus mahasiswa antrian terdepan: " + mhsDihapus.nama + " (" + mhsDihapus.nim + ")");
            
            listNilai.removeIf(n -> n.mhs.nim.equals(mhsDihapus.nim));
        } else {
            System.out.println("Antrian Mahasiswa sudah kosong!");
        }
    }
}
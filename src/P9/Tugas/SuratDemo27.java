package P9.Tugas;

import java.util.Scanner;

public class SuratDemo27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat27 stack = new StackSurat27(10);
        int pilih = 0;

        do {
            System.out.println("\n=== Menu Layanan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            // Validasi agar tidak crash jika user input huruf pada pilihan menu
            if (!scan.hasNextInt()) {
                System.out.println("Input tidak valid! Harap masukkan angka (1-5).");
                scan.next(); // Membersihkan input yang salah
                continue;
            }
            
            pilih = scan.nextInt();
            scan.nextLine(); // Membersihkan buffer enter

            switch (pilih) {
                case 1:
                    if (!stack.isFull()) {
                        System.out.print("ID Surat: ");
                        String id = scan.nextLine();
                        System.out.print("Nama Mahasiswa: ");
                        String nama = scan.nextLine();
                        System.out.print("Kelas: ");
                        String kelas = scan.nextLine();
                        
                        // Validasi agar tidak crash saat user hanya menekan enter (input kosong)
                        char jenis = 'I';
                        while (true) {
                            System.out.print("Jenis Izin (S: Sakit / I: Izin Lain): ");
                            String inputJenis = scan.nextLine().trim();
                            if (inputJenis.length() > 0) {
                                jenis = inputJenis.charAt(0);
                                break;
                            } else {
                                System.out.println("Jenis izin tidak boleh kosong!");
                            }
                        }

                        // Validasi durasi agar tidak crash saat diinput selain angka
                        System.out.print("Durasi (hari): ");
                        while (!scan.hasNextInt()) {
                            System.out.println("Durasi harus berupa angka!");
                            System.out.print("Durasi (hari): ");
                            scan.next(); // Membersihkan input salah
                        }
                        int durasi = scan.nextInt();
                        scan.nextLine(); // Membersihkan buffer enter

                        Surat27 srt = new Surat27(id, nama, kelas, jenis, durasi);
                        stack.push(srt);
                        System.out.println("-> Surat izin berhasil ditambahkan ke tumpukan.");
                    } else {
                        System.out.println("-> Stack Penuh! Tidak bisa menerima surat izin baru saat ini.");
                    }
                    break;

                case 2:
                    Surat27 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("-> Sedang memproses surat izin milik: " + diproses.namaMahasiswa);
                        System.out.println("-> Status: Telah diproses & diverifikasi.");
                    }
                    break;

                case 3:
                    Surat27 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("\n--- Surat Izin Teratas di Tumpukan ---");
                        System.out.println(lihat.toString());
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang ingin dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan layanan ini.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu antara 1-5.");
            }
        } while (pilih != 5);
        
        scan.close();
    }
}
package P6;
import java.util.Scanner;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            
            Mahasiswa27 m = new Mahasiswa27(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}
package P3.Tugas;

import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen27[] arrayDosen27s = new Dosen27[3];

        for (int i = 0; i < arrayDosen27s.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia           : ");
            int usia = sc.nextInt();
            sc.nextLine(); 
            
            arrayDosen27s[i] = new Dosen27(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }

        Dosen27.dataSemuaDosen(arrayDosen27s);
        Dosen27.jumlahDosenPerJenisKelamin(arrayDosen27s);
        Dosen27.rerataUsiaDosenPerJenisKelamin(arrayDosen27s);
        Dosen27.infoDosenPalingTua(arrayDosen27s);
        Dosen27.infoDosenPalingMuda(arrayDosen27s);

        sc.close();
    }
}
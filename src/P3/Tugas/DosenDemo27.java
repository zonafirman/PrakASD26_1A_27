package P3.Tugas;

import java.util.Scanner;

public class DosenDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen27[] arrayDosen27s = new Dosen27[2];
        String kode, nama, inputJK;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayDosen27s.length; i++) {
            System.out.println("Masukan Data Dosen ke-" + (i + 1));
            
            System.out.print("Kode                : ");
            kode = sc.nextLine();
            
            System.out.print("Nama                : ");
            nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin (Pria/Wanita) : ");
            inputJK = sc.nextLine();
            if (inputJK.equalsIgnoreCase("Pria")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            
            System.out.print("Usia                : ");
            usia = sc.nextInt();
            sc.nextLine(); 
            
            System.out.println("------------------------------");
            
            arrayDosen27s[i] = new Dosen27(kode, nama, jenisKelamin, usia);
        }
        
        System.out.println("\n==============================");

        int index = 1;
        for (Dosen27 dosen : arrayDosen27s) {
            System.out.println("Data Dosen ke-" + index);
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            
            String jk = (dosen.jenisKelamin) ? "Pria" : "Wanita";
            System.out.println("Jenis Kelamin : " + jk);
            
            System.out.println("Usia          : " + dosen.usia);
            System.out.println("------------------------------");
            index++;
        }
        
        sc.close();
    }
}
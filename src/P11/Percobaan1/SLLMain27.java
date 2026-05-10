package P11.Percobaan1;

import java.util.Scanner;

public class SLLMain27 {
    public static void main(String[] args) {
        SingleLinkedList27 sll = new SingleLinkedList27();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: "); String nim = sc.nextLine();
        System.out.print("Masukkan Nama: "); String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: "); String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: "); double ipk = sc.nextDouble();

        Mahasiswa27 mhsBaru = new Mahasiswa27(nim, nama, kelas, ipk);
        sll.addLast(mhsBaru);

        Mahasiswa27 mhs1 = new Mahasiswa27("111", "Dirga", "1A", 3.8);
        Mahasiswa27 mhs2 = new Mahasiswa27("112", "Budi", "1B", 3.6);
        Mahasiswa27 mhs3 = new Mahasiswa27("113", "Tono", "1A", 3.5);
        Mahasiswa27 mhs4 = new Mahasiswa27("114", "Rudi", "1C", 3.9);

        sll.print(); 
        sll.addFirst(mhs1); 
        sll.print();
        sll.addLast(mhs4); 
        sll.print();
        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(1, mhs2); 
        sll.print();
    }
    
}
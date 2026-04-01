package P6;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
      MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();
        
       Mahasiswa27 m1 = new Mahasiswa27("123", "Ali", "2B", 3.9);
        Mahasiswa27 m2 = new Mahasiswa27("124", "ila", "2B", 3.1);
        Mahasiswa27 m3 = new Mahasiswa27("125", "agus", "2B", 3.6);
        Mahasiswa27 m4 = new Mahasiswa27("126", "tika", "2B", 3.3);
        Mahasiswa27 m5 = new Mahasiswa27("127", "udin", "2B", 3.2);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        System.out.println("Data Mahasiswa27 sebelum sorting: ");
        list.tampil();
        
        System.out.println("Data sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
}
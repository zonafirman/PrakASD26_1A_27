package P6;

public class MahasiswaDemo27 {
  public static void main(String[] args) {
    MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();
    Mahasiswa27 m1 = new Mahasiswa27("111", "ayu", "2c", 3.7);
    Mahasiswa27 m2 = new Mahasiswa27("222", "dika", "2c", 3.0);
    Mahasiswa27 m3 = new Mahasiswa27("333", "ila", "2c", 3.8);
    Mahasiswa27 m4 = new Mahasiswa27("444", "susi", "2c", 3.1);
    Mahasiswa27 m5 = new Mahasiswa27("555", "yayuk", "2c", 3.4);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);
    System.out.println("Data Mahasiswa27 sebelum sorting: ");
    list.tampil();

    System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
    list.insertionSort();
    list.tampil();
  }
}
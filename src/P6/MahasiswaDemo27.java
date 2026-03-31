package P6;

public class MahasiswaDemo27 {
    public static void main(String[] args) {
        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27();
        
        Mahasiswa27 m1 = new Mahasiswa27("123", "Zidan", "2A", 3.2);
        Mahasiswa27 m2 = new Mahasiswa27("124", "Ayu", "2A", 3.5);
        Mahasiswa27 m3 = new Mahasiswa27("125", "Sofi", "2A", 3.1);
        Mahasiswa27 m4 = new Mahasiswa27("126", "Sita", "2A", 3.9);
        Mahasiswa27 m5 = new Mahasiswa27("127", "Miki", "2A", 3.7);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();
    }
}
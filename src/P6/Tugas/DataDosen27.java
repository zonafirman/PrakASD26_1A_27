package P6.Tugas;

public class DataDosen27 {
    Dosen27[] dataDosen27 = new Dosen27[10];
    int idx = 0;

    public void tambah(Dosen27 dsn) {
        if (idx < dataDosen27.length) {
            dataDosen27[idx] = dsn;
            idx++;
        } else {
            System.out.println("Kapasitas data Dosen27 sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data Dosen27.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen27[i].tampil();
        }
    }
}
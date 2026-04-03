package P6.Tugas;

public class DataDosen27 {
    Dosen27[] dataDosen = new Dosen27[10];
    int idx = 0;

    public void tambah(Dosen27 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data kosong!");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }
}

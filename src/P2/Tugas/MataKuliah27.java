package P2.Tugas;

public class MataKuliah27 {
    public class MataKuliah {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah() {}

    public MataKuliah(String kode, String nm, int sks, int jam) {
        this.kodeMK = kode;
        this.nama = nm;
        this.sks = sks;
        this.jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Kode: " + kodeMK + ", Nama: " + nama + ", SKS: " + sks + ", Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Sisa jam: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan, jam tidak mencukupi.");
        }
    }
}
}

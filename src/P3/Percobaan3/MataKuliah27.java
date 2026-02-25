package P3.Percobaan3;

public class MataKuliah27 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah27(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kodeBaru, String namaBaru, int sksBaru, int jumlahJamBaru) {
        this.kode = kodeBaru;
        this.nama = namaBaru;
        this.sks = sksBaru;
        this.jumlahJam = jumlahJamBaru;
    }
}

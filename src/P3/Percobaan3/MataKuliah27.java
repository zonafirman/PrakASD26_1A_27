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
    public void cetakInfo() {
    System.out.println("Kode       : " + this.kode);
    System.out.println("Nama       : " + this.nama);
    System.out.println("Sks        : " + this.sks);
    System.out.println("Jumlah Jam : " + this.jumlahJam);
    System.out.println("-----------------------------------");
}
}

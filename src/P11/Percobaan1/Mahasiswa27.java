package P11.Percobaan1;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa27() {
    }

    public Mahasiswa27(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
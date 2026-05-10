package P11.Tugas;

public class MahasiswaAntrian27 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaAntrian27(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void info() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Keperluan: " + keperluan);
    }
}

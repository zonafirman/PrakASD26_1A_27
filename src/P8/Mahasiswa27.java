package P8;

public class Mahasiswa27 {
    String nim;
    String nama;
    String prodi;

    public Mahasiswa27(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
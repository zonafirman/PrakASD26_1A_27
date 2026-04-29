package P9.Tugas;

public class Surat27 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat27(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String toString() {
        String jenis = (jenisIzin == 'S' || jenisIzin == 's') ? "Sakit" : "Izin Lainnya";
        return "ID Surat       : " + idSurat + "\n" +
               "Nama Mahasiswa : " + namaMahasiswa + "\n" +
               "Kelas          : " + kelas + "\n" +
               "Jenis Izin     : " + jenis + "\n" +
               "Durasi         : " + durasi + " hari";
    }
}
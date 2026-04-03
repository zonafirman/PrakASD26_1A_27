package P6.Percobaan2;

public class Mahasiswa27 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa27() {
    }

    Mahasiswa27(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}

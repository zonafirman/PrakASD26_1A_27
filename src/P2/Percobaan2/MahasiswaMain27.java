package P2.Percobaan2;

import P2.Percobaan1.Mahasiswa27;

public class MahasiswaMain27 {
    public static void main(String[] args) {
        
        P2.Percobaan1.Mahasiswa27 mhs1 = new P2.Percobaan1.Mahasiswa27();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa27 mhs2 = new Mahasiswa27("Anisa Sabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa27 mhsZonaFirmanMaulana = new Mahasiswa27("Zona Firman Maulana", "24107020192", 3.55, "TI 1A");
        mhsZonaFirmanMaulana.tampilkanInformasi();
        
    }
}

package P2.Tugas;

public class DosenMain27 {
    public static void main(String[] args) {
        Dosen27 dosen1 = new Dosen27();
        dosen1.idDosen = "D001";
        dosen1.nama = "Budi Budiono";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Pemrograman Java";

        System.out.println("--- Informasi Dosen 1 ---");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        int masaKerja1 = dosen1.hitungMasaKerja(2026);
        System.out.println("Masa Kerja: " + masaKerja1 + " tahun");
        dosen1.ubahKeahlian("Algoritma dan Struktur Data");

        System.out.println("\n--- Informasi Dosen 2 ---");
        Dosen27 dosen2 = new Dosen27("D002", "Siti Aminah", true, 2020, "Basis Data");
        
        dosen2.tampilInformasi();
        int masaKerja2 = dosen2.hitungMasaKerja(2026);
        System.out.println("Masa Kerja: " + masaKerja2 + " tahun");
    }
}

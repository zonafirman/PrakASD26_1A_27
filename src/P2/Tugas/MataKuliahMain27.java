package P2.Tugas;
public class MataKuliahMain27 {
    public static void main(String[] args) {
       P2.Tugas.MataKuliah27.MataKuliah mk1 = new MataKuliah27().new MataKuliah();
        mk1.kodeMK = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        System.out.println("--- Informasi Mata Kuliah 1 ---");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        System.out.println("\n--- Informasi Mata Kuliah 2 ---");
        P2.Tugas.MataKuliah27.MataKuliah mk2 = new MataKuliah27().new MataKuliah("BD", "Basis Data", 3, 4);
        
        mk2.tampilInformasi();
        mk2.kurangiJam(6);
    }
}

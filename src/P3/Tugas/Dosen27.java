package P3.Tugas;

public class Dosen27 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen27(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public static void dataSemuaDosen(Dosen27[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen[i].kode);
            System.out.println("Nama          : " + arrayOfDosen[i].nama);
            System.out.println("Jenis Kelamin : " + (arrayOfDosen[i].jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + arrayOfDosen[i].usia);
            System.out.println("------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen27[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen27 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen27[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, jmlPria = 0, jmlWanita = 0;
        for (Dosen27 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }
        System.out.println("\n=== RATA-RATA USIA DOSEN ===");
        System.out.println("Pria   : " + (jmlPria > 0 ? (double) totalPria / jmlPria : 0));
        System.out.println("Wanita : " + (jmlWanita > 0 ? (double) totalWanita / jmlWanita : 0));
    }

    public static void infoDosenPalingTua(Dosen27[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen27 tua = arrayOfDosen[0];
        for (Dosen27 d : arrayOfDosen) {
            if (d.usia > tua.usia) tua = d;
        }
        System.out.println("\n=== DOSEN PALING TUA ===");
        System.out.println("Nama: " + tua.nama + " (" + tua.usia + " Tahun)");
    }

    public static void infoDosenPalingMuda(Dosen27[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen27 muda = arrayOfDosen[0];
        for (Dosen27 d : arrayOfDosen) {
            if (d.usia < muda.usia) muda = d;
        }
        System.out.println("\n=== DOSEN PALING MUDA ===");
        System.out.println("Nama: " + muda.nama + " (" + muda.usia + " Tahun)");
    }
}
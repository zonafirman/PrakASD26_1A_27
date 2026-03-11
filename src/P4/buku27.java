package P4;

public class buku27 {
    String KodeBuku;
    String NamaBuku;
    int TahunTerbit;
    int Stok;

    public buku27(String KodeBuku, String NamaBuku, int TahunTerbit, int Stok) {
        this.KodeBuku = KodeBuku;
        this.NamaBuku = NamaBuku;
        this.TahunTerbit = TahunTerbit;
        this.Stok = Stok;
    }

    public static void TampilSemuaBuku(buku27[] arraybuku27s) {
        for (int i = 0; i < arraybuku27s.length; i++) {
            System.out.println("--- Data Buku ---");
            System.out.println("Kode Buku" + arraybuku27s[i].KodeBuku);
            System.out.println("Nama Buku" + arraybuku27s[i].NamaBuku);
            System.out.println("Tahun Terbit" + arraybuku27s[i].TahunTerbit);
            System.out.println("Stok" + arraybuku27s[i].Stok);
        }
    }

    

    public static void TampilBerdasarkanTahun(buku27[] arrayTahunBuku27s){
        int tahunDicari = 2023;
        for (int i = 0; i < arrayTahunBuku27s.length; i++) {

            if (arrayTahunBuku27s[i].TahunTerbit == tahunDicari){
                System.out.println("Buku 2023" +arrayTahunBuku27s[i].NamaBuku);
            }
            
        }
    }
}

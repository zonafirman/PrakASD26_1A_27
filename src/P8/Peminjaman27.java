package P8;

public class Peminjaman27 {
    Mahasiswa27 mhs;
    Buku27 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

   
    public Peminjaman27(Mahasiswa27 mhs, Buku27 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }
 
    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPeminjaman() {
        if (lamaPinjam >14){
            System.out.println(" Peringatan : Lama Pinjam Melebihi batas Normal, data tidak bisa masuk ke array of object");
        }else if (lamaPinjam <= 0) {
             System.out.println(" Tdiak ada data");
        }else{
            System.out.println(mhs.nama + " \t| " + buku.judul + " \t| Lama: " + lamaPinjam 
                + " | Terlambat: " + terlambat + " | Denda: " + denda);
        }
        
    }
}

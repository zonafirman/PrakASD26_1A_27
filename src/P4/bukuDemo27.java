package P4;
public class bukuDemo27 {
    public static void main(String[] args) {
        buku27[] arrayBuku27s = new buku27[5];

        arrayBuku27s[0] = new buku27("1", "Belajar HTML", 2023, 20);
        arrayBuku27s[1] = new buku27("2", "Belajar PHP", 2023, 10);
        arrayBuku27s[2] = new buku27("3", "Belajar Pyhton", 2024, 30);
        arrayBuku27s[3] = new buku27("4", "Belajar CSS", 2023, 50);
        arrayBuku27s[4] = new buku27("5", "Belajar Java", 2024, 10);

        buku27.TampilSemuaBuku(arrayBuku27s);
        buku27.TampilBerdasarkanTahun(arrayBuku27s);
    }
}

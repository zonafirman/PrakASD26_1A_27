package P10.Percobaan2;

public class AntrianKRS {
    Mahasiswa27[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;
    int totalMaksDPA;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa27[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
        this.totalMaksDPA = 30;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void kosongkan() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(Mahasiswa27 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh (Maksimal 10)!");
            return;
        }
        if (sudahKRS + size >= totalMaksDPA) {
            System.out.println("Kuota DPA telah penuh (Maksimal 30 mahasiswa)!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian.");
    }

    public void prosesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa diproses.");
            return;
        }
        
        int jumlahDiproses = Math.min(2, size);
        System.out.println("Memproses KRS untuk " + jumlahDiproses + " mahasiswa:");
        
        for (int i = 0; i < jumlahDiproses; i++) {
            Mahasiswa27 mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            System.out.print("- ");
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian KRS:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Dua Antrian Terdepan:");
        int batas = Math.min(2, size);
        for (int i = 0; i < batas; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Paling Akhir:");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian saat ini: " + size);
    }

    public void cetakStatistik() {
        System.out.println("Jumlah mahasiswa yang sudah KRS: " + sudahKRS);
        System.out.println("Jumlah mahasiswa yang belum KRS (sisa kuota DPA): " + (totalMaksDPA - sudahKRS));
    }
}

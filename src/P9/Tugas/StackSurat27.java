package P9.Tugas;

public class StackSurat27 {
    Surat27[] stack;
    int size;
    int top;

    public StackSurat27(int size) {
        this.size = size;
        stack = new Surat27[size];
        top = -1;
    }

    public boolean isFull() { return top == size - 1; }
    public boolean isEmpty() { return top == -1; }

    public void push(Surat27 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambah surat izin.");
        }
    }

    public Surat27 pop() {
        if (!isEmpty()) {
            Surat27 srt = stack[top];
            stack[top] = null; // Menghapus referensi agar dihapus oleh Garbage Collector
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Belum ada surat yang masuk.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                if (stack[i].namaMahasiswa.trim().equalsIgnoreCase(nama.trim())) {
                    System.out.println("\nSurat izin dari '" + nama + "' ditemukan pada tumpukan ke-" + (top - i + 1) + " dari atas.");
                    System.out.println(stack[i].toString());
                    ditemukan = true;
                    break;
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin atas nama '" + nama + "' tidak ditemukan di tumpukan.");
        }
    }
}
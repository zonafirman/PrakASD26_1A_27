package P11.Tugas;

public class QueueLinkedList27 {
    NodeAntrian27 front, rear; 
    int size;
    int maxCapacity; 

    public QueueLinkedList27(int maxCapacity) {
        front = rear = null;
        size = 0;
        this.maxCapacity = maxCapacity;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size == maxCapacity;
    }

    public void enqueue(MahasiswaAntrian27 data) {
        if (isFull()) {
            System.out.println("Yah, antrian udah penuh nih!");
            return;
        }
        NodeAntrian27 newNode = new NodeAntrian27(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Sip, mahasiswa atas nama " + data.nama + " berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, nggak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil antrian:");
        front.data.info();
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Semua antrian udah dibersihkan.");
    }

    public void printFrontRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("--- Antrian Paling Depan ---");
            front.data.info();
            System.out.println("--- Antrian Paling Belakang ---");
            rear.data.info();
        }
    }

    public void checkSize() {
        System.out.println("Sisa antrian sekarang: " + size + " mahasiswa.");
    }
}
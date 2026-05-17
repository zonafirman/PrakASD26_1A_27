package P13;
class DoubleLinkedListAntrian {
    NodeAntrian head;
    NodeAntrian tail;
    int size = 0;

    void tambahAntrian(int no, Pembeli p) {
        NodeAntrian newNode = new NodeAntrian(no, p);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    NodeAntrian hapusAntrianPertama() {
        if (head == null) {
            return null;
        }
        NodeAntrian temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return temp;
    }

    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian Kosong.");
            return;
        }
        System.out.println("=========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-12s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian current = head;
        while (current != null) {
            System.out.printf("%-12d %-15s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }
}

package P13;

class DoubleLinkedListPesanan {
    NodePesanan head;
    NodePesanan tail;

    boolean isEmpty() {
        return head == null;
    }

    void tambahPesanan(Pesanan p) {
        NodePesanan newNode = new NodePesanan(p);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void urutkanBerdasarkanNama() {
        if (isEmpty() || head.next == null) {
            return;
        }
        boolean swapped;
        NodePesanan current;
        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    Pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    


    }
        boolean updatePesanan(int kodePesanan, String menuBaru, int hargaBaru) {
        NodePesanan current = head;
        while (current != null) {
            if (current.pesanan.kodePesanan == kodePesanan) {
                current.pesanan.namaPesanan = menuBaru;
                current.pesanan.harga = hargaBaru;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    void cetakLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada laporan pesanan.");
            return;
        }
        urutkanBerdasarkanNama();
        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan current = head;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            totalPendapatan += current.pesanan.harga;
            current = current.next;
        }
        System.out.println("=========================================");
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}
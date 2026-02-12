package P1;

public class Fungsi27 {
       public static void main(String[] args) {
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int[] hargaBunga = {75000, 50000, 60000, 10000};

        tampilkanPendapatan(namaCabang, stockBunga, hargaBunga);
    }

    public static void tampilkanPendapatan(String[] cabang, int[][] stock, int[] harga) {
        System.out.printf("%-15s | %-15s\n", "Cabang", "Pendapatan");
        System.out.println("===================================");

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }

            System.out.printf("%-15s | Rp %-12d\n", cabang[i], pendapatan);
        }
    }
}
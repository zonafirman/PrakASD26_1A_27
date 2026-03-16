package P5.Tugas;

public class uts27main {
      public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};
        int maxUTS = uts27.cariMaxDC(nilaiUTS, 0, nilaiUTS.length - 1);
       
        System.out.println("=== Hasil Latihan Praktikum ===");
        System.out.println("Nilai UTS tertinggi : " + maxUTS);
    }
}

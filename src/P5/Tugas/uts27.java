package P5.Tugas;

public class uts27 {

    public static int cariMaxDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int maxKiri = cariMaxDC(arr, kiri, tengah);
        int maxKanan = cariMaxDC(arr, tengah + 1, kanan);
        return Math.max(maxKiri, maxKanan);
    }

    public static int cariMinDC(int[] arr, int kiri, int kanan) {
        if (kiri == kanan) {
            return arr[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariMinDC(arr, kiri, tengah);
        int minKanan = cariMinDC(arr, tengah + 1, kanan);
        return Math.min(minKiri, minKanan);
    }
    public static double cariRataRataBF(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }
}

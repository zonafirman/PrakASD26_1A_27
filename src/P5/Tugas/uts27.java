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
}

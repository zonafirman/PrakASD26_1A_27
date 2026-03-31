package P6;

public class SortingMain27 {
    public static void main(String[] args) {
      int b[] = {30, 20, 2, 8, 14};
        Sorting27 dataurut2 = new Sorting27(b, b.length);
        
        System.out.println("\nData awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}
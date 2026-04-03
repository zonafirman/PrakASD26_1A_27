package P6.Percobaan1;

public class SortingMain27 {
    public static void main(String[] args) {
    int c[] = {40, 10, 4, 9, 3};
        Sorting27 dataurut3 = new Sorting27(c, c.length);
        
        System.out.println("\nData awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
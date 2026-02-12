package P1;
 import java.util.Scanner;
public class TugasNo2_27 {
   
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);

        tampilkanSemua(jadwal);
    }

    public static void inputJadwal(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nInput Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            data[i][0] = sc.nextLine();
            System.out.print("Ruang: ");
            data[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah: ");
            data[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah: ");
            data[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] data) {
        System.out.println("\n==================== SELURUH JADWAL KULIAH ====================");
        System.out.printf("%-25s | %-15s | %-10s | %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-25s | %-15s | %-10s | %-10s\n", row[0], row[1], row[2], row[3]);
        }
    }
}


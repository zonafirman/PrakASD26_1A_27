package P1;

import java.util.Scanner;

public class Perulangan27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM Anda: ");
        String nim = input.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        System.out.println("Input NIM: " + nim + " maka n = " + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        input.close();
    }
}

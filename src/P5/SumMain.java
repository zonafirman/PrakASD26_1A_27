package P5;

import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = input.nextInt();
        Sum sum = new Sum(elemen);
        for(int i=0;i<elemen;i++){
            System.out.print("Masukan nilai ke-" + (i+1) + ": ");
            sum.keuntungan[i] = input.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan BruteForce: " + sum.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sum.totalDC(sum.keuntungan, 0, elemen-1));
    }

        
}
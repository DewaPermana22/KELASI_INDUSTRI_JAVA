package NextLoop;

import java.util.Scanner;

public class nextLoop10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang : ");
        int batas = input.nextInt();
        input.close();

        for (int i = 1; i <= batas; i++) {
            for (int j = 1; j <= batas; j++) {
                if (i == 1 || i == batas || j == 1 || j == batas) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}

package NextLoop;

import java.util.Scanner;

public class nextLoop11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah bintang : ");
        int pola = input.nextInt();
        input.close();

        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j <= pola; j++) {
                if (i==1 || i == pola || j == 1 || j == pola) {
                  System.out.print("* ");  
                } else if (i == j) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

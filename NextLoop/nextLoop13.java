package NextLoop;

import java.util.Scanner;

public class nextLoop13 {
   public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    System.out.print("masukkan jumlah : ");
    user.nextInt();
    user.close();

    for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
   } 
}

package NextLoop;

import java.util.Scanner;

public class nextLoop12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah : ");
        int pola = input.nextInt();
        input.close();

        for (int i = 1; i <= pola; i++) {
            for (int j = 1; j <= pola; j++) {
                if (i == 1 || i == pola || j == 1 || j == pola) {
                    System.out.print("* ");
                }else if (i == j) {
                    System.out.print("* ");
                }else if (j == pola - (i- 1)) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

package NextLoop;

import java.util.Scanner;

public class nextLoop14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("jumlah : " );
        int user = input.nextInt();
        input.close();

        for (int i = 1; i <=user; i++) {
            for (int j = i; j <= user -1; j++) {
                System.out.print("  ");
                for (int k = 1; k <= (i * 2) - 1; k++) {
                   System.out.print("* "); 
                }
            }
            System.out.println();
        }
    }
}

package NextLoop;
import java.util.*;

public class nextLoop6 {
    public static void main(String[] args) {
       Scanner user = new Scanner(System.in);
       int total = 0;

       for (int i = 1; i <= 5; i++) {
        System.out.print("Masukkan angka ke " + i + ": ");
        int input = user.nextInt();
        if (input % 5 != 0) {
            continue;
        }
        total += input;
       }System.out.print("Hasil : " + total);
       user.close();
    }
}

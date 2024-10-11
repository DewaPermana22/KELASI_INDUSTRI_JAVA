package NextLoop;
import java.util.*;

public class nextLoop2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan angka kecuali nol (0) agar program terus berjalan : ");
            int usr = user.nextInt();
            if (usr==0) {
                break;
            }
        }user.close();
    }
}

package NextLoop;
import java.util.Scanner;

public class nextLoop9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("masukkan jumlah bintang : ");
        int user = n.nextInt();
        n.close();
        
        for (int i = 1; i <= user; i++) {
            for (int j = 1; j <= user; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

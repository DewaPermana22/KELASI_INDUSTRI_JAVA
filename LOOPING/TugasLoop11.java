package LOOPING;
import java.util.*;

public class TugasLoop11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genap = "";
        String ganjil = "";

        System.out.print("Masukkan jumlah deret : ");
        int deret = input.nextInt();
        input.close();
        int i = 1;

        do {
            if (i % 2 == 1) {
                ganjil = ganjil + i + " ";
            } else{
                genap = genap + i + " ";
            }
            i++;
        } while(i<=deret);

        System.out.println("Jumlah Deret : " + deret);
        System.out.println("Bilangan Ganjil : " + ganjil);
        System.out.println("Bilangan Genap : " + genap);
    }
}

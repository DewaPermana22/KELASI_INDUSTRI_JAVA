package LOOPING;
import java.util.*;

public class TugasLoop10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "";
        while (!user.equalsIgnoreCase("ya")) {
            System.out.print("yakin ingin keluar? : ");
            user = input.nextLine();
        }
        input.close();
    }
}

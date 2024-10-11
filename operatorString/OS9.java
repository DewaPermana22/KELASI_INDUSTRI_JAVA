package operatorString;
import java.util.*;

public class OS9 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukan Kalimat : ");
       String kalimat = input.nextLine();
       String[] kata = kalimat.split(" ");
       for (String output : kata) {
        System.out.println("Kata " + output.toUpperCase() + " Berjumlah " + output.length());
       }
       input.close();
    }
}

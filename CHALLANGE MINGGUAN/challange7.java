import java.util.*;
public class challange7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Aplikasi perulangan bilangan ganjil");
        System.out.print("Inputkan angka untuk mencetak bilangan ganjil dari 1 sampai N : ");
        int en = input.nextInt();
        input.close();

        for (int i = 0; i < en; i++) {
            if (i % 2 !=0) {
                System.out.println(i);
            }
        }
    }
}
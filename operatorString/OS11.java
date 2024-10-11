package operatorString;

import java.util.Scanner;

public class OS11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("pilih index yang ditampilkan : ");
        int index = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan kalimat anda : ");
        String user = input.nextLine();
        String kataUser[] = user.split(" ");
        for (String output : kataUser) {
            System.out.print(output + " ");
        }
        System.out.println();
        for (String indexUser : kataUser) {
            System.out.print(indexUser.charAt(index) + " ");
        }
        input.close();
    }
}

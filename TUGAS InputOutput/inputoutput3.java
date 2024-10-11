import java.util.Scanner;

public class inputoutput3 {
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.println("Inputkan Jenis Kelamin : ");
        String JK = User.nextLine();
        System.out.println("Masukkan Ukuran Sepatu : ");
        int ukuran = User.nextInt();
        System.out.println("Apakah anda sudah menikah : ");
        boolean status = User.nextBoolean();
        User.close();

        System.out.println("========================");

        System.out.println("Jenis Kelamin : " + JK);
        System.out.println("Ukuran Sepatu : " + ukuran);
        System.out.println("Sudah Menikah? : " + status);
    }
}

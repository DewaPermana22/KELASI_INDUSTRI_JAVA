package operatorString;
import java.util.*;

public class OS4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama = " ", alamat = " ", email = " ";

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Nama : ");
            nama = input.nextLine();
            if (!nama.isEmpty()) {
                break;
            } else if (nama.isEmpty()) {
                System.out.println("Nama Tidak Boleh Kososng");  
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Alamat : ");
            alamat = input.nextLine();
            if (!alamat.isEmpty()) {
                break;
            } else if (alamat.isEmpty()) {
                System.out.println("Alamat Tidak Boleh Kosong");   
            }
        }
        for (int i = 0; i < 5; i++) {
        System.out.print("Masukkan Email : ");
        email = input.nextLine();
        if (!email.isEmpty()) {
            break;
        } else if (email.isEmpty()) {
            System.out.println("Email Tidak Boleh Kosong");
        }
        }
        System.out.println("----------------------------------------");
        System.out.println("Nama : " + nama );
        System.out.println("Alamat : " + alamat);
        System.out.println("Email : " + email);
         input.close();   
    }   
}
package Array;
import java.util.*;

public class array17 {
    public static void main(String[] args) {
        ArrayList<String> daftarMerk = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int data;
        
        do {
            String pilihanMenu = "1. Menambahkan data merk Laptop " + "\n2. Melihat daftar nama Laptop " + "\n0. Keluar"; 
            System.out.println("Pilihan menu : \n" + pilihanMenu);
            System.out.print("Inputan angka untuk menjalankan program: ");
            data = input.nextInt();
            input.nextLine();

            switch (data) {
                case 1:
                    System.out.print("Masukkan data merk laptop: ");
                    String merk = input.nextLine();
                    daftarMerk.add(merk);
                    break;
                case 2:
                    System.out.println("Daftar Merk Laptop:");
                    if (daftarMerk.isEmpty()) {
                        System.out.println("Tidak ada merk laptop yang terdaftar");
                    } else{
                        for (int i = 0; i < daftarMerk.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarMerk.get(i));
                    }
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Mohon inputkan angka yang sesuai");
                    break;
            }
        } while (data != 0);
        
        input.close();
    }
}

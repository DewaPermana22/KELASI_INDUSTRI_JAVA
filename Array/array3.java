package Array;
import java.io.*;

public class array3 {
    public static void main(String[] args) {
        try{
            String[] merkHp = new String[3];
        String[] merkLaptop = new String[3];
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < merkHp.length; i++) {
            System.out.print("Masukkan Merk Hp ke " + (i+1) + ": ");
            merkHp[i] = input.readLine();
        }
        for (int i = 0; i < merkLaptop.length; i++) {
            System.out.print("Masukkan Merk Laptop ke " + (i+1) + ": ");
            merkLaptop[i] = input.readLine();
        }
        StringBuilder hasil = new StringBuilder();
        hasil.append("Merk hp yang anda inputkan : \n");
        for (String hp : merkHp) {
            hasil.append(hp).append("\n");
        }
        hasil.append("\nMerk laptop yang anda inputkan : \n");
        for (String Laptop : merkLaptop) {
            hasil.append(Laptop).append("\n");
        }
        System.out.println(hasil.toString());
        } catch(IOException e) {
            e.printStackTrace();
        }

   }
}

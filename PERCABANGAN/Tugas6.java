package PERCABANGAN;
import java.util.*;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Inputkan kode plat kendaraan : ");
        String kode = user.next();
        char kodePlat = kode.charAt(0);
        System.out.println("Wilayah : ");
        user.close();

        switch (kodePlat) {
            case 'P':
                System.out.println("Jember, Bodowoso, Banyuwangi, Situbondo");
                break;
            case 'B':
                System.out.println("Jakarta");
                break;
            case 'L':
                System.out.println("Kota Surabaya");
            default:
                break;
        }
    }
}

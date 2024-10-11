package NextLoop;

public class nextLoop3 {
    public static void main(String[] args) {
        int sebelum = 1;
        int sesudah = 1;
        int hasil = 0;
        System.out.print(sebelum + " " + sesudah);

        for (int i = 3; ; i++) {
            hasil = sebelum + sesudah;
            if (hasil >= 200) {
                break;
            }
            System.out.print(" " + hasil);
            sebelum = sesudah;
            sesudah = hasil;
        }
    }
}

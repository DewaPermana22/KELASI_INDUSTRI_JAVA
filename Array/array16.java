package Array;

import java.util.ArrayList;

public class array16 {

    public static void main(String[] args) {
        ArrayList <Object> dataSiswa = new ArrayList<>();

        dataSiswa.add("Dewa permana");
        dataSiswa.add(16);
        dataSiswa.add("Alva Novem");
        dataSiswa.add(19);
        dataSiswa.add("Fahmy Bima");
        dataSiswa.add(16);
        dataSiswa.add("Ale Atallah");
        dataSiswa.add(17);
        dataSiswa.add("Fahrul Slebew");
        dataSiswa.add(20);

        for (int i = 0; i <dataSiswa.size(); i++) {
            if (dataSiswa.get(i) instanceof String) {
                System.out.print("Nama : " + dataSiswa.get(i));
            } else if (dataSiswa.get(i) instanceof Integer) {
                System.out.println(" \t| Usia : " + dataSiswa.get(i));
            }
        }
    }
}
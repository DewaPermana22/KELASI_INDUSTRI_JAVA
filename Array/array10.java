package Array;

public class array10 {

    public static void main(String[] args) {
        String namaSiswa[] = new String[4];
        namaSiswa[0] = "Kenzo Ismail";
        namaSiswa[1] = "Desmon Daffa";
        namaSiswa[2] = "Kayla Isabela";
        namaSiswa[3] = "Khansa Zakira";

        int nilaiSiswa[][] = {
            {81, 90, 62},
            {60, 82, 87},
            {89, 59, 65},
            {77, 75, 60}
        };

        System.out.println("| Nama\t\t|Nilai 1|Nilai 2|Nilai 3|");

        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.print("| " + namaSiswa[i] + "\t| ");
            for (int j = 0; j < nilaiSiswa[i].length; j++) {
                System.out.print(nilaiSiswa[i][j] + "\t| ");
            }
            System.out.println();
        }
    }
}

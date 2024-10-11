package Array;

public class array8 {
    public static void main(String[] args) {
        String nama [][] = {
            {"1", "Sugito", "Prayoga"},
            {"2", "Samirul", "Hilmi"},
            {"3", "Leo", "Hermawan"},
            {"4", "Triawan", "Angga"},
        };
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print(nama[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

package Array;

public class array9 {
    public static void main(String[] args) {
        int angka[][] = {
            {1,2,3,5,6},
            {5,8,9,7,1},
            {9,7,3,7,1},
            {6,8,6,1,4},
            {7,9,2,3,5},
        };
        int jumlah =0;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                jumlah += angka[i][j];
            }
            System.out.print("Penjumlahan Pada Baris " + (i+1) + ": " + jumlah);
            System.out.println();
      }
    }
}

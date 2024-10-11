package Array;

public class array12 {
    public static void main(String[] args) {
        int matrixs[][] = {{4, 5}, {3, 2}};
        int matrix1 [][] = {{6, 2}, {8, 4}};

        int jumlah[][] = new int[2][2];

        System.out.println("matriks a");
        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j <matrixs.length; j++) {
                System.out.print(matrixs[i][j] + "\t");
            }
            System.out.println(" ");
            }

        System.out.println("matriks b");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("hasil matriks a + matriks b : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                jumlah[i][j] = matrixs[i][j] + matrix1[i][j];
                System.out.print(jumlah[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}

package Array;

import java.util.Scanner;

public class array13 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int[][] matrixA = new int[3][2];
      int[][] matrixB = new int[3][2];
      int hasilMatriks[][] = new int[3][2];

      System.out.println("masukkan nilai matriks !");

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print("Masukkan nilai matriks A kolom " + i + " baris " + j + " : " );
            matrixA[i][j] = input.nextInt();
        }
      }
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print("masukkan nilai matrixs B kolom " + i + " baris " + j + " : ");
            matrixB[i][j] = input.nextInt();
        }
      }
      System.out.println("Matriks A : ");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
           System.out.print(matrixA[i][j] + "\t"); 
        }
        System.out.println(" ");
      }
      System.out.println("Matriks B : ");
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(matrixB[i][j] + "\t");
        }
        System.out.println(" ");
      }
      System.out.println("hasil matriks : ");

      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            hasilMatriks[i][j] = matrixA[i][j] + matrixB[i][j];
            System.out.print(hasilMatriks[i][j] + "\t");
        }
        System.out.println(" ");
      }
      input.close();
    }
}

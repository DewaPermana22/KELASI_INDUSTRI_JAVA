import java.util.Scanner;

public class challange4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka1 = 10;
        int angka2 = 10;
        
        System.out.println("Inputkan Angka Pertama Untuk Merubah angka1 : ");
        angka1 += input.nextInt();
        System.out.println("Inputkan Angka Ke dua Untuk Merubah angka2 : ");
        angka2 += input.nextInt();

        System.out.println("\nangka1 : " + angka1);
        System.out.println("angka2 : " + angka2);
        System.out.println("\nangka1 sama dengan angka2 : " + (angka1 == angka2));
        System.out.println("angka1 tidak sama dengan angka2 : " + (angka1 != angka2));
        System.out.println("angka1 lebih kecil angka2 : " + (angka1 < angka2));
        System.out.println("angka1 lebih besar angka2 : " + (angka1 > angka2));
        System.out.println("angka1 kurang dari atau sama dengan angka2 : " + (angka1 <= angka2));
        System.out.println("angka1 lebih dari atau sama dengan angka2 : " + (angka1 >= angka2));

        input.close();
    }
}

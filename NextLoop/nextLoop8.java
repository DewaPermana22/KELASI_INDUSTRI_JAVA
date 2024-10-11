package NextLoop;

public class nextLoop8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int kb = i * j;
                System.out.print(kb + "\t");
            }
            System.out.println();
        }
    }
}
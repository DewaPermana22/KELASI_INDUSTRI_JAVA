package operatorString;

public class OS15 {
    public static void main(String[] args) {
        String kalimat = "HUMMA TECHNOLOGY";
        String kata[] = kalimat.split(" ");
        for (String output : kata) {
            if (output.length() != 0) {
                String output1 = output.substring(0, 1).toUpperCase() + output.substring(1).toLowerCase();
                System.out.println(output1);
            }
        }
    }
}

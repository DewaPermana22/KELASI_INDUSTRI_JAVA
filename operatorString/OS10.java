package operatorString;

public class OS10 {
    public static void main(String[] args) {
        String kalimat = "saya memancing ikan di sungai menggunakan pancingan yang panjang bersama teman saya yang berasal dari malang";
        String kata [] = kalimat.split(" ");
        for (String outputg : kata) {
            System.out.print(outputg + " ");
        }
        System.out.println();
        for (String output : kata) {
            if (output.equals("memancing")) {
                output = "menjaring";
            } else if (output.equals("sungai")) {
                output = "laut";
            } else if (output.equals("teman")) {
                output = "saudara";
            } else if (output.equals("malang")) {
                output = "surabaya";
            }
            System.out.print(output + " ");
        }
    }
}

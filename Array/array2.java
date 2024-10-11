package Array;

import javax.swing.JOptionPane;

public class array2 {
    public static void main(String[] args) {
        String[] nama = new String[5];

        for (int i = 0; i < nama.length; i++) {
            nama[i] = JOptionPane.showInputDialog("Nama Teman anda " + (i+1) + ": ");
        }
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < nama.length; i++) {
            output.append("Nama ").append(i+1).append(": ").append(nama[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, output.toString());
    }
}

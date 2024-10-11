import javax.swing.JOptionPane; 

public class challange3 {
    public static void main(String[] args) {
        
        String nama1 = JOptionPane.showInputDialog("Nama Siswa 1 : ");
        double nilai_1 =  Double.parseDouble(JOptionPane.showInputDialog("Masukan nilai 1 : "));

        String nama2 = JOptionPane.showInputDialog("Nama siswa 2 : ");
        String nilai2 = JOptionPane.showInputDialog("Nilai siswa 2 : ");

        String nama3 = JOptionPane.showInputDialog("Nama siswa 3 : ");
        String nilai3 = JOptionPane.showInputDialog("Nilai siswa 3 : ");

       // double nilai_1 = Double.parseDouble(nilai1);
        double nilai_2 = Double.parseDouble(nilai2);
        double nilai_3 = Double.parseDouble(nilai3);
        

        double averageValue = ( nilai_1 + nilai_2 + nilai_3 ) / 3;
        String averageValue1 = String.format("%.1f", averageValue);


        String output = "Nama Siswa 1 : " + nama1 + "\n" + "Nilai siswa 1 :" + nilai_1 + "\n" + 
        "Nama Siswa 2 : " + nama2 + "\n" + "Nilai siswa 2 : " + nilai_2 + "\n" + "Nama Siswa 3 : " + nama3 + "\n" +
        "Nilai Siswa 3 : " + nilai_3 + "\n" + 
        "RATA RATA : " + averageValue1;

        JOptionPane.showMessageDialog(null, output);

    }
}
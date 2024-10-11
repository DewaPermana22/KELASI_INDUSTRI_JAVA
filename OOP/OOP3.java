package OOP;

public class OOP3 {
    public static void main(String[] args) {
        char[] jawaban_kunci = {'B', 'B', 'A', 'D', 'C', 'B', 'D', 'A', 'B', 'B'};

        char[][] jawabanSiswa = {
            {'A','B','A','C','C','D','D','A','B','B'}, //AHMAD
            {'D','B','C','B','C','B','C','A','C','B'}, //BURHAN
            {'A','A','A','C','C','D','D','A','C','B'}, //CINTIA
            {'B','B','A','B','C','A','D','A','B','B'}, //DONA
            {'A','A','A','B','C','D','C','B','A','B'},
        };

        String namaSiswa[] = {"AHMAD","BURHAN","CINTIA","DONA","EJAVA"};
        for (int i = 0; i < jawabanSiswa.length; i++) {
            int nilai = evaluateScore(jawabanSiswa[i], jawaban_kunci);
            String status = nilai >= 70 ? "LULUS" : "GAGAL";
            System.out.println("Nama : " + namaSiswa[i]);
            System.out.println("Nilai : " + nilai);
            System.out.println("Status : " + status);
            System.out.println();  
        }    
    }
    public static int evaluateScore(char[] jawaban, char[] kunci) {
        int jawabanBenar = 0;
        for (int i = 0; i < jawaban.length; i++) {
            if (jawaban[i] == kunci[i]) {
                jawabanBenar++;
            }
        }
        return jawabanBenar * 10;
    }
}
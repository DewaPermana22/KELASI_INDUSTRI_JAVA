package Array;
import java.util.*;

public class array14 {
    public static void main(String[] args) {
        ArrayList<String> listNama = new ArrayList<>();
        listNama.add("Steve Jobs");
        listNama.add("Bill Gates");
        listNama.add("Mark Zuckeberg");
        listNama.add("Elon Musk");
        System.out.println("Data utuh : ");
        for (int i = 0; i < listNama.size(); i++) {
            System.out.println(listNama.get(i));
        }
        System.out.println("\nData Bill Gates yang di hapus : "); 
        listNama.remove("Bill Gates");
        for (int i = 0; i < listNama.size(); i++) {
            System.out.println(listNama.get(i));
        }
    }
}

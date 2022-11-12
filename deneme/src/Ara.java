import java.awt.*;
import javax.swing.*;
public class Ara {
    public static void main(String arg[]) {
        String []isimler = {"Hakan Aykac", "Murat Akar", "Cenk Gündüz",
                "Cem Daggeçen"};
        String aranacak = JOptionPane.showInputDialog(null,
                "Aradiginiz ismi giriniz: ");
        int index = -1;
        for(int i = 0; i < isimler.length; i++) {
            if(isimler[i].equals(aranacak)) {
                index = i;
                break;
            }
        }
        if(index == -1)
            JOptionPane.showMessageDialog(null, aranacak+" ismi dizide mevcut degildir.");
        else
            JOptionPane.showMessageDialog(null, aranacak+" isminin index numarasi: "+index);
                    System.exit(0);
    }
}

import javax.swing.*;
public class Kayit {
public static void main(String arg[]){

        String kayit_str = JOptionPane.showInputDialog(null, "Kac tane kayit gireceksiniz?:");
        String cikisMesaji = "Herhangi bir anda cikmak icin X'e basin";
        int kayit = Integer.parseInt(kayit_str);

        String isimler[] = new String[kayit];
        for(int i = 0; i < isimler.length; i++) {
            int sayi = i+1;
            String giris = JOptionPane.showInputDialog(null, sayi + ". kaydi giriniz:");
             if(giris.equals('X'))
                 break;
             else
             isimler[i] = giris;
             }

         String mesaj = "isim Listesi\n********";

         for(int i = 0; i < isimler.length; i++) {
             if(isimler[i] != null)
                 mesaj += "\n"+i+" --> "+isimler[i];
             }

         JOptionPane.showMessageDialog(null, mesaj);
         System.exit(0);
         }
 }

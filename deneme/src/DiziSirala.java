import javax.swing.*;
import java.util.Arrays;
import java.lang.System;
class DiziSirala {
    public static void main(String[] args) {
        String liste[] = {"Evren Akar", "Ahmet Aykaç", "Fatih Demir", "Ender Uçkun"};
        String gelenDizi[] = alfabetikSirala(liste);
        diziGoruntule(liste, "Orjinal Dizi");
        diziGoruntule(gelenDizi, "Sirali Dizi");
        System.exit(0);
    }
    public static String[] alfabetikSirala(String [] dizi) {
        String sirali_dizi[] = new String[dizi.length];
        System.arraycopy(dizi, 0, sirali_dizi, 0, dizi.length);
        Arrays.sort(sirali_dizi);
        return sirali_dizi;
    }
    public static void diziGoruntule(String []dizi, String dizi_adi) {
        String mesaj = dizi_adi+" Içerigi\n***************\n\n";
        for(int i = 0; i < dizi.length; i++)
            mesaj += "dizinin "+i+". elemani: "+dizi[i]+"\n";
        JOptionPane.showMessageDialog(null, mesaj);
    }}

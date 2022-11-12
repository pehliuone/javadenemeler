import javax.swing.*;
public class AnaSinif{
    public static void main(String arg[]){
        String isim = JOptionPane.showInputDialog(null, "Lutfen adinizi giriniz");
        int uzunluk = isim.length();
        String mesaj = "Isminiz "+uzunluk+" tane karakterden olusmaktadir";
        JOptionPane.showMessageDialog(null, mesaj);
        String gercekSifre = "kkVVuuNN";
        String girilenSifre = JOptionPane.showInputDialog(null, "Sifreyi giriniz: ");
        boolean sonuc = gercekSifre.equals(girilenSifre);
        JOptionPane.showMessageDialog(null, "Girdiiniz sifre: "+sonuc);
    }
}
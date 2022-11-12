import javax.swing.*;
class Deyimler4 {
    public static void main(String[] args) {
        String yanlisNot = "Yanlis not girisi! Tekrar deneyiniz.";
        String giris = "Bir not giriniz (0 - 100)\nÇikis için notu -1 giriniz";
        String notStr;
        int not;
        notStr = JOptionPane.showInputDialog(null, giris);
        not = Integer.parseInt(notStr);
        while(not != -1) {
            if (not > 100) {
                JOptionPane.showMessageDialog(null, yanlisNot);
            }
            else if (not <= 100 && not > 86) {
                JOptionPane.showMessageDialog(null, "Not: " +
                        not + " Derece: A");
            }
            else if (not <= 85 && not > 71) {
                JOptionPane.showMessageDialog(null, "Not: " +
                        not + " Derece: B");
            }
            else if (not <= 70 && not > 66) {
                JOptionPane.showMessageDialog(null, "Not: " +
                        not + " Derece: C");
            }
            else if (not <= 65 && not > 50) {
                JOptionPane.showMessageDialog(null, "Not: " +
                        not + " Derece: D");
            }
            else {
                JOptionPane.showMessageDialog(null, "Not: " +
                        not + " Derece: F");
            }
            notStr = JOptionPane.showInputDialog(null, giris );
            not = Integer.parseInt(notStr);
        }
        JOptionPane.showMessageDialog(null, "Program Sonlandi.");
        System.exit(0);
    }
}

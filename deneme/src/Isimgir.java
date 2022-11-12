
    import javax.swing.*; //s1
    public class Isimgir {
        public static void main(String arg[]) {
            String isim, yas; //s2
            isim = JOptionPane.showInputDialog(null, "Lutfen isminizi giriniz: "); //s3
            yas = JOptionPane.showInputDialog(null, "Simdi de yasiniz giriniz: "); //s4
            String rapor = "Adiniz: "+isim+"\nYasiniz: "+yas; //s5
            JOptionPane.showMessageDialog(null, rapor); //s6
//JOptionPane.showMessageDialog(null, "Adiniz:\t"+isim+"\nYasiniz:\t"+yas);s7
            System.exit(0);
        }
    }

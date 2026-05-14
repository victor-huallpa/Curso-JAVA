import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        JFrame objFP = new JFrame("Mi primera ventana");
        JFrame objFP = new JFrame("Calsuladora Suma");

        objFP.setContentPane(new frmSum().jpSuma);

        objFP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        objFP.setSize(400,150);

        objFP.setLocationRelativeTo(null);

        objFP.setVisible(true);
        
    }
}

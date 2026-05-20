import javax.swing.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
//        JFrame objFP = new JFrame("Mi primera ventana");
        JFrame objFP = new JFrame("REGSITRO DE USUARIOS");

        objFP.setContentPane(new frmUsu().jpGen);

        objFP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        objFP.setSize(500,400);

        objFP.setLocationRelativeTo(null);

        objFP.setVisible(true);

    }
}

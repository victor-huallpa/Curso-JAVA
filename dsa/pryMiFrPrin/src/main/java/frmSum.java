import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmSum {
    private JButton btnSumar;
    private JTextField entNum;
    public JPanel jpSuma;
    private JPanel jpTitu;
    private JPanel jpEntNum;
    private JPanel jpBot;
    private JLabel lbNum;

    public frmSum() {
        gesEve();
        gesEve8();
    }

    private void gesEve(){
        entNum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "HELLO WOLRD ",
                        "MENSAJE", JOptionPane.INFORMATION_MESSAGE) ;;
            }
        });
    }
    private void gesEve8(){
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "HELLO WOLRD ",
                        "MENSAJE",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}

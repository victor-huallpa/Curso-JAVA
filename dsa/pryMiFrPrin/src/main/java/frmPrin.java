import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPrin {
    public JPanel jpPrin;
    private JPanel jpPagFin;
    private JPanel jpPagCen;
    private JButton btnMostNom;
    private JTextField txtNom;


    public frmPrin() {
//        System.out.println(btnMostNom);
//        System.out.println(txtNom);
//        System.out.println(jpPrin);

        gesEve8();
        gesEve();

    }

    private void gesEve(){
        txtNom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bienvenido: " + txtNom.getText(), "MENSAJE", JOptionPane.INFORMATION_MESSAGE) ;;
            }
        });
    }
    private void gesEve8(){
        btnMostNom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Bienvenido: " + txtNom.getText(),
                        "MENSAJE",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
}

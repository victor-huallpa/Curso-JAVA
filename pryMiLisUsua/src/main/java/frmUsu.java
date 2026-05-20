import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class frmUsu {
    public JPanel jpGen;
    private JTextField txtNomb;
    private JTextField txtApe;
    private JTextField txtId;
    private JPanel jpEntDats;
    private JTextPane tpMos;
    private JPanel jpTexArea;
    private JPanel jpBot;
    private JButton btAgreUsu;
    private JButton btBusUsu;
    private JButton btMosTo;
    private JPanel JpCuerp;
    private JPanel jpInfo;
    private JLabel lbUsua;
    private JLabel lbNumRegis;
    // =========================
    // VARIABLES
    // =========================
    private Vector<clsUsua> listUsua = new Vector<>();
    private int corre = 1;

    // =========================
    // CONSTRUCTOR
    // =========================
    public frmUsu() {
        
        txtId.setEditable(false);
        event();
    }

    // =========================
    // EVENTOS
    // =========================
    private void event() {

        // -------------------------
        // AGREGAR USUARIO
        // -------------------------
        btAgreUsu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nomb = txtNomb.getText();
                String apell = txtApe.getText();

                if (nomb.isEmpty() || apell.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete los campos");
                    return;
                }

                int id = corre;

                clsUsua usu = new clsUsua(nomb, apell, id);
                listUsua.add(usu);

                corre++;

                // Mostrar ID generado
                txtId.setText(String.valueOf(id));

                // Mostrar último usuario en el JTextPane
                tpMos.setText(
                        "Último usuario agregado:\n" +
                                "ID: " + usu.getId() +
                                "\nNombre: " + usu.getNombre() +
                                "\nApellido: " + usu.getApellido()
                );

                // Actualizar contador
                lbNumRegis.setText("Usuarios registrados: " + listUsua.size());

                // Limpiar campos
                txtNomb.setText("");
                txtApe.setText("");
            }
        });

        // -------------------------
        // BUSCAR USUARIO
        // -------------------------
        btBusUsu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (txtId.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese ID");
                    return;
                }

                int idBuscar;

                try {
                    idBuscar = Integer.parseInt(txtId.getText());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "ID inválido");
                    return;
                }

                boolean encontrado = false;

                for (clsUsua u : listUsua) {
                    if (u.getId() == idBuscar) {
                        tpMos.setText(
                                "Usuario encontrado:\n" +
                                        "ID: " + u.getId() +
                                        "\nNombre: " + u.getNombre() +
                                        "\nApellido: " + u.getApellido()
                        );
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    tpMos.setText("Usuario no encontrado");
                }
            }
        });

        // -------------------------
        // MOSTRAR TODOS
        // -------------------------
        btMosTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (listUsua.isEmpty()) {
                    tpMos.setText("No hay usuarios registrados");
                    return;
                }

                String texto = "LISTA DE USUARIOS:\n\n";

                for (clsUsua u : listUsua) {
                    texto += "ID: " + u.getId() + " - "
                            + u.getNombre() + " "
                            + u.getApellido() + "\n";
                }

                tpMos.setText(texto);
            }
        });
    }
}

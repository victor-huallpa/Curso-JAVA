import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

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
//                        "HELLO WOLRD ",
                        evaluar(entNum.getText()),
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
//                        "HELLO WOLRD ",
                        evaluar(entNum.getText()),
                        "MENSAJE",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }
    public static int evaluar(String expr) {
        Stack<Integer> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            // Si es número (puede tener varios dígitos)
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                i--; // corregir índice
                numeros.push(num);
            }

            // Si es operador
            else if (c == '+' || c == '-') {
                while (!operadores.isEmpty() &&
                        prioridad(operadores.peek()) >= prioridad(c)) {
                    aplicarOperacion(numeros, operadores);
                }
                operadores.push(c);
            }
        }

        // Resolver lo que queda
        while (!operadores.isEmpty()) {
            aplicarOperacion(numeros, operadores);
        }

        return numeros.pop();
    }

    public static void aplicarOperacion(Stack<Integer> numeros, Stack<Character> operadores) {
        int b = numeros.pop();
        int a = numeros.pop();
        char op = operadores.pop();

        if (op == '+') {
            numeros.push(a + b);
        } else if (op == '-') {
            numeros.push(a - b);
        }
    }

    public static int prioridad(char op) {
        if (op == '+' || op == '-') return 1;
        return 0;
    }
}

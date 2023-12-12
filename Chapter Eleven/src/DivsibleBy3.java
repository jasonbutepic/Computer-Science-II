import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DivsibleBy3 {
    JFrame frame;
    JPanel contentPane;
    JButton button;
    JLabel label;
    JTextField textField;

    String check;

    public DivsibleBy3() {

        frame = new JFrame("DivisibleBy3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2, 2, 10, 10)); // Use GridLayout with 3 rows and 1 column

        label = new JLabel("Enter a number:");
        label.setHorizontalAlignment(JLabel.CENTER);   
        contentPane.add(label);

        textField = new JTextField(10);
        contentPane.add(textField);

        button = new JButton("Check");
        button.setActionCommand("Check");
        button.addActionListener(e -> {
            String eventName = e.getActionCommand();
            if (eventName.equals("Check")) {
                check = textField.getText();
                if (Integer.parseInt(check) % 3 == 0) {
                    label.setText("Number is divisible by 3.");
                } else {
                    label.setText("Number is not divisible by 3.");
                }
            } else {
                label.setText(" ");
                button.setText("Check");
                button.setActionCommand("Check");
            }
        });
        contentPane.add(button);

        label = new JLabel(" ");
        label.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(label);

        frame.setContentPane(contentPane);

        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        DivsibleBy3 greeting = new DivsibleBy3();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}

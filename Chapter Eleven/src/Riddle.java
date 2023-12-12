import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Riddle {
    JFrame frame;
    JPanel contentPane;
    JButton button;
    JLabel label;

    String riddle = "What is the airspeed velocity of an unladen swallow?";
    String answer = "What do you mean? An African or European swallow?";

    public Riddle() {

        frame = new JFrame("Riddle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2, 2, 0, 10)); // Use GridLayout with 2 rows and 1 column

        button = new JButton("Answer");
        button.setActionCommand("Answer");
        button.addActionListener(e -> {
            String eventName = e.getActionCommand();
            if (eventName.equals("Answer")) {
                label.setText(answer);
            } else {
                label.setText(riddle);
                button.setText("Answer");
                button.setActionCommand("Answer");
            }
        });
        contentPane.add(button);

        label = new JLabel(riddle);
        label.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(label);

        frame.setContentPane(contentPane);

        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        Riddle greeting = new Riddle();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}

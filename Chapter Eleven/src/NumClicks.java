import javax.swing.*;
import java.awt.event.*;

public class NumClicks {
    JFrame frame;
    JPanel contentPane;
    JButton button;

    int numClicks = 0;

    public NumClicks() {

        frame = new JFrame("NumClicks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();

        button = new JButton("Click Me");
        button.addActionListener(e -> {
            numClicks++;
            button.setText("Clicked: " + Integer.toString(numClicks) + " times");
        });
        contentPane.add(button);

        frame.setContentPane(contentPane);

        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        NumClicks greeting = new NumClicks();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}

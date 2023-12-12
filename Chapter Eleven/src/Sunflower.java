import javax.swing.*;
import java.awt.event.*;

public class Sunflower {
    JFrame frame;
    JPanel contentPane;
    JButton button;
    JLabel label;

    String LatinName = "Helianthus";
    String CommonName = "Sunflower";

    public Sunflower() {

        frame = new JFrame("Sunflower");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        button = new JButton("Latin Name");
        button.setActionCommand("Latin Name");
        button.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button.addActionListener(e -> {
            String eventName = e.getActionCommand();
            if (eventName.equals("Latin Name")) {
                label.setText(LatinName);
            } else {
                label.setText(CommonName);
                button.setText("Latin Name");
                button.setActionCommand("Latin Name");
            }
        });
        contentPane.add(button);

        button = new JButton("Common Name");
        button.setActionCommand("Common Name");
        button.setAlignmentX(JButton.CENTER_ALIGNMENT);
        button.addActionListener(e -> {
            String eventName = e.getActionCommand();
            if (eventName.equals("Common Name")) {
                label.setText(CommonName);
            } else {
                label.setText(LatinName);
                button.setText("Common Name");
                button.setActionCommand("Common Name");
            }
        });
        contentPane.add(button);

        label = new JLabel(LatinName);
        label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        contentPane.add(label);

        frame.setContentPane(contentPane);

        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        Sunflower greeting = new Sunflower();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
        }
}

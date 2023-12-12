import javax.swing.*;
import java.awt.event.*;

public class Name {
    final static String NAME = "Seymour Butts";

    JFrame frame;
        JPanel contentPane;
        JLabel label;
        JButton button;
    public Name() {

        frame = new JFrame("Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();

        label = new JLabel(NAME);
        contentPane.add(label);

        button = new JButton("Hide");
        button.setActionCommand("Hide");
        button.addActionListener(e -> {
        String eventName = e.getActionCommand();
        if (eventName.equals("Hide")) {
            label.setText(" ");
            button.setText("Show");
            button.setActionCommand("Show");
        } else {
            label.setText(NAME);
            button.setText("Hide");
            button.setActionCommand("Hide");
        }
        });
        contentPane.add(button);

        frame.setContentPane(contentPane);

        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        Name greeting = new Name();
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
        }
    }
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D_and_D {
    JFrame frame;
    JPanel movePanel, dungeonBoard, contentPane;
    JButton moveUp, moveRight, moveDown, moveLeft, fire, blank;
    JTextField events;
    JLabel label;

    public D_and_D() {

        //for move buttons change it so be sepreate frames for each and display north east south west

        frame = new JFrame("Dungeons and Dragons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        movePanel = new JPanel();
        movePanel.setLayout(new GridLayout(3, 3, 0, 0));
        movePanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        movePanel.setBackground(Color.white);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveUp = new JButton("Up");
        moveUp.setPreferredSize(new Dimension(150, 150));
        movePanel.add(moveUp);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveLeft = new JButton("Left");
        moveLeft.setPreferredSize(new Dimension(150, 150));
        movePanel.add(moveLeft);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveRight = new JButton("Right");
        moveRight.setPreferredSize(new Dimension(150, 150));
        movePanel.add(moveRight);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveDown = new JButton("Down");
        moveDown.setPreferredSize(new Dimension(150, 150));
        movePanel.add(moveDown);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        contentPane.add(movePanel, BorderLayout.CENTER);
        contentPane.setBackground(Color.white);
        frame.add(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        D_and_D game = new D_and_D();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}
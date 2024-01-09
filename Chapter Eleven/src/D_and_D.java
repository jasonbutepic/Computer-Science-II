import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D_and_D {
    JFrame frame;
    JPanel movePanel, dungeonBoard, contentPane;
    JButton moveUp, moveRight, moveDown, moveLeft, fire, blank, spaces[][];
    JTextField events;
    JLabel label;

    public D_and_D() {
        frame = new JFrame("Dungeons and Dragons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        movePanel = new JPanel();
        movePanel.setLayout(new GridLayout(3, 3, 0, 0));
        movePanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);

        moveUp = new JButton("Up");
        moveUp.setPreferredSize(new Dimension(150, 150));

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);

        moveLeft = new JButton("Left");
        moveLeft.setPreferredSize(new Dimension(150, 150));

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);

        moveRight = new JButton("Right");
        moveRight.setPreferredSize(new Dimension(150, 150));

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);

        moveDown = new JButton("Down");
        moveDown.setPreferredSize(new Dimension(150, 150));

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);

        dungeonBoard = new JPanel();
        dungeonBoard.setPreferredSize(new Dimension(1000, 1000));
        dungeonBoard.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        dungeonBoard.setLayout(new GridLayout(10, 10));
        dungeonBoard.setBackground(Color.WHITE);

        spaces = new JButton[10][10]; // Initialize the spaces array

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                spaces[i][j] = new JButton();
                spaces[i][j].setBackground(Color.gray);
                spaces[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                dungeonBoard.add(spaces[i][j]);
            }
        }

        contentPane.add(movePanel, BorderLayout.CENTER);
        contentPane.setBackground(Color.white);
        contentPane.add(dungeonBoard);
        frame.add(contentPane);
        frame.pack();
        frame.setVisible(true);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        D_and_D dnd = new D_and_D();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}
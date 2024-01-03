import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D_and_D {
    JFrame frame;
    JPanel contentPane;
    JButton[][] dungeonBoard;
    JButton moveUp, moveRight, moveDown, moveLeft;
    int rows, columns;

    public D_and_D() {
        frame = new JFrame("Dungeons Dragons Drive-Ins and Dives");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500); 

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(10, 10, 0, 0));
        contentPane.setBorder(BorderFactory.createEmptyBorder(900, 900, 900, 900));

        JPanel Dungeon = new JPanel();
        Dungeon.setLayout(new FlowLayout());

        dungeonBoard = new JButton[10][10];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    dungeonBoard[i][j] = new JButton("uh oh spaghettios");
                    dungeonBoard[i][j].setPreferredSize(new Dimension(50, 50));
                    contentPane.add(dungeonBoard[i][j]);
                }
            }

        frame.setContentPane(contentPane);

        frame.pack();
        frame.setVisible(true);
    }
    
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        D_and_D burger = new D_and_D();
    }
     

    public static void main(String[] args) {
        /* Methods that create and show a GUI should be 
           run from an event-dispatching thread */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }

}

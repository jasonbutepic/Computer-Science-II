import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D_and_D {
    JFrame frame, resultFrame;
    JPanel movePanel, dungeonBoard, textPanel, contentPane, resultPanel;
    JButton moveUp, moveRight, moveDown, moveLeft, fire, blank, spaces[][];
    JTextField events, inventory;
    JLabel label, resultLabel;
    int heroX, heroY, arrowX, arrowY, ropeX, ropeY, dragonX, dragonY, remove, rope = 1, arrow = 0, pitCheck = 0, saveX, saveY;
    boolean pitMessage, dragonMessage, arrowMessage, ropeMessage, arrowCheck, ropeCheck;
    public D_and_D() {
        frame = new JFrame("Dungeons and Dragons and Drive-Ins and Dives");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        movePanel = new JPanel();
        movePanel.setBackground(Color.white);
        movePanel.setLayout(new GridLayout(3, 3, 0, 0));
        movePanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveUp = new JButton("Up");
        moveUp.setPreferredSize(new Dimension(150, 150));
        moveUp.setActionCommand("UP");
        moveUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spaces[heroX][heroY].setBackground(Color.gray);
                saveX = heroX;
                saveY = heroY;
                heroX--;
                heroX = (heroX + 10) % 10;
                heroCheck(heroX, heroY, saveX, saveY);
            }
        });
        movePanel.add(moveUp);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveLeft = new JButton("Left");
        moveLeft.setPreferredSize(new Dimension(150, 150));
        moveLeft.setActionCommand("LEFT");
        moveLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spaces[heroX][heroY].setBackground(Color.gray);
                saveX = heroX;
                saveY = heroY;
                heroY--;
                heroY = (heroY + 10) % 10;
                heroCheck(heroX, heroY, saveX, saveY);
            }
        });
        movePanel.add(moveLeft);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveRight = new JButton("Right");
        moveRight.setPreferredSize(new Dimension(150, 150));
        moveRight.setActionCommand("RIGHT");
        moveRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spaces[heroX][heroY].setBackground(Color.gray);
                saveX = heroX;
                saveY = heroY;
                heroY++;
                heroY = (heroY + 10) % 10;
                heroCheck(heroX, heroY, saveX, saveY);
            }
        });
        movePanel.add(moveRight);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        moveDown = new JButton("Down");
        moveDown.setPreferredSize(new Dimension(150, 150));
        moveDown.setActionCommand("DOWN");
        moveDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spaces[heroX][heroY].setBackground(Color.gray);
                saveX = heroX;
                saveY = heroY;
                heroX++;
                heroX = (heroX + 10) % 10;
                heroCheck(heroX, heroY, saveX, saveY);
            }
        });
        movePanel.add(moveDown);

        blank = new JButton(" ");
        blank.setPreferredSize(new Dimension(150, 150));
        blank.setBackground(Color.white);
        blank.setBorderPainted(false);
        movePanel.add(blank);

        dungeonBoard = new JPanel();
        dungeonBoard.setPreferredSize(new Dimension(800, 800));
        dungeonBoard.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        dungeonBoard.setLayout(new GridLayout(10, 10));
        dungeonBoard.setBackground(Color.WHITE);

        spaces = new JButton[10][10]; // Initialize the spaces array

        resultFrame = new JFrame();
        resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        resultPanel = new JPanel();
        resultPanel.setPreferredSize(new Dimension(600, 100));
        resultPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        resultPanel.setLayout(new GridLayout(1, 1));
        resultPanel.setBackground(Color.WHITE);
        resultFrame.add(resultPanel);

        resultLabel = new JLabel();
        resultPanel.add(resultLabel);

        resultFrame.pack();
        resultFrame.setVisible(false);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                spaces[i][j] = new JButton();
                spaces[i][j].setBackground(Color.gray);
                spaces[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                dungeonBoard.add(spaces[i][j]);
            }
        }

        textPanel = new JPanel();
        textPanel.setPreferredSize(new Dimension(400, 100));
        textPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        textPanel.setLayout(new GridLayout(1, 1));
        textPanel.setBackground(Color.WHITE);

        events = new JTextField();
        events.setEditable(false);
        events.setBackground(Color.WHITE);
        events.setBorder(BorderFactory.createLineBorder(Color.black));
        textPanel.add(events);

        contentPane.add(movePanel, BorderLayout.WEST);
        contentPane.setBackground(Color.white);
        contentPane.add(dungeonBoard);
        contentPane.add(textPanel, BorderLayout.SOUTH);
        frame.add(contentPane);
        frame.pack();
        frame.setVisible(true);

        Placement();
    }

    public void heroCheck(int x, int y, int saveX, int saveY) {
        pitMessage = false;
        dragonMessage = false;
        arrowMessage = false;
        ropeMessage = false;
        arrowCheck = false;
        ropeCheck = false;
        pitCheck = 0;

        
        
        if (spaces[x][((y-1) + 10) % 10].getBackground() == Color.green || spaces[x][((y+1) + 10) % 10].getBackground() == Color.green || spaces[((x-1) + 10) % 10][y].getBackground() == Color.green || spaces[((x+1) + 10) % 10][y].getBackground() == Color.green) {
            if (spaces[x][((y-1) + 10) % 10].getBackground() == Color.green) {
                pitCheck++;
            }
            
            if (spaces[x][((y+1) + 10) % 10].getBackground() == Color.green) {
                pitCheck++;
            } 
            
            if (spaces[((x-1) + 10) % 10][y].getBackground() == Color.green) {
                pitCheck++;
            } 
            
            if (spaces[((x+1) + 10) % 10][y].getBackground() == Color.green) {
                pitCheck++;
            }

            if (pitCheck >= 1) {
                events.setText("There are " + pitCheck + " pits around you!");
            }
        } else if (spaces[x][y-1].getBackground() == Color.red || spaces[x][y+1].getBackground() == Color.red || spaces[x-1][y].getBackground() == Color.red || spaces[x+1][y].getBackground() == Color.red) {
            events.setText("There is a dragon around you!");
        } else if (spaces[x][y-1].getBackground() == Color.orange || spaces[x][y+1].getBackground() == Color.orange || spaces[x-1][y].getBackground() == Color.orange || spaces[x+1][y].getBackground() == Color.orange) {
            events.setText("There is an arrow around you!");
        } else if (spaces[x][y-1].getBackground() == Color.white || spaces[x][y+1].getBackground() == Color.white || spaces[x-1][y].getBackground() == Color.white || spaces[x+1][y].getBackground() == Color.white) {
            events.setText("There is a rope around you!");
        }
    }

    public void Placement() {

        // for checking area around, make sure that the empty space does not have any negatives

        for (int i = 0; i < 10; i++) {
            int pitX = (int) (Math.random() * 10);
            int pitY = (int) (Math.random() * 10);
            spaces[pitX][pitY].setBackground(Color.green);
        }

        do {
            arrowX = (int) (Math.random() * 10);
            arrowY = (int) (Math.random() * 10);
        } while (spaces[arrowX][arrowY].getBackground() != Color.gray);
        spaces[arrowX][arrowY].setBackground(Color.orange);

        do {
            heroX = (int) (Math.random() * 10);
            heroY = (int) (Math.random() * 10);
        } while (spaces[heroX][heroY].getBackground() != Color.gray);
        spaces[heroX][heroY].setBackground(Color.blue);

        do {
            dragonX = (int) (Math.random() * 10);
            dragonY = (int) (Math.random() * 10);
        } while (spaces[dragonX][dragonY].getBackground() != Color.gray);
        spaces[dragonX][dragonY].setBackground(Color.red);

        heroCheck(heroX, heroY, saveX, saveY);
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        D_and_D dungeon = new D_and_D();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
}

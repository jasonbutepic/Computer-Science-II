
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Midterm {
    // make a frame and panel
    int heroX = (int) (Math.random() * 10);
    int heroY = (int) (Math.random() * 10);
    JFrame frame;
    JPanel mainPanel, subPanel, panel1, panel2, panel3;
    JButton up, down, left, right, invisibleButton, text;
    JLabel label;
    String[][] board = new String[10][10];
   

    // make a 10x10 array of buttons
    JButton[][] buttons = new JButton[10][10];


    Midterm() {
        frame = new JFrame("Midterm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // panel 1 (Directional buttons)
        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel1.setLayout(new GridLayout(2, 3));
        panel1.setBackground(Color.WHITE);

        invisibleButton = new JButton(" ");
        panel1.add(invisibleButton);
        invisibleButton.setPreferredSize(new Dimension(100, 100));
        invisibleButton.setBackground(Color.WHITE);
        invisibleButton.setBorderPainted(false);

        up = new JButton("UP");
        panel1.add(up);
        up.setActionCommand("UP");
        up.addActionListener(this::heroMove);
        up.setPreferredSize(new Dimension(100, 100));

        invisibleButton = new JButton(" ");
        panel1.add(invisibleButton);
        invisibleButton.setPreferredSize(new Dimension(100, 100));
        invisibleButton.setBackground(Color.WHITE);
        invisibleButton.setBorderPainted(false);

        left = new JButton("LEFT");
        panel1.add(left);
        left.setActionCommand("LEFT");
        left.addActionListener(this::heroMove);
        left.setPreferredSize(new Dimension(100, 100));

        down = new JButton("DOWN");
        panel1.add(down);
        down.setActionCommand("DOWN");
        down.addActionListener(this::heroMove);

        down.setPreferredSize(new Dimension(100, 100));

        right = new JButton("RIGHT");
        panel1.add(right);
        right.setActionCommand("RIGHT");
        right.addActionListener(this::heroMove);

        right.setPreferredSize(new Dimension(100, 100));

        // panel 2 (grid)
        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(1000, 1000));
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 20, 20, 20));
        panel2.setLayout(new GridLayout(10, 10));
        panel2.setBackground(Color.WHITE);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground(Color.gray);
                buttons[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
                panel2.add(buttons[i][j]);

            }
        }

        panel3 = new JPanel();
        text = new JButton();
        text.setPreferredSize(new Dimension(300, 100));
        text.setBackground(Color.WHITE);
        panel3.add(text);
        panel3.setBackground(Color.WHITE);

        subPanel = new JPanel();
        subPanel.setLayout(new GridLayout(2, 1));
        subPanel.setBackground(Color.WHITE);
        subPanel.add(panel1);
        subPanel.add(panel3);
        mainPanel.setBackground(Color.white);
        mainPanel.add(subPanel);
        mainPanel.add(panel2);
        frame.add(mainPanel, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
        makeBoard();

    }

    // creates the board
    public void makeBoard() {
        // populate board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = "o";
            }
        }

        // pit
        int pitX, pitY;
        for (int i = 0; i < 10; i++) {
            pitX = (int) (Math.random() * 10);
            pitY = (int) (Math.random() * 10);
            board[pitX][pitY] = "P";
        }

        // hero
        boolean heroSpawn = true;

        do {
            heroX = (int) (Math.random() * 10);
            heroY = (int) (Math.random() * 10);

            if (!(board[heroY + 1][heroX] == "P" && board[heroY - 1][heroX] == "P" && board[heroY][heroX + 1] == "P"
                    && board[heroY][heroX - 1] == "P")) {
                heroSpawn = false;
            }
        } while (heroSpawn);
        board[heroY][heroX] = "H";

        // arrow
        boolean arrowSpawn = true;

        int x, y;

        do {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (!(board[x + 1][y] == "P" && board[x - 1][y] == "P" && board[x][y + 1] == "P" && board[x][y - 1] == "P")
                    && board[x][y] != "H") {
                arrowSpawn = false;
            }
        } while (arrowSpawn);
        board[x][y] = "A";

        // dragon
        boolean dragonSpawn = true;
        do {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);

            if (!(board[x + 1][y] == "P" && board[x - 1][y] == "P" && board[x][y + 1] == "P" && board[x][y - 1] == "P")
                    && board[x][y] != "H" && board[x][y] != "A") {
                dragonSpawn = false;
            }
        } while (dragonSpawn);
        board[x][y] = "D";

        boardGUI();
    }

    public void heroMove(ActionEvent event) {
        String eventName = event.getActionCommand();
        // if (eventName.equals("UP")) {
        //     board[heroX][heroY] = "o";
        //     board[heroX][heroY - 1] = "H";
        // } else if (eventName.equals("DOWN")) {
        //     board[heroX][heroY] = "o";
        //     board[heroX][heroY + 1] = "H";
        // } else if (eventName.equals("LEFT")) {
        //     board[heroX][heroY] = "o";
        //     board[heroX - 1][heroY] = "H";
        // } else if (eventName.equals("RIGHT")) {
        //     board[heroX][heroY] = "o";
        //     board[heroX + 1][heroY] = "H";
        // }

        board[heroY][heroX] = "o";

        if (eventName.equals("UP")) {
            heroY--;
        } else if (eventName.equals("DOWN")) {
            heroY++;
        } else if (eventName.equals("LEFT")) {
            heroX--;
        } else if (eventName.equals("RIGHT")) {
            heroX++;
        }

        // Magic room (if < 0, go to max)
        if (heroX < 0) {
            heroX = 9;
        } else if (heroX > 9) {
            heroX = 0;
        }

        if (heroY < 0) {
            heroY = 9;
        } else if (heroY > 9) {
            heroY = 0;
        }

        board[heroY][heroX] = "H";
        boardGUI();
    }

    // turns the board into GUI
    public void boardGUI() {
        ImageIcon hero = new ImageIcon("\\\\fluorine\\2024\\HOME\\20240650\\APCSMidterm\\Midterm\\assets\\hero.png");
        hero = new ImageIcon(hero.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == "H") {
                    buttons[i][j].setIcon(hero);
                } else if (board[i][j] == "P") {
                    buttons[i][j].setText("PIT");
                } else if (board[i][j] == "A") {
                    buttons[i][j].setText("ARROW");
                } else if (board[i][j] == "D") {
                    buttons[i][j].setText("DRAGON");
                } else {
                    buttons[i][j].setText("");
                    // remove icon if there is one
                    buttons[i][j].setIcon(null);
                }
            }
        }
    }

    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        Midterm midterm = new Midterm();
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }

}
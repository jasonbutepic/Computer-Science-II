/*
 * LifeGUI
 * Chapter 11 Exercise 5
 * Lawrenceville Press
 */
 
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;        

public class LifeGUI implements ActionListener {
	public static final int X = 20;
	public static final int Y = 20;
	JFrame frame;
	JPanel contentPane;
	JButton[][] lifeWorld;
	JButton next;
	LifeWorld lifeGame = new LifeWorld();
		
    public LifeGUI() {
        /* Create and set up the frame */
        frame = new JFrame("LifeGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Create a content pane with a GridLayout and empty borders */
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(21, 20, 0, 0));
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
		/* Create and add buttons */
		lifeWorld = new JButton[X][Y];
		for (int xcoord = 0; xcoord < X; xcoord++) {
			for (int ycoord = 0; ycoord < Y; ycoord++) {
				lifeWorld[xcoord][ycoord] = new JButton("O");
				lifeWorld[xcoord][ycoord].setActionCommand(xcoord + " " + ycoord);
				lifeWorld[xcoord][ycoord].addActionListener(new WorldGridListener());
	  		  	contentPane.add(lifeWorld[xcoord][ycoord]);
	  		}
	  	}
	    
		/* add Next button */
	    next = new JButton("Next");
	    next.setActionCommand("next");
	    next.addActionListener(this);
	    contentPane.add(next);

		/* Add content pane to frame */
        frame.setContentPane(contentPane);

        /* Size and then display the frame. */
        frame.pack();
        frame.setVisible(true);
    }
    
    
	/**
	 * Handle Next button
 	 * pre: none
 	 * post: A new life world is displayed.
 	 */
   	public void actionPerformed(ActionEvent event) {
   		String eventName = event.getActionCommand();
   		String[][] next = new String[X][Y];
		
		if (eventName.equals("next")) {
			next = lifeGame.nextDay();
			for (int xcoord = 0; xcoord < X; xcoord++) {
				for (int ycoord = 0; ycoord < Y; ycoord++) {
					lifeWorld[xcoord][ycoord].setText(next[xcoord][ycoord]);
	  			}
	  		}
		}
   	}
   	
   	
   	class WorldGridListener implements ActionListener {
   	
   		/**
   	 	 * Adds a live cell where the user clicks
	   	 * pre: btnCoords is a string with a integer followed by a space
	   	 * followed by a second integer.
   		 * post: A live cell has been added.
	   	 */
	   	public void actionPerformed(ActionEvent event) {
	   		String btnCoords = event.getActionCommand();
	   		int spacePosition, xcoord, ycoord;
	   		
	   		spacePosition = btnCoords.indexOf(" ");
	   		xcoord = Integer.parseInt(btnCoords.substring(0, spacePosition));
	   		ycoord = Integer.parseInt(btnCoords.substring(spacePosition + 1));
	   		lifeGame.addLiveCell(xcoord, ycoord);		//add a live cell
	   		lifeWorld[xcoord][ycoord].setText("X");		//show a live cell
	   	}
	}
   	 

	
	/**
     * Create and show the GUI.
     */
    private static void runGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        LifeGUI playLife = new LifeGUI();
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
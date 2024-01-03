/*
 * LifeWorld class
 */
 
 import java.util.Scanner;
 
 public class LifeWorld {
 	private String[][] world;
 	private static final int x = 20;
 	private static final int y = 20;
 	
 	/**
	 * constructor
	 * pre: none
	 * post: A world has been initialized with no live cells
	 */
	public LifeWorld() {
		
		world = new String[x][y];
		/* create a world with no living cells */
		for (int xcoord = 0; xcoord < world.length; xcoord++) {
			for (int ycoord = 0; ycoord < world[0].length; ycoord++) {
				world[xcoord][ycoord] = "O";
			}
		}
 	}
		

	/** 
	 * A living cell has been placed in the world
	 * pre: The world has been initialized to non-living cells (O)
	 * post: The world contains a new living cell (X)
	 */
	public void addLiveCell(int x, int y) {	

		if (world[x][y].equals("O")) {
			world[x][y] = "X";
		}
	}


	/** 
	 * Displays the next day of the world
	 * pre: The world has been populated
	 * post: The next day of the world has been displayed
	 */
	public String[][] nextDay() {
		String[][] worldCopy = new String[world.length][world[0].length];
		int neighbors;
		
		/* make a copy of the current world */
		for (int xcoord = 0; xcoord < world.length; xcoord++) {
			for (int ycoord = 0; ycoord < world[0].length; ycoord++) {
				worldCopy[xcoord][ycoord] = world[xcoord][ycoord];
			}
		}
		
		/* determine the next day's world */
		for (int xcoord = 1; xcoord < world.length - 1; xcoord++) {
			for (int ycoord = 1; ycoord < world[0].length - 1; ycoord++) {
				neighbors = 0;
				if (world[xcoord-1][ycoord-1].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord-1][ycoord].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord][ycoord-1].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord+1][ycoord-1].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord+1][ycoord].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord+1][ycoord+1].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord][ycoord+1].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord-1][ycoord+1].equals("X")) {
					neighbors += 1;
				}
				if (world[xcoord][ycoord].equals("X")) {
					if (neighbors == 2 || neighbors == 3) {
						worldCopy[xcoord][ycoord] = "X";		//cell remains alive
					} else {
						worldCopy[xcoord][ycoord] = "O";		//cell dies
					}
				} else if (world[xcoord][ycoord].equals("O")) {
					if (neighbors == 3) {
						worldCopy[xcoord][ycoord] = "X";		//cell becomes alive
					} else {
						worldCopy[xcoord][ycoord] = "O";		//cell remains dead
					}
				}
			}
		}
		/* update next day world and return copy */
		for (int xcoord = 0; xcoord < world.length; xcoord++) {
			for (int ycoord = 0; ycoord < world[0].length; ycoord++) {
				world[xcoord][ycoord] = worldCopy[xcoord][ycoord];
			}
		}
		return(world);
	}
 }
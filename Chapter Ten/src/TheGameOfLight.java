

import java.util.Scanner;

public class TheGameOfLight {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("This is the game of Light. \nA grid of your choosing will begin by being populated with all 'O's (off). \nYou will choose a cell based on the row and column. \nThat cell and the surrounding cells (up, down, left, right) will switch from 'O' to 'L' or vice versa. \nYou win the game when all cells are 'L' (lit). \nGood luck!");

            // Ask the player to enter the size of the grid
            int rows = 0;
            int columns = 0;
            while (rows < 3 || rows > 9 || columns < 3 || columns > 9) {
                System.out.print("Enter the rows of the grid (between 3 and 9): ");
                rows = input.nextInt();
                System.out.print("Enter the columns of the grid (between 3 and 9): ");
                columns = input.nextInt();
                if (rows < 3 || rows > 9 || columns < 3 || columns > 9) {
                    System.out.println("Invalid input. Please enter a number between 3 and 9.");
                }
            }

            // Populate the grid with 'O'
            char[][] grid = new char[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    grid[i][j] = 'O';
                }
            }

            // Play the game
            boolean won = false;
            while (!won) {
                // Print the grid
                System.out.println("Current grid:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(grid[i][j] + " ");
                    }
                    System.out.println();
                }

                // Ask the player to choose a cell to click
                int row = 0;
                int col = 0;
                while (row < 1 || row > rows || col < 1 || col > columns) {
                    System.out.print("Enter a row and column to click (separated by a space): ");
                    row = input.nextInt();
                    col = input.nextInt();
                    if (row < 1 || row > rows || col < 1 || col > columns) {
                        System.out.println("Invalid input. Please enter a row and column between 1 and " + rows + ".");
                    }
                }

                // Change the clicked cell and surrounding cells
                row--;
                col--;
                if (grid[row][col] == 'O') {
                    grid[row][col] = 'L';
                } else {
                    grid[row][col] = 'O';
                }
                if (row > 0) {
                    if (grid[row-1][col] == 'O') {
                        grid[row-1][col] = 'L';
                    } else {
                        grid[row-1][col] = 'O';
                    }
                }
                if (row < rows-1) {
                    if (grid[row+1][col] == 'O') {
                        grid[row+1][col] = 'L';
                    } else {
                        grid[row+1][col] = 'O';
                    }
                }
                if (col > 0) {
                    if (grid[row][col-1] == 'O') {
                        grid[row][col-1] = 'L';
                    } else {
                        grid[row][col-1] = 'O';
                    }
                }
                if (col < columns-1) {
                    if (grid[row][col+1] == 'O') {
                        grid[row][col+1] = 'L';
                    } else {
                        grid[row][col+1] = 'O';
                    }
                }

                // Check if all cells are 'L'
                won = true;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if (grid[i][j] == 'O') {
                            won = false;
                            break;
                        }
                    }
                    if (!won) {
                        break;
                    }
                }
                if (won) {
                    System.out.println("Congratulations! You won the game.");
                }
            }

            input.close();
        }
    }
    
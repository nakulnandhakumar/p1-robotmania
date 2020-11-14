package BattleshipGame;

import java.util.ArrayList;

public class Board {

    //Battleship ship;
    public int width;
    public int length;
    public int shipOverlapCount;

    public static final String ANSI_BLUE = "\u001B[34m";     //color schemes for UI of game
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001b[30;1m";

    public ArrayList<ArrayList<Integer>> boardArray = new ArrayList<ArrayList<Integer>>();

    public Board() {
        this(8,8);      //set size of board
    }

    public Board(int boardWidth, int boardLength) {   //constructor for defining size of board
        this.width = boardWidth;
        this.length = boardLength;
    }

    public void createBoard() {

        for (int i = 0; i < this.length; i++) {     //Uses iteration to set 0 values for all positions of Arraylists. Adds arraylist inside arraylist to create 2D arraylist
            boardArray.add(new ArrayList<Integer>());
            for (int j = 0; j < this.width; j++) {
                boardArray.get(i).add(0);
            }
        }
    }

    public void printBoard() {

        //Prints Top row of indices and board
        System.out.print("  ");
        for (int i = 0; i < this.width; i++) {
            System.out.print(ANSI_GREEN + (i+1) + " ");
        }
        System.out.print("\n");


        for (int i = 0; i < this.length; i++) {
            //Side Row of indices and board
            System.out.print(ANSI_GREEN+ (i+1) + ANSI_RESET+ " ");
            for (int point: boardArray.get(i)) {
                switch (point) {
                    case 0:
                        System.out.print(ANSI_BLUE + point + ANSI_RESET + " ");   //game checks for different numbers which mean different things before choosing color to print
                        break;
                    case 1:
                        System.out.print(ANSI_RED + point + ANSI_RESET + " ");
                        break;
                    case 2:
                        System.out.print(ANSI_BLACK + point + ANSI_RESET + " ");
                        break;
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public void setPoint(int row, int column, int value) {  //standard method for setting value @ coordinate
        boardArray.get(row).set(column, value);
    } // sets specific value to coordinate inputted by user

    public int getPoint(int row, int column) {   //gives coordinate so above method can be performed
        return boardArray.get(row).get(column);
    } // gets specific value from coordinate inputted y user

}

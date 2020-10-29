
// Created by Nakul Nandhakumar and Vihan Jayaraman
// GUI created by Nakul
// Code worked on by Nakul and Vihan

package BattleshipGame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BattleshipGUI extends JFrame {
    private JPanel panel1;
    private JButton button18;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button31;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button51;
    private JButton button61;
    private JButton button71;
    private JButton button81;
    private JButton button11;
    private JLabel x1;
    private JLabel x2;
    private JLabel x3;
    private JLabel x4;
    private JLabel x5;
    private JLabel x6;
    private JLabel x7;
    private JLabel x8;
    private JLabel y8;
    private JLabel y7;
    private JLabel y6;
    private JLabel y5;
    private JLabel y4;
    private JLabel y3;
    private JLabel y2;
    private JLabel y1;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button52;
    private JButton button62;
    private JButton button72;
    private JButton button82;
    private JButton button83;
    private JButton button73;
    private JButton button63;
    private JButton button53;
    private JButton button54;
    private JButton button64;
    private JButton button74;
    private JButton button84;
    private JButton button85;
    private JButton button75;
    private JButton button65;
    private JButton button55;
    private JButton button56;
    private JButton button66;
    private JButton button76;
    private JButton button86;
    private JButton button87;
    private JButton button77;
    private JButton button67;
    private JButton button57;
    private JButton button58;
    private JButton button68;
    private JButton button78;
    private JButton button88;



    // private ArrayList<ArrayList<Integer>>
    // initializing all public class variables
    public int boardWidth;
    public int boardLength;
    public int shipNumber;
    public Board board;
    public Board playerBoard;
    public int totalShipLength = 0;

    public int minShipLength = 2;

    //public ArrayList<Ship.Status> shipStatuses = new ArrayList<Ship.Status>();
    //Arraylist that stores ship information
    public ArrayList<Ship> shipList = new ArrayList<Ship>();

    public  BattleshipGUI() {
        //default constructor
    }

    //Main constructor
    public BattleshipGUI(int boardWidth, int boardLength, int shipNumber) {
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
        this.shipNumber = shipNumber;

        this.board = new Board(boardWidth, boardLength);          //defines boards and playerboard as objects

        board.createBoard();


        //adds ships to list (each ship is as large as its number i)
        //this.shipList.add(new Ship(8,Ship.Orientation.HORIZONTAL));
        for (int i = 0; i < shipNumber; i ++) {
            //orientation flips every alternating ship (also checks to see that the ship's length doesn't exceed the board size)
            int tempLength = i + this.minShipLength;
            if (tempLength < boardWidth && tempLength < boardLength) {
                if (i % 2 == 0)
                {
                    this.shipList.add(new Ship(tempLength, Ship.Orientation.VERTICAL));
                }
                else
                {
                    this.shipList.add(new Ship(tempLength, Ship.Orientation.HORIZONTAL));
                }
            }        //calls Ship constructor to initialize ship info using "this." and then adds to arraylist

            else
            {
                this.shipList.add(new Ship(boardWidth, Ship.Orientation.HORIZONTAL));
            }
        }

        for (Ship ship: this.shipList) {  //for loop that totals up enemy ship length to be later used
            this.totalShipLength = this.totalShipLength + ship.length;
        }

        button11.addActionListener(e -> {           //here starts all the 64 button definitions and activation methods
            game(button11.getText(), button11);
        });
        button12.addActionListener(e -> {
            game(button12.getText(), button12);
        });
        button13.addActionListener(e -> {
            game(button13.getText(), button13);
        });
        button14.addActionListener(e -> {
            game(button14.getText(), button14);
        });
        button15.addActionListener(e -> {
            game(button15.getText(), button15);
        });
        button16.addActionListener(e -> {
            game(button16.getText(), button16);
        });
        button17.addActionListener(e -> {
            game(button17.getText(), button17);
        });
        button18.addActionListener(e -> {
            game(button18.getText(), button18);
        });
        button21.addActionListener(e -> {
            game(button21.getText(), button21);
        });
        button22.addActionListener(e -> {
            game(button22.getText(), button22);
        });
        button23.addActionListener(e -> {
            game(button23.getText(), button23);
        });
        button24.addActionListener(e -> {
            game(button24.getText(), button24);
        });
        button25.addActionListener(e -> {
            game(button25.getText(), button25);
        });
        button26.addActionListener(e -> {
            game(button26.getText(), button26);
        });
        button27.addActionListener(e -> {
            game(button27.getText(), button27);
        });
        button28.addActionListener(e -> {
            game(button28.getText(), button28);
        });
        button31.addActionListener(e -> {
            game(button31.getText(), button31);
        });
        button32.addActionListener(e -> {
            game(button32.getText(), button32);
        });
        button33.addActionListener(e -> {
            game(button33.getText(), button33);
        });
        button34.addActionListener(e -> {
            game(button34.getText(), button34);
        });
        button35.addActionListener(e -> {
            game(button35.getText(), button35);
        });
        button36.addActionListener(e -> {
            game(button36.getText(), button36);
        });
        button37.addActionListener(e -> {
            game(button37.getText(), button37);
        });
        button38.addActionListener(e -> {
            game(button38.getText(), button38);
        });
        button41.addActionListener(e -> {
            game(button41.getText(), button41);
        });
        button42.addActionListener(e -> {
            game(button42.getText(), button42);
        });
        button43.addActionListener(e -> {
            game(button43.getText(), button43);
        });
        button44.addActionListener(e -> {
            game(button44.getText(), button44);
        });
        button45.addActionListener(e -> {
            game(button45.getText(), button45);
        });
        button46.addActionListener(e -> {
            game(button46.getText(), button46);
        });
        button47.addActionListener(e -> {
            game(button47.getText(), button47);
        });
        button48.addActionListener(e -> {
            game(button48.getText(), button48);
        });
        button51.addActionListener(e -> {
            game(button51.getText(), button51);
        });
        button52.addActionListener(e -> {
            game(button52.getText(), button52);
        });
        button53.addActionListener(e -> {
            game(button53.getText(), button53);
        });
        button54.addActionListener(e -> {
            game(button54.getText(), button54);
        });
        button55.addActionListener(e -> {
            game(button55.getText(), button55);
        });
        button56.addActionListener(e -> {
            game(button56.getText(), button56);
        });
        button57.addActionListener(e -> {
            game(button57.getText(), button57);
        });
        button58.addActionListener(e -> {
            game(button58.getText(), button58);
        });
        button61.addActionListener(e -> {
            game(button61.getText(), button61);
        });
        button62.addActionListener(e -> {
            game(button62.getText(), button62);
        });
        button63.addActionListener(e -> {
            game(button63.getText(), button63);
        });
        button64.addActionListener(e -> {
            game(button64.getText(), button64);
        });
        button65.addActionListener(e -> {
            game(button65.getText(), button65);
        });
        button66.addActionListener(e -> {
            game(button66.getText(), button66);
        });
        button67.addActionListener(e -> {
            game(button67.getText(), button67);
        });
        button68.addActionListener(e -> {
            game(button68.getText(), button68);
        });
        button71.addActionListener(e -> {
            game(button71.getText(), button71);
        });
        button72.addActionListener(e -> {
            game(button72.getText(), button72);
        });
        button73.addActionListener(e -> {
            game(button73.getText(), button73);
        });
        button74.addActionListener(e -> {
            game(button74.getText(), button74);
        });
        button75.addActionListener(e -> {
            game(button75.getText(), button75);
        });
        button76.addActionListener(e -> {
            game(button76.getText(), button76);
        });
        button77.addActionListener(e -> {
            game(button77.getText(), button77);
        });
        button78.addActionListener(e -> {
            game(button78.getText(), button78);
        });
        button81.addActionListener(e -> {
            game(button81.getText(), button81);
        });
        button82.addActionListener(e -> {
            game(button82.getText(), button82);
        });
        button83.addActionListener(e -> {
            game(button83.getText(), button83);
        });
        button84.addActionListener(e -> {
            game(button84.getText(), button84);
        });
        button85.addActionListener(e -> {
            game(button85.getText(), button85);
        });
        button86.addActionListener(e -> {
            game(button86.getText(), button86);
        });
        button87.addActionListener(e -> {
            game(button87.getText(), button87);
        });
        button88.addActionListener(e -> {
            game(button88.getText(), button88);
        });
    }

    public static void main(String[] args) {
        BattleshipGUI battleShip = new BattleshipGUI(8 ,8, 3);     //creates object of class battleship to run game and call game methods
        battleShip.board.setAIShips(battleShip.shipList);

        JFrame frame = new JFrame("BattleshipGUI");     // instantiates frame object and uses it activate GUI
        frame.setContentPane(battleShip.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); // actually makes the view pop up on a window

    }

    public void shipOverlapAdjust() {   //method to reduce totalShipLength in case of ship overlapping
        totalShipLength--;
    }


    public void game(String string, JButton buttonName) { //main active game method for attacking

        String strX = string.substring(0,1);  //takes user input and converts it to row column coords
        String strY = string.substring(2);

        int X = Integer.parseInt(strX) - 1;
        int Y = Integer.parseInt(strY) - 1;

        int valueOfGuess = board.getPoint(Y,X);
        board.setPoint(Y,X,2);

        System.out.print("\033[2J");

        switch (valueOfGuess) {
            //the player guesses the position of an enemy ship
            case 1:
                buttonName.setForeground(Color.RED);
                buttonName.setBackground(Color.RED);
                totalShipLength--;
                break;
            //the player's guess is empty water
            case 0:
                //changes the spot on the player's board to "already guessed (represented by 2)"
                buttonName.setForeground(Color.GRAY);
                buttonName.setForeground(Color.GRAY);
                break;
            //the player guesses a spot they already picked
            case 2:
                System.out.println("You already attacked that point");
                break;
        }
        if (totalShipLength == 0) {
            System.out.print("WINNER!\n");
        }

        System.out.println("GameBoard");     //prints enemy board
        board.printBoard();
    }

    private static void help() {
        String[] priority_options =
                {"-s number of ships (max 5)",
                        "-b Board Size BOARDWIDTH BOARDLENGTH ex. -b 3 3",
                        "-p number of players (max 2, default is 1) PLAYERNUMBER ex. -p 1",
                        "-h Help Text"
                };

        for (String option: priority_options) {
            System.out.println(option);
        }
    }

}

class Ship {

    public static enum Orientation {VERTICAL,HORIZONTAL}
    public static enum Status {ALIVE, DEAD}

    public Orientation orientation;
    public Status status;

    public ArrayList<ArrayList<Integer>> position;

    public int length;



    //no parameters
    public Ship() {
        this(1,Orientation.VERTICAL, Status.ALIVE);
    }

    //setting only length
    public Ship(int length) {
        this(length, Orientation.VERTICAL, Status.ALIVE);
    }

    //setting orientation and length
    public Ship(int length, Orientation orientation) {
        this(length, orientation, Status.ALIVE);
    }

    //fully defined constructor
    public Ship(int length, Orientation orientation, Status status) {
        this.orientation = orientation;
        this.length = length;
        this.status = status;
    }
}


class Board extends BattleshipGUI{

    //Battleship ship;
    public int boardWidth;
    public int boardLength;
    public int shipOverlapCount;

    public static final String ANSI_BLUE = "\u001B[34m";     //color schemes for UI of game
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLACK = "\u001b[30;1m";

    public ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();

    public Board() {
        this(8,8);      //set size of board
    }

    public Board(int boardWidth, int boardLength) {   //constructor for defining size of board
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
    }

    public void createBoard() {

        for (int i = 0; i < this.boardLength; i++) {     //Uses iteration to set 0 values for all positions of Arraylists. Adds arraylist inside arraylist to create 2D arraylist
            board.add(new ArrayList<Integer>());
            for (int j = 0; j < this.boardWidth; j++) {
                board.get(i).add(0);
            }
        }
    }

    public void printBoard() {

        //Prints Top row of indices and board
        System.out.print("  ");
        for (int i = 0; i < this.boardWidth; i++) {
            System.out.print(ANSI_GREEN + (i+1) + " ");
        }
        System.out.print("\n");


        for (int i = 0; i < this.boardLength; i++) {
            //Side Row of indices and board
            System.out.print(ANSI_GREEN+ (i+1) + ANSI_RESET+ " ");
            for (int point: board.get(i)) {
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
        board.get(row).set(column, value);
    }

    public int getPoint(int row, int column) {   //gives coordinate so above method can be performed
        return board.get(row).get(column);
    }

    public void setPlayerShips(ArrayList<Ship> shipList) { //work in progress for player ships

    }

    public void setAIShips(ArrayList<Ship> shipList) { //method for setting enemy ships
        int randomY;
        int randomX;

        for (Ship i: shipList) {    //for each loop makes sure that each ship in list gets placed on board
            switch(i.orientation) {
                case VERTICAL:

                    randomY = (int) (Math.random() * (boardLength-i.length+1));    //random math integer for Y axis to randomly move ships veritcally
                    System.out.println(randomY);

                    randomX = (int) (Math.random()* (boardWidth));  //random math integer for X axis to move ships randomly horizontally
                    System.out.println(randomX);

                    for (int j = 0; j < i.length; j++) {  //prints enemy ships on board vertically
                        if (board.get(randomY+j).get(randomX) == 1) {
                            shipOverlapAdjust();
                        }
                        board.get(randomY+j).set(randomX,1);
                    }
                    break;

                case HORIZONTAL:

                    randomY = (int) (Math.random() * (boardLength));
                    System.out.println(randomY);

                    randomX = (int) (Math.random()* (boardWidth-i.length+1));
                    System.out.println(randomX);

                    for (int j = 0; j < i.length; j++) {   //prints enemy ships horizontally
                        if (board.get(randomY).get(randomX+j) == 1) {
                            shipOverlapAdjust();
                        }
                        board.get(randomY).set(randomX+j,1);
                    }
                    break;
            }

        }
    }
}

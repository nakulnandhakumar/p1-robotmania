
// Created by Nakul Nandhakumar and Vihan Jayaraman
// GUI created by Nakul
// Code worked on by Nakul and Vihan

package BattleshipGame;


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BattleshipControl extends JFrame {
    // initializing all public class variables
    public int boardWidth;
    public int boardLength;
    public int shipNumber;

    // defines objects for model classes
    public Board board;
    public Ship ship;
    public int totalShipLength;

    // defines object for view class and stack for shiplist
    BattleshipUI battleShipUI;
    public Stack<Ship> shipList;


    //Main constructor
    public BattleshipControl(int boardWidth, int boardLength, int shipNumber) {
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
        this.shipNumber = shipNumber;

        this.board = new Board(boardWidth, boardLength); // instantiates object of model class Board
        board.createBoard(); // creates board using model class Board

        this.ship = new Ship(); // instantiates object of model class Ship

        // Calls method in model class Ship to return info about enemy ships to Stack here in control code
        shipList = ship.addShips(shipNumber, boardWidth, boardLength);
        totalShipLength = ship.getTotalShipLength(); // Calls method in model class Ship to calculate total ship length of enemy

        this.battleShipUI = new BattleshipUI(this);
        JFrame frame = new JFrame("BattleshipGUI");     // instantiates frame object and uses it activate GUI
        frame.setContentPane(battleShipUI.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); // actually makes the view pop up on a window
    }

    public static void main(String[] args) {
        //creates object of class battleship to create new control object that contains both Model and View objects
        BattleshipControl control = new BattleshipControl(8 ,8, 3);
        control.setAIShips(control.shipList, control.board);
    }

    public void setAIShips(Stack<Ship> shipList,Board board) { //method for setting enemy ships
        int randomY;
        int randomX;

        for (Ship i : shipList) {    //for each loop makes sure that each ship in list gets placed on board
            switch (i.orientation) {
                case VERTICAL:
                    randomY = (int) (Math.random() * (board.length - i.length + 1));    //random math integer for Y axis to randomly move ships veritcally
                    randomX = (int) (Math.random() * (board.width));  //random math integer for X axis to move ships randomly horizontally
                    for (int j = 0; j < i.length; j++) {  //prints enemy ships on board vertically
                        if (board.boardArray.get(randomY + j).get(randomX) == 1) {
                            totalShipLength--;
                        }
                        board.boardArray.get(randomY + j).set(randomX, 1);
                    }
                    break;

                case HORIZONTAL:
                    randomY = (int) (Math.random() * (board.length));
                    randomX = (int) (Math.random() * (board.width - i.length + 1));
                    for (int j = 0; j < i.length; j++) {   //prints enemy ships horizontally
                        if (board.boardArray.get(randomY).get(randomX + j) == 1) {
                            totalShipLength--;
                        }
                        board.boardArray.get(randomY).set(randomX + j, 1);
                    }
                    break;
            }
        }
    }


    public void game(String string, JButton buttonName) { //main active recursive game method for attacking

        String strX = string.substring(0,1);  //takes user input and converts it to row column coordinates
        String strY = string.substring(2);

        int X = Integer.parseInt(strX) - 1;
        int Y = Integer.parseInt(strY) - 1;

        int valueOfGuess = board.getPoint(Y,X); // gets the value of coordinate inputted from board with enemy ships
        board.setPoint(Y,X,2); // sets coord value to 2 to represent square already guessed

        System.out.print("\033[2J");

        switch (valueOfGuess) {
            // if the value that was gotten from enemy board was one then use hit a ship
            case 1:
                buttonName.setForeground(Color.RED);
                buttonName.setBackground(Color.RED);
                totalShipLength--; // Every correct guess reduces enemy total ship length by one
                break;
            //if value from enemy board 0, then player hit empty water
            case 0:
                //changes the spot on the player's board to "already guessed (represented by 2)"
                buttonName.setForeground(Color.GRAY);
                buttonName.setForeground(Color.GRAY);
                break;
            //If value was already 2 when they guessed, then player already guessed that point previously
            case 2:
                System.out.println("You already attacked that point");
                break;
        }

        if (totalShipLength == 0) {   // once totalshiplength hits zero, enemy has no more ship spaces so user wins
            System.out.print("WINNER!\n");
            // JFrame window created to display winner message and then close the application
            int m = JOptionPane.showOptionDialog(new JFrame(), "Winner!","Winner", JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, new Object[] {"OK"},JOptionPane.OK_OPTION);
            this.setVisible(false);
            this.dispose();
        }

        System.out.println("GameBoard");
        board.printBoard();     //prints enemy board with enemy ship locations in console for testing purposes

    }

}



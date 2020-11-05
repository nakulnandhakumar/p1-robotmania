
// Created by Nakul Nandhakumar and Vihan Jayaraman
// GUI created by Nakul
// Code worked on by Nakul and Vihan

package BattleshipGame;

import TrioCalculator.CalculatorGUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BattleshipControl extends JFrame {
    // initializing all public class variables
    public int boardWidth;
    public int boardLength;
    public int shipNumber;
    public Board board;
    public Ship ship;
    public int totalShipLength;

    BattleshipUI battleShipUI;
    public ArrayList<Ship> shipList = new ArrayList<Ship>();


    //Main constructor
    public BattleshipControl(int boardWidth, int boardLength, int shipNumber) {
        this.boardWidth = boardWidth;
        this.boardLength = boardLength;
        this.shipNumber = shipNumber;

        this.board = new Board(boardWidth, boardLength);          //defines boards as object
        board.createBoard();

        this.ship = new Ship();
        shipList = ship.addShips(shipNumber, boardWidth, boardLength);
        totalShipLength = ship.getTotalShipLength();

        this.battleShipUI = new BattleshipUI(this);
        JFrame frame = new JFrame("BattleshipGUI");     // instantiates frame object and uses it activate GUI
        frame.setContentPane(battleShipUI.panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); // actually makes the view pop up on a window
    }

    public static void main(String[] args) {
        BattleshipControl control = new BattleshipControl(8 ,8, 3);     //creates object of class battleship to run game and call game methods
        control.setAIShips(control.shipList, control.board);
    }

    public void setAIShips(ArrayList<Ship> shipList,Board board) { //method for setting enemy ships
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

}



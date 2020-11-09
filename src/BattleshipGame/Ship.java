package BattleshipGame;

import java.util.*;

public class Ship {
    public static enum Orientation {VERTICAL,HORIZONTAL}
    public static enum Status {ALIVE, DEAD}

    public Orientation orientation;
    public Status status;

    public int minShipLength = 2;

    //Arraylist that stores ship information
    public Stack<Ship> shipList = new Stack<Ship>();
    public ArrayList<ArrayList<Integer>> position;

    public int length;
    public int totalShipLength = 0;



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

    public Stack<Ship> addShips(int shipNumber, int boardWidth, int boardLength) {
        //adds ships to list (each ship is as large as its number i)
        //this.shipList.add(new Ship(8,Ship.Orientation.HORIZONTAL));
        for (int i = 0; i < shipNumber; i++) {
            //orientation flips every alternating ship (also checks to see that the ship's length doesn't exceed the board size)
            int tempLength = i + this.minShipLength;
            if (tempLength < boardWidth && tempLength < boardLength) {
                if (i % 2 == 0) {
                    this.shipList.push(new Ship(tempLength, Ship.Orientation.VERTICAL));
                }
                else
                {
                    this.shipList.push(new Ship(tempLength, Ship.Orientation.HORIZONTAL));
                }
            }
            //calls Ship constructor to initialize ship info using "this." and then adds to arraylist
            else
            {
                this.shipList.push(new Ship(boardWidth, Ship.Orientation.HORIZONTAL));
            }
        }
        return shipList;
    }

    public int getTotalShipLength(){
        for (Ship ship : this.shipList) {  //for loop that totals up enemy ship length to be later used
            this.totalShipLength = this.totalShipLength + ship.length;
        }
        return  totalShipLength;
    }
}

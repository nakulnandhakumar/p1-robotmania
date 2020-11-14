package ConnectFourGame;

import java.util.Arrays;


public class ConnectFourAlgorithm
{
    private final int numRows = 6, numCols = 7;
    private final char playerOne = 'X', playerTwo = 'Y';
    private char[][] gameboard;
    private boolean playerOneTurn;

    public ConnectFourAlgorithm(){
        gameboard = new char[numRows][numCols];
        playerOneTurn = true;

        // fill the 2D array with spaces
        for (char[] row : gameboard)
        {
            Arrays.fill(row, ' ');
        }

    }
   /* public static void main(String[] args)
    {
        // game variables
        boolean restart = true;
        Scanner keyboard = new Scanner (System.in);

        while (restart)
        {
            boolean winner = false;

            while (!winner)
            {
                playerOneTurn = !playerOneTurn;
                printGameboard(gameboard);
                playerTurn(keyboard, playerOneTurn, gameboard);
                winner = checkForWin(playerOneTurn, gameboard);
            }
            printGameboard(gameboard);
            System.out.println((playerOneTurn ? playerOne : playerTwo) + " won!");
            System.out.println("Do you want to play again true/false?");
            restart = keyboard.nextBoolean();
        }
    }
    */



    public int markBoard(int colNum)
    {
        for(int row = numRows - 1; row >= 0; row--)
        {
            if(gameboard[row][colNum] == ' ')
            {
                gameboard[row][colNum] = playerOneTurn ? playerOne : playerTwo;
                return row;
            }
        }
        return 0;
    }
    public boolean checkForWin()
    {
        int count = 0;
        for(int row = 0; row < numRows; row++)
        {
            for(int col = 0; col < numCols; col++)
            {
                if(gameboard[row][col] == (playerOneTurn ? playerOne : playerTwo))
                {
                    count++;
                    if(count == 4)
                    {
                        return true;
                    }
                }
                else
                {
                    count = 0;
                }
            }
        }
        for(int col = 0; col < numCols; col++)
        {
            for(int row = 0; row < numRows; row++)
            {
                if(gameboard[row][col] == (playerOneTurn ? playerOne : playerTwo)) //ternary operator (really tiny if/else statement)
                {
                    count++;
                    if(count == 4)
                    {
                        return true;
                    }
                }
                else
                {
                    count = 0;
                }
            }
        }
        //check upward diagonal... not need to check all rows
        for(int row = 0; row < numRows-3; row++) {
            for(int col = 0; col < numCols-3; col++)
            {
                char player = playerOneTurn ? playerOne : playerTwo ;
                if( gameboard[row][col] == player && gameboard[row+1][col+1]  == player &&
                        gameboard[row+2][col+2] == player && gameboard[row+3][col+3]  == player)
                {
                    return true;
                }
            }
        }
        //check downward diagonal . no need to check all rows
        for(int row = 3; row < numRows; row++)  {
            for(int col = 0; col < numCols-3; col++)
            {
                char player = playerOneTurn ? playerOne : playerTwo ;
                if( gameboard[row][col] == player && gameboard[row-1][col+1]  == player &&
                        gameboard[row-2][col+2] == player && gameboard[row-3][col+3]  == player)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean getPlayerOneTurn() {
        return playerOneTurn;
    }
    public void setPlayerOneTurn(){
        playerOneTurn = !playerOneTurn;
    }
}
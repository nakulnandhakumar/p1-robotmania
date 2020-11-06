package OldReplCode;

public class Loopy {
    /** main
     * entry point when testing
     */
    public static void main(String[] args)  {
        new RobotLoop().printPoem();   //a new robot list and output in one step
    }
}

/**
 * Class for Robots: a 2D array of Robots
 * As well as method to print the Poem
 */
class RobotLoop {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
  String [][] robots;  


    public RobotLoop() {
        //Storing Data in 2D arrays
        robots = new String[][]{   //2D array above is just a name, "new" makes a container ("object")
                //Robot 0
      {"       [ ]        ",   
       "      (. .)       ", 
       " <]    |>|    [>  ",
       "  \\\\__/===\\__//   ",
       "   \\\\| o=o |//    ",
       "     | o=o |      ",  
       "     \\=====/      ",
       "    / / | \\ \\     ",
       "   <_________>    ",
       "        MARY      "
       },
                //Robot 1
      {"       [ ]        ",   
       "      (. .)       ", 
       " <]    |>|    [>  ",
       "  \\\\__/===\\__//   ",
       "   \\\\| o=o |//    ",
       "     | o=o |      ",  
       "     \\=====/      ",
       "    / / | \\ \\     ",
       "   <_________>    ",
       "       KERRY      "
       },
                //Robot 2
      {"       [ ]        ",   
       "      (. .)       ", 
       " <]    |>|    [>  ",
       "  \\\\__/===\\__//   ",
       "   \\\\| o=o |//    ",
       "     | o=o |      ",  
       "     \\=====/      ",
       "    / / | \\ \\     ",
       "   <_________>    ",
       "       LARRY      "
       },
                //Robot 3
      {"       [ ]        ",   
       "      (. .)       ", 
       " <]    |>|    [>  ",
       "  \\\\__/===\\__//   ",
       "   \\\\| o=o |//    ",
       "     | o=o |      ",  
       "     \\=====/      ",
       "    / / | \\ \\     ",
       "   <_________>    ",
       "       HARRY      "
       },

      };

    }


    public void printPoem() {
        //begin the poem
        System.out.println();
        System.out.println("Robot Poem in Java Loopy");



        int robotCount = robots.length;
        for (int i = robotCount; i >= 1; i--)
        {

          
            System.out.println(i + " little robots dancing on the bed...");

            
            for (int col = 0; col < robots[0].length; col++) {  //cycles through "cells" of 2d array

                /*cycles through rows to print
                each robot part by part, will eventually print each row*/
                for (int row = 0; row < robotCount; row++) {

                    // prints specific part of the monkey from the column
                    System.out.print(ANSI_GREEN + robots[row][col] + ANSI_RESET + " ");
                }

                //this new line gives separation between parts of robots
                System.out.println();
            }

            //countdown for poem, decrementing robotCount variable by 1 and added timer for dealy
            robotCount -= 1;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

        //out of all the loops, prints finishing messages
        System.out.println("No more robots dancing on the bed");
        System.out.println("---------------------------------");
        System.out.println("             THE END             ");
    }

}
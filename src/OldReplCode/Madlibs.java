package OldReplCode;// Creator: Sara Beniwal
// Robot-Themed Madlibs Game

import java.util.Scanner;

public class Madlibs
{
  public static void main(String[] args)
  {
    boolean restart = true; //boolean to be used to confirm restart at the end of code


    Scanner keyboard = new Scanner (System.in); // scanner necessary for user input; allows user to enter values
  
  while (restart) //while loop; part of restart code
  {
    System.out.println("Welcome to Robot-Themed Madlibs! Enter the asked part of speech/type of word to generate a fun story at the end!"); // welcome page; brief explanation of game
  
    System.out.println("Please enter a name for a male character:");
    String robotName = keyboard.nextLine(); // entered value stored as strings (in this case, robotName)

    System.out.println("Please enter a name of a town (it can be real or imaginary):"); // town name
    String townName = keyboard.nextLine();

    System.out.println("Please enter a grade(like in school) but in ordinal number form (ex: first, second, third):"); // grade
    String grade = keyboard.nextLine();

    System.out.println("Please enter an emotion:"); // emotion
    String firstEmotion = keyboard.nextLine();
    
    System.out.println("Please enter an adjective:"); // adjective
    String firstAdjective = keyboard.nextLine();

    System.out.println("Enter a common catchphrase (ex: hey, hey, hey)"); // common catchphrase
    String catchphrase = keyboard.nextLine();

    System.out.println("Please enter another adjective:"); // adjective
    String secondAdjective = keyboard.nextLine();

    System.out.println("Please enter an object in its plural form (ex: face masks):"); // object in plural form
    String objectPlural = keyboard.nextLine();

    System.out.println("Please enter the name of one of your AP Comp Sci classmates:"); // name of classmate
    String firstName = keyboard.nextLine();

    System.out.println("Please enter the name of someone else in AP Comp Sci:"); // name of another classmate
    String secondName = keyboard.nextLine();

    System.out.println("Please enter the name of someone else in AP Comp Sci (not a name entered previously):"); // name of another classmate
    String thirdName = keyboard.nextLine();

    System.out.println("Please enter an occupation (job) in its plural form (ex: doctors):"); // occupation
    String occupation = keyboard.nextLine();

    System.out.println("Please enter a different emotion:"); // emotion
    String secondEmotion = keyboard.nextLine();

    System.out.println("Please enter an action in the past tense form (ex: threw):"); // action in past tense
    String action = keyboard.nextLine();

    System.out.println("Your story has been generated. Please enter any text into the terminal to continue. The green-colored words indicate the ones you entered."); // transition
    String confirmGeneration = keyboard.nextLine();

    System.out.println("There once was a robot named " + "\u001B[32m" + robotName + "\u001B[0m" + ". He lived in the town of " + "\u001B[32m" + townName + "\u001B[0m" + ". This year, he would be a " + "\u001B[32m" + grade + "\u001B[0m" + " grader at Del Norte High School. He was very " + "\u001B[32m" + firstEmotion + "\u001B[0m" + " to be taking AP Comp Sci A with Mr. Mortensen who he thought was very " + "\u001B[32m" + firstAdjective + "\u001B[0m" + ". On the first day of class, " + "\u001B[32m" + robotName + "\u001B[0m" + " decided to turn his mic on in the middle of Mr. M's presentation and say " + "\u001B[32m" + catchphrase + "\u001B[0m" + ". Mr. M was " + "\u001B[32m" + secondAdjective + "\u001B[0m" + " at first, but continued talking about project-based learning. When the class broke into scrum teams to make their two truths and a lie video, " + "\u001B[32m" + robotName + "\u001B[0m" + " threw up " + "\u001B[32m" + objectPlural + "\u001B[0m" + " which shocked his teammates " + "\u001B[32m" + firstName + "\u001B[0m" + ", " + "\u001B[32m" + secondName + "\u001B[0m" + ", and " + "\u001B[32m" + thirdName + "\u001B[0m" + ". By the end of class, Mr. M and the other " + "\u001B[32m" + occupation + "\u001B[0m" + " were " + "\u001B[32m" + secondEmotion + "\u001B[0m" + " of his antics. They " + "\u001B[32m" + action + "\u001B[0m" + " him out of the Zoom room. When " + "\u001B[32m" + robotName + "\u001B[0m" + " tried to rejoin, he was forever left in the waiting room."); // final story; color added to distinguish user-entered words from the story text
    
    System.out.println("Do you want to play again true/false?");
    restart = keyboard.nextBoolean(); // allows user to enter true/false; true means code runs again, false stops the code
  }
  }
}
/* Mad Libs Story Outline:

There once was a robot named ______(name)_________. He lived in the town of ___(town name)______. This year, he would be a ___(grade)_______ grader at Del Norte High School. He was very ____(emotion)_____ to be taking AP Comp Sci A with Mr. Mortensen who he thought was very ______(adjective). On the first day of class, (name) decided to turn his mic on in the middle of Mr. M’s presentation and say “___(common catchphrase)____”. Mr. M was ___(adjective)___ at first, but continued talking about project-based learning. When the class broke into scrum teams to make their two truths and a lie video, (name) threw up ___(object→ plural)____  which shocked his teammates __(name of someone in class 1)___, __(name of someone in class 2), and ___(name of someone in class 3)___. By the end of class, Mr. M and the other __(occupation plural)___ were ___(emotion)____ of his antics. They ___(action past tense) him out of the Zoom room. When (name) tried to rejoin, he was forever left in the waiting room.

*/
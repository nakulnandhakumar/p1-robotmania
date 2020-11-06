package OldReplCode;//Created by Sanvi
//Word Scrambler

import java.util.*;
import java.lang.*;


public class RoboScramble {
  public static void main(String[] args) {
    // asks for user input
    System.out.println("Player 1, type in your word.");


    //takes in input
    Scanner kboard = new Scanner(System.in);


    //intializes type String variable with the input
    String word = kboard.next();


    /**creates scramble variable which is the same as word. This is because scramble will be manipulated and we need to maintain the content of word for comparison at the end*/
    String scramble = word;


    //Set the characters of the string into an ArrayList
    ArrayList<Character> w = new ArrayList<Character>();
    for(int i = 0; i < scramble.length(); i++){
      w.add(scramble.charAt(i));
    }


    // Shuffle elements of ArrayList by calling Java's Collections.shuffle() method
    Collections.shuffle(w);


    //Call getString Method and print shuffled word
    System.out.println(getString(w));

  
    //Take in user input for response
    System.out.println("Player 2, guess the word");
    Scanner kboard1 = new Scanner(System.in);
    String response = kboard1.next();
    

    //Compare response to original word and reveal whether player won
      if (response.equals(word)){
        System.out.println("Congrats, you are correct!");
      }else{
        System.out.println("Sorry, better luck next time.");
    }



  }
  

  //Concatenate arraylist elements to form a string
  static String getString(ArrayList<Character> w){
    StringBuilder builder = new StringBuilder(w.size());
    for (Character ch : w){
      builder.append(ch);
    }
    return builder.toString();
  }


}

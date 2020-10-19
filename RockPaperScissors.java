import java.util.Random;
import java.util.Scanner;
/**
 * Class RockPaperScissors
 */
public class RockPaperScissors {
  public static void main(String[] args) {
    
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Play Rock, Paper Scissors.");
      System.out.println("Enter 1 for Rock");
      System.out.println("2 for Scissors");
      System.out.println("3 for Paper");
      
      // this Declare the int 
      int compRand;
      int userNum;
      
      while ( 1 == 1 ){
        compRand = (int)(Math.random()*3)+1;
        userNum = userInput.nextInt();
        
      if (userNum == 1) {
        System.out.println("You played Rock.");
        if (compRand == 1) {
          System.out.println("Draw.");
        } else if (compRand == 2) {
          System.out.println("You Win, Computer played Scissors.");
        }
        else if (compRand == 3) {
          System.out.println("You Lose, Computer played Paper. ");
        }
      }
      if (userNum == 2) {
        System.out.println("You played Scissors.");
        if (compRand == 1) {
          System.out.println("You Lose, Computer played Rock.");
        }
        else if (compRand == 2) {
          System.out.println("Draw.");
        }
        else if (compRand == 3) {
          System.out.println("You Win, Computer played Paper. ");
        }
      } 
      if (userNum == 3) {
        System.out.println("You played Paper.");
        if (compRand == 1) {
          System.out.println("You Win, Computer played Rock.");
        }
        else if (compRand == 2) {
          System.out.println("You Lose, Computer played Scissors.");
        }
        else if (compRand == 3) {
          System.out.println("Draw. ");
        }
      }
    }   
  }
}